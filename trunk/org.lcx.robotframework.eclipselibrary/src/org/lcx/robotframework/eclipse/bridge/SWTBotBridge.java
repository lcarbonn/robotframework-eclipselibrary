/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.bridge;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.lcx.robotframework.eclipse.launcher.EclipseMain;
import org.lcx.robotframework.swtbot.commons.AbstractSWTBotObject;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.waits.ICondition;

public class SWTBotBridge {

	private static boolean debug = false;
	
	private static Object SWTBOTBUNDLE = null;
	private static Object SWTBOTSERVICE = null;
	private static ClassLoader SWTBOTCLASSLOADER = null;
	
	public final static String BUNDLE_NAME="org.lcx.robotframework.swtbotplugin";
	public final static String BUNDLE_SERVICE="org.lcx.robotframework.swtbotplugin.service.SwtbotService";
//	public final static String BUNDLE_VERSION="1.0.0.201005311531";
	

	private SWTBotBridge() {
		super();
	}

	
	public static Object getSwtbotbundle() throws Exception {
		if(SWTBOTBUNDLE==null) {
			try {
				if(debug) {
					System.out.println("Find bundle name="+BUNDLE_NAME);
					System.out.println("Starter in bridge="+EclipseMain.starter);
				}
				
				// Eclipse is running?
//				Method isRunning = EclipseMain.starter.getDeclaredMethod("isRunning");
//				Object brunning = isRunning.invoke(EclipseMain.starter);
//				if(debug) System.out.println("Eclipse is running="+brunning);
	
				//getSystemBundleContext
				Method getSystemBundleContext = EclipseMain.starter.getDeclaredMethod("getSystemBundleContext");
				Object bundleContext = getSystemBundleContext.invoke(EclipseMain.starter);
				if(debug) System.out.println("bundleContext="+bundleContext.getClass().getName()+", bundleContext="+bundleContext);

				//getSystemBundleContext.getBundles
				Method getBundles = bundleContext.getClass().getDeclaredMethod("getBundles");
				Object[] bs = (Object[])getBundles.invoke(bundleContext);
				for (Object bundle : bs) {
//					System.out.println("bundle="+bundle);
					String completeName = bundle.toString();
					String name = completeName.substring(0, completeName.indexOf('_'));
					if(name.equals(SWTBotBridge.BUNDLE_NAME)) {
						if(debug) System.out.println("bundle name="+name);
						SWTBOTBUNDLE = bundle;
					}
				}
				if(SWTBOTBUNDLE!=null) {
					if(debug) System.out.println("swtbotbundle="+SWTBOTBUNDLE);
					if(debug) System.out.println("swtbotbundle class="+SWTBOTBUNDLE.getClass().getName());
		
					// state of the bundle
					Method getState = SWTBOTBUNDLE.getClass().getMethod("getState");
					Object state = getState.invoke(SWTBOTBUNDLE);
					if(debug) System.out.println("swtbotbundle state="+state);
				}
				else throw new Exception("bundle named "+BUNDLE_NAME + " not found");
			}
			catch (Exception e) {
				e.printStackTrace();
				throw new Exception("Error in SwtBotBundle Bridge to get the bundle\n Eclipse may not be completly started\n Add -timeout parameter to your Eclipse starting keyword", e);
			}
				
		}
		return SWTBOTBUNDLE;
	}

	public static Object getSwtbotservice() throws Exception {
		if(SWTBOTSERVICE==null) {
			try {
				ClassLoader swtcl = getSwtbotbundle().getClass().getClassLoader();
				
				//loadclass SwtbotService
				Class<?> swtstring = swtcl.loadClass("java.lang.String");
				Constructor<?>  swtcstring = swtstring.getDeclaredConstructor(new Class[] {String.class});
				Object swtservice = swtcstring.newInstance(new Object[] {BUNDLE_SERVICE});
				
				Method loadClass = SWTBOTBUNDLE.getClass().getMethod("loadClass", new Class[] {String.class});
				Class<?> service = (Class<?>)loadClass.invoke(SWTBOTBUNDLE, swtservice);
				SWTBOTSERVICE = service.newInstance();
			}
			catch (Exception e) {
				e.printStackTrace();
				throw new Exception("Error in SwtBotBundle Bridge to get the service\n Eclipse may not be completly started\n Add -timeout parameter to your Eclipse starting keyword", e);
			}

		}
		return SWTBOTSERVICE;
	}

	public static Object getSWTWorkbenchBot() throws SWTBotBridgeException {
		try {
			Method getSWTWorkbenchBot = SWTBotBridge.getSwtbotservice().getClass().getDeclaredMethod("getSWTWorkbenchBot");
			Object SWTWorkbenchBot = getSWTWorkbenchBot.invoke(SWTBOTSERVICE);
			if(debug) System.out.println("SWTWorkbenchBot classLoader="+SWTWorkbenchBot.getClass().getClassLoader());
			SWTBOTCLASSLOADER = SWTWorkbenchBot.getClass().getClassLoader();
			return SWTWorkbenchBot;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SWTBotBridgeException(e);
		}
	}
	
	public static Class<?> loadClass(String className) throws NoSuchMethodException, Exception {
//		ClassLoader swtcl = getSwtbotservice().getClass().getClassLoader();
//		System.out.println("getSwtbotservice classLoader="+swtcl);
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
	
}
