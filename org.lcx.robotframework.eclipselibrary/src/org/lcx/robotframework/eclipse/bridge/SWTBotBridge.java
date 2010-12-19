/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.bridge;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.lcx.robotframework.eclipse.LibraryLogger;
import org.lcx.robotframework.swtbot.commons.AbstractSWTBotObject;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.swt.finder.waits.ICondition;

/**
 * Bridge between EclipseLibrary and SWTBot plugin.
 * The bridge is made thru EclipseLibrary plugin that redirect distant call to SWTBot plugin
 * The bridge is opened by the EclipseLibrary plugin that give a reference to the SWTBotWorkbench
 * @author laurent.carbonnaux
 *
 */
public class SWTBotBridge {
	
	private static Logger log = LibraryLogger.getLogger();

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
		if(log.isDebugEnabled()) {
			log.debug("=====================================");
			log.debug("called static method on class="+className);
			log.debug("called static method="+methodName);
		}
		
		try {
			Class<?>[] parameterTypes = new Class[parameters.length];
			for (int i = 0; i < parameters.length; i++) {
				if(parameters[i] instanceof Class<?> ) {
					throw new SWTBotBridgeException("Object is a class, should call another method");
				}
				parameterTypes[i] = getClass(parameters[i]);
			}
			if(log.isDebugEnabled()) {
				for (int i = 0; i < parameters.length; i++) {
					log.debug("\t with param="+parameters[i]+", of class="+parameterTypes[i]);
				}
				log.debug("\t of class="+className);
			}
			
			Class<?> c = loadClass(className);

			Method method = c.getMethod(methodName, parameterTypes);
			method.setAccessible(true);
			
			Object o = method.invoke(parameters);
			return o;
		} catch (Exception e) {
			throw CauseException.generateException(e);
		}
	}
	
	public static Object callMethod(Object instance, String methodName, Object... parameters) throws SWTBotBridgeException {
		if(log.isDebugEnabled()) {
			log.debug("=====================================");
		}
		
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
			if(log.isDebugEnabled()) {
				for(Method m : instance.getClass().getMethods()) {
					log.debug("method="+m);
					for(Class<?> c : m.getParameterTypes()) {
						log.debug("\tparamTypeClass="+c);
					}
				}
				log.debug("called method="+methodName);
				for (int i = 0; i < parameters.length; i++) {
					log.debug("\t with param="+parameters[i]+", of class="+parameterTypes[i]);
				}
				log.debug("\t on instance of class="+instance.getClass().getName());
			}
			
			Method method = instance.getClass().getMethod(methodName, parameterTypes);
			method.setAccessible(true);
			
			Object o = method.invoke(instance, params);
			return o;
		} catch (Exception e) {
			throw CauseException.generateException(e);
		}
	}

	public static Object callMethodWithArray(Object instance, String methodName, Object arrayParameter) throws SWTBotBridgeException {
		if(log.isDebugEnabled()) {
			log.debug("=====================================");
			log.debug("called method="+methodName+", parametersClass="+arrayParameter.getClass().getName());
			log.debug("\t on instance of class="+instance.getClass().getName());
		}

		if(!arrayParameter.getClass().isArray()) {
			throw new SWTBotBridgeException("Method callMethodWithArray should be called with a array as parameter");
		}
		
		try {
			if(log.isDebugEnabled()) {
				for(Method m : instance.getClass().getMethods()) {
					log.debug("method="+m);
					for(Class<?> c : m.getParameterTypes()) {
						log.debug("\tparamTypeClass="+c);
					}
				}
			}
			
			Method method = instance.getClass().getMethod(methodName, arrayParameter.getClass());
			//parameters passed with (Object) instead of Object[] to pass it as one single array object
			Object o = method.invoke(instance, (Object)arrayParameter);
			return o;
		} catch (Exception e) {
			throw CauseException.generateException(e);
		}
	}

	public static List<?> callMethodReturnPrimitiveList(Object instance, String methodName, Object... parameters) throws SWTBotBridgeException {
		List<Object> ls = new ArrayList<Object>();
		Object o = SWTBotBridge.callMethod(instance, methodName, parameters);

		Object iterator = SWTBotBridge.callMethod(o, "iterator");
		while((Boolean)SWTBotBridge.callMethod(iterator, "hasNext")) {
			Object item = SWTBotBridge.callMethod(iterator, "next");

			if(log.isDebugEnabled()){
				log.debug("line="+item);
			}

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

				if(log.isDebugEnabled()){
					log.debug("line="+item);
				}

				Constructor<?> c = clazz.getDeclaredConstructor(Object.class);
				AbstractSWTBotObject localO = (AbstractSWTBotObject)c.newInstance(item);
				ls.add(localO);
			}
			return ls;
		} catch (Exception e) {
			throw CauseException.generateException(e);
		}
	}

	public static Object[] callMethodReturnSWTBotArray(Object instance, String methodName, Class<?> clazz, Object... parameters) throws SWTBotBridgeException {
		try {
			Object[] o = (Object[])SWTBotBridge.callMethod(instance, methodName, parameters);
			Object lo = Array.newInstance(clazz, o.length);
			int i = 0;
			for (Object distO : o) {

				if(log.isDebugEnabled()){
					log.debug("line="+distO);
				}
				
				Constructor<?> c = clazz.getDeclaredConstructor(Object.class);
				AbstractSWTBotObject localO = (AbstractSWTBotObject)c.newInstance(distO);
				Array.set(lo, i, localO);
				i++;
			}
			return (Object[])lo;
		} catch (Exception e) {
			throw CauseException.generateException(e);
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
		if(log.isDebugEnabled()) {
			log.debug("=====================================");
			log.debug("called get static field="+fieldName);
			log.debug("\t of class="+className);
		}
		
		try {
			Class<?> c = loadClass(className);

			Field field = c.getField(fieldName);
//			field.setAccessible(true);
			
			Object o = field.get(null);
			return o;
		} catch (Exception e) {
			throw CauseException.generateException(e);
		}
	}
	
	public static void setStaticField(String className, String fieldName, Object value) throws SWTBotBridgeException {
		if(log.isDebugEnabled()) {
			log.debug("=====================================");
			log.debug("called set static field="+fieldName+", value="+value);
			log.debug("\t of class="+className);
		}
		
		try {
			Class<?> c = loadClass(className);

			Field field = c.getField(fieldName);
//			field.setAccessible(true);
			
			field.set(null, value);
		} catch (Exception e) {
			throw CauseException.generateException(e);
		}
	}


	public static void setSWTBOTCLASSLOADER(ClassLoader sWTBOTCLASSLOADER) {
		if(log.isDebugEnabled()) {
			log.debug("SWTBOTCLASSLOADER cl before="+SWTBOTCLASSLOADER);
		}
		SWTBOTCLASSLOADER = sWTBOTCLASSLOADER;
		if(sWTBOTCLASSLOADER==null) {
			ISBRIDGEINITIATED = false;
		}

		if(log.isDebugEnabled()) {
			log.debug("SWTBOTCLASSLOADER cl after ="+SWTBOTCLASSLOADER);
		}
	}


	public static boolean isISBRIDGEINITIATED() {
		return ISBRIDGEINITIATED;
	}


	public static Object getSWTWORKBENCHBOT() {
		return SWTWORKBENCHBOT;
	}


	public static void setSWTWORKBENCHBOT(Object sWTWORKBENCHBOT) {
		if(log.isDebugEnabled()) {
			log.debug("SWTWORKBENCHBOT before="+SWTWORKBENCHBOT);
		}
		
		SWTWORKBENCHBOT = sWTWORKBENCHBOT;
		ISBRIDGEINITIATED = (sWTWORKBENCHBOT!=null);

		if(log.isDebugEnabled()) {
			log.debug("SWTWORKBENCHBOT after ="+SWTWORKBENCHBOT);
		}
	}
	
}
