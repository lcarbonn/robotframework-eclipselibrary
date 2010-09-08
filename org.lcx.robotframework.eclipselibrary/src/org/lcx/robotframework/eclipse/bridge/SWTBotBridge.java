/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.bridge;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.lcx.robotframework.swtbot.commons.AbstractSWTBotObject;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.waits.ICondition;

public class SWTBotBridge {

	private static boolean debug = false;
	private static boolean startingdebug = false;
	
	private static ClassLoader SWTBOTCLASSLOADER = null;
	private static Object SWTWORKBENCHBOT = null;
	
	private static boolean ISBRIDGEINITIATED = false;
	
	private SWTBotBridge() {
		super();
	}
	
	public static Class<?> loadClass(String className) throws NoSuchMethodException, Exception {
		if(SWTBOTCLASSLOADER==null) {
			SWTWorkbenchBot.getSWTWorkbenchBot();
		}
		Class<?> c = SWTBOTCLASSLOADER.loadClass(className);

		return c;
	}

	public static Object newInstance(String className) throws SWTBotBridgeException {
		try {
			Class<?> c = loadClass(className);
			Object instance = c.newInstance();
			return instance;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SWTBotBridgeException(e);
		}
	}
	
	public static Object callStaticMethod(String className, String methodName, Object... parameters) throws SWTBotBridgeException {
		if(debug) System.out.println("=====================================");
		
		try {
			Class<?>[] parameterTypes = new Class[parameters.length];
			for (int i = 0; i < parameters.length; i++) {
				if(parameters[i] instanceof Class<?> ) {
					throw new SWTBotBridgeException("Object is a class, should call another method");
				}
				parameterTypes[i] = getClass(parameters[i]);
			}
			if(debug) {
				System.out.println("called static method="+methodName);
				for (int i = 0; i < parameters.length; i++) {
					System.out.println("\t with param="+parameters[i]+", of class="+parameterTypes[i]);
				}
				System.out.println("\t of class="+className);
			}
			
			Class<?> c = loadClass(className);

			Method method = c.getMethod(methodName, parameterTypes);
			method.setAccessible(true);
			
			Object o = method.invoke(parameters);
			return o;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SWTBotBridgeException(e);
		}
	}
	
	public static Object callMethod(Object instance, String methodName, Object... parameters) throws SWTBotBridgeException {
		if(debug) System.out.println("=====================================");
		
		try {
			Object[] params = new Object[parameters.length];
			Class<?>[] parameterTypes = new Class[parameters.length];
			for (int i = 0; i < parameters.length; i++) {
				if(parameters[i] instanceof Class<?> ) {
					throw new SWTBotBridgeException("Object is a class, should call another method");
				}
				if(parameters[i] instanceof ICondition) {
					parameterTypes[i] = loadClass("org.eclipse.swtbot.swt.finder.waits.ICondition");
					params[i] = ((AbstractSWTBotObject)parameters[i]).getDistantObject();
				} else {
					parameterTypes[i] = getClass(parameters[i]);
					params[i] = parameters[i];
				}
			}
			if(debug) {
				for(Method m : instance.getClass().getMethods()) {
					System.out.println("method="+m);
					for(Class<?> c : m.getParameterTypes()) {
						System.out.println("\tparamTypeClass="+c);
					}
				}
				System.out.println("called method="+methodName);
				for (int i = 0; i < parameters.length; i++) {
					System.out.println("\t with param="+parameters[i]+", of class="+parameterTypes[i]);
				}
				System.out.println("\t on instance of class="+instance.getClass().getName());
			}
			
			Method method = instance.getClass().getMethod(methodName, parameterTypes);
			method.setAccessible(true);
			
			Object o = method.invoke(instance, params);
			return o;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SWTBotBridgeException(e);
		}
	}

	public static Object callMethodWithArray(Object instance, String methodName, Object arrayParameter) throws SWTBotBridgeException {
		if(debug) {
			System.out.println("=====================================");
			System.out.println("called method="+methodName+", parametersClass="+arrayParameter.getClass().getName());
			System.out.println("\t on instance of class="+instance.getClass().getName());
		}

		if(!arrayParameter.getClass().isArray()) {
			throw new SWTBotBridgeException("Method callMethodWithArray should be called with a array as parameter");
		}
		
		try {
			if(debug) {
				for(Method m : instance.getClass().getMethods()) {
					System.out.println("method="+m);
					for(Class<?> c : m.getParameterTypes()) {
						System.out.println("\tparamTypeClass="+c);
					}
				}
			}
			
			Method method = instance.getClass().getMethod(methodName, arrayParameter.getClass());
			//parameters passed with (Object) instead of Object[] to pass it as one single array object
			Object o = method.invoke(instance, (Object)arrayParameter);
			return o;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SWTBotBridgeException(e);
		}
	}

	@SuppressWarnings("unchecked")
	public static List<?> callMethodReturnPrimitiveList(Object instance, String methodName, Object... parameters) throws SWTBotBridgeException {
		List ls = new ArrayList();
		Object o = SWTBotBridge.callMethod(instance, methodName, parameters);

		Object iterator = SWTBotBridge.callMethod(o, "iterator");
		while((Boolean)SWTBotBridge.callMethod(iterator, "hasNext")) {
			Object item = SWTBotBridge.callMethod(iterator, "next");

			System.out.println("line="+item);

			ls.add(item);
		}
		return ls;

	}
	
	public static List<?> callMethodReturnSWTBotList(Object instance, String methodName, Class<?> clazz, Object... parameters) throws SWTBotBridgeException {
		try {
			List<Object> ls = new ArrayList<Object>();
			Object o = SWTBotBridge.callMethod(instance, methodName, parameters);
			
			Object iterator = SWTBotBridge.callMethod(o, "iterator");
			while((Boolean)SWTBotBridge.callMethod(iterator, "hasNext")) {
				Object item = SWTBotBridge.callMethod(iterator, "next");

				System.out.println("line="+item);

				Constructor<?> c = clazz.getDeclaredConstructor(Object.class);
				AbstractSWTBotObject localO = (AbstractSWTBotObject)c.newInstance(item);
				ls.add(localO);
			}
			return ls;
		} catch (Exception e) {
			throw new SWTBotBridgeException(e);
		}
	}

	public static Object[] callMethodReturnSWTBotArray(Object instance, String methodName, Class<?> clazz, Object... parameters) throws SWTBotBridgeException {
		try {
			Object[] o = (Object[])SWTBotBridge.callMethod(instance, methodName, parameters);
			Object[] lo = new Object[o.length];
			int i = 0;
			for (Object distO : o) {

				System.out.println("line="+distO);

				Constructor<?> c = clazz.getDeclaredConstructor(Object.class);
				AbstractSWTBotObject localO = (AbstractSWTBotObject)c.newInstance(distO);
				lo[i] = localO;
				i++;
			}
			return lo;
//			return callMethodReturnSWTBotList(instance, methodName, clazz, parameters).toArray();
		} catch (Exception e) {
			throw new SWTBotBridgeException(e);
		}
	}
	
	private static Class<?> getClass(Object o) {
		Class<?> clazz = o.getClass();
		String name= clazz.getName();
		if (Byte.class.getName().equals(name)) {
			clazz = byte.class;
		} else if(Short.class.getName().equals(name)) {
			clazz = short.class;
		} else if (Integer.class.getName().equals(name)) {
			clazz = int.class;
		} else if (Long.class.getName().equals(name)) {
			clazz = long.class;
		} else if (Float.class.getName().equals(name)) {
			clazz = float.class;
		} else if (Double.class.getName().equals(name)) {
			clazz = double.class;
		} else if (Boolean.class.getName().equals(name)) {
			clazz = boolean.class;
		} else if (Character.class.getName().equals(name)) {
			clazz = char.class;
		}
		return clazz;
	}

	public static Object getStaticField(String className, String fieldName) throws SWTBotBridgeException {
		if(debug) System.out.println("=====================================");
		
		try {
			if(debug) {
				System.out.println("called get static field="+fieldName);
				System.out.println("\t of class="+className);
			}
			
			Class<?> c = loadClass(className);

			Field field = c.getField(fieldName);
//			field.setAccessible(true);
			
			Object o = field.get(null);
			return o;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SWTBotBridgeException(e);
		}
	}
	
	public static void setStaticField(String className, String fieldName, Object value) throws SWTBotBridgeException {
		if(debug) System.out.println("=====================================");
		
		try {
			if(debug) {
				System.out.println("called set static field="+fieldName+", value="+value);
				System.out.println("\t of class="+className);
			}
			
			Class<?> c = loadClass(className);

			Field field = c.getField(fieldName);
//			field.setAccessible(true);
			
			field.set(null, value);
		} catch (Exception e) {
			e.printStackTrace();
			throw new SWTBotBridgeException(e);
		}
	}


	public static void setSWTBOTCLASSLOADER(ClassLoader sWTBOTCLASSLOADER) {
		if(startingdebug) {
			System.out.println("SWTBOTCLASSLOADER cl before="+SWTBOTCLASSLOADER);
		}
		SWTBOTCLASSLOADER = sWTBOTCLASSLOADER;
		if(sWTBOTCLASSLOADER==null) {
			ISBRIDGEINITIATED = false;
		}

		if(startingdebug) {
			System.out.println("SWTBOTCLASSLOADER cl after ="+SWTBOTCLASSLOADER);
		}
	}


	public static boolean isISBRIDGEINITIATED() {
		return ISBRIDGEINITIATED;
	}


	public static Object getSWTWORKBENCHBOT() {
		return SWTWORKBENCHBOT;
	}


	public static void setSWTWORKBENCHBOT(Object sWTWORKBENCHBOT) {
		if(startingdebug) {
			System.out.println("SWTWORKBENCHBOT before="+SWTWORKBENCHBOT);
		}
		
		SWTWORKBENCHBOT = sWTWORKBENCHBOT;
		ISBRIDGEINITIATED = (sWTWORKBENCHBOT!=null);

		if(startingdebug) {
			System.out.println("SWTWORKBENCHBOT after ="+SWTWORKBENCHBOT);
		}
	}
	
}
