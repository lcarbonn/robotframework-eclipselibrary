package org.lcx.robotframework.eclipse.bridge;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.lcx.robotframework.eclipse.launcher.EclipseMain;

public class SWTBotBridge {

	
	protected static Object swtbotbundle = null;
	protected static Object swtbotservice = null;
	
	public final static String BUNDLE_NAME="org.lcx.robotframework.swtbotplugin";
	public final static String BUNDLE_SERVICE="org.lcx.robotframework.swtbotplugin.service.SwtbotService";
//	public final static String BUNDLE_VERSION="1.0.0.201005311531";
	
	
	public static Object getSwtbotbundle() throws Exception {
		if(swtbotbundle==null) {
			try {
				System.out.println("Find bundle name="+BUNDLE_NAME);
				System.out.println("Starter in bridge="+EclipseMain.starter);
				Thread.sleep(1000*20);
				
				// Eclipse is running?
				Method isRunning = EclipseMain.starter.getDeclaredMethod("isRunning");
				Object brunning = isRunning.invoke(EclipseMain.starter);
				System.out.println("Eclipse is running="+brunning);
	
				//getSystemBundleContext
				Method getSystemBundleContext = EclipseMain.starter.getDeclaredMethod("getSystemBundleContext");
				Object bundleContext = getSystemBundleContext.invoke(EclipseMain.starter);
				System.out.println("bundleContext="+bundleContext.getClass().getName()+", bundleContext="+bundleContext);

				//getSystemBundleContext.getBundles
				Method getBundles = bundleContext.getClass().getDeclaredMethod("getBundles");
				Object[] bs = (Object[])getBundles.invoke(bundleContext);
				for (Object bundle : bs) {
//					System.out.println("bundle="+bundle);
					String completeName = bundle.toString();
					String name = completeName.substring(0, completeName.indexOf('_'));
					if(name.equals(SWTBotBridge.BUNDLE_NAME)) {
						System.out.println("bundle name="+name);
						swtbotbundle = bundle;
					}
				}
				if(swtbotbundle!=null) {
					System.out.println("swtbotbundle="+swtbotbundle);
					System.out.println("swtbotbundle class="+swtbotbundle.getClass().getName());
		
					// state of the bundle
					Method getState = swtbotbundle.getClass().getMethod("getState");
					Object state = getState.invoke(swtbotbundle);
					System.out.println("swtbotbundle state="+state);
				}
				else throw new Exception("bundle named "+BUNDLE_NAME + " not found");
			}
			catch (Exception e) {
				e.printStackTrace();
				throw new Exception("Error in SwtBotBundle Bridge to get the bundle", e);
			}
				
		}
		return swtbotbundle;
	}

	public static Object getSwtbotservice() throws Exception {
		if(swtbotservice==null) {
			try {
				ClassLoader swtcl = getSwtbotbundle().getClass().getClassLoader();
				
				//loadclass SwtbotService
				Class<?> swtstring = swtcl.loadClass("java.lang.String");
				Constructor<?>  swtcstring = swtstring.getDeclaredConstructor(new Class[] {String.class});
				Object swtservice = swtcstring.newInstance(new Object[] {BUNDLE_SERVICE});
				
				Method loadClass = swtbotbundle.getClass().getMethod("loadClass", new Class[] {String.class});
				Class<?> service = (Class<?>)loadClass.invoke(swtbotbundle, swtservice);
				swtbotservice = service.newInstance();
			}
			catch (Exception e) {
				e.printStackTrace();
				throw new Exception("Error in SwtBotBundle Bridge to get the service", e);
			}

		}
		return swtbotservice;
	}

	public static Object getSWTWorkbenchBot() throws SWTBotBridgeException {
		try {
			Method getSWTWorkbenchBot = SWTBotBridge.getSwtbotservice().getClass().getDeclaredMethod("getSWTWorkbenchBot");
			Object SWTWorkbenchBot = getSWTWorkbenchBot.invoke(swtbotservice);
			return SWTWorkbenchBot;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SWTBotBridgeException(e);
		}
	}

	public static Object newInstance(Class<?> classs) throws SWTBotBridgeException {
		try {
			ClassLoader swtcl = getSwtbotbundle().getClass().getClassLoader();
			
			Class<?> c = swtcl.loadClass(classs.getName());
			Object instance = c.newInstance();
			return instance;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SWTBotBridgeException(e);
		}
	}

	public static Object callMethod(Object instance, String methodName, Object... parameters) throws SWTBotBridgeException {
		System.out.println("=====================================");
		
		try {
			Class<?>[] parameterTypes = new Class[parameters.length];
			for (int i = 0; i < parameters.length; i++) {
				parameterTypes[i] = parameters[i].getClass();
			}
			for(Method m : instance.getClass().getMethods()) {
				System.out.println("method="+m);
				for(Class c : m.getParameterTypes()) {
					System.out.println("\tparamTypeClass="+c);
				}
			}

			System.out.println("called method="+methodName);
			for(Object p : parameterTypes) {
				System.out.println("\t with paramClass="+p+", of class="+p.getClass().getName());
			}
			for(Object p : parameters) {
				System.out.println("\t with param="+p+", of class="+p.getClass().getName());
			}
			System.out.println("\t on instance of class="+instance.getClass().getName());
			
			Method method = instance.getClass().getMethod(methodName, parameterTypes);
			method.setAccessible(true);
			
			Object o = method.invoke(instance, parameters);
			return o;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SWTBotBridgeException(e);
		}
	}

	public static Object callMethodWithArray(Object instance, String methodName, Object... parameters) throws SWTBotBridgeException {
		System.out.println("=====================================");
		System.out.println("called method="+methodName+", parametersClass="+parameters.getClass().getName());
		for(Object p : parameters) {
			System.out.println("\t with param="+p+", of class="+p.getClass().getName());
		}
		System.out.println("\t on instance of class="+instance.getClass().getName());

		try {

			for(Method m : instance.getClass().getMethods()) {
				System.out.println("method="+m);
				for(Class c : m.getParameterTypes()) {
					System.out.println("\tparamTypeClass="+c);
				}
			}
			
			Method method = instance.getClass().getMethod(methodName, parameters.getClass());
			//parameters passed with (Object) instead of Object[] to pass it as one single array object
			Object o = method.invoke(instance, (Object)parameters);
			return o;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SWTBotBridgeException(e);
		}
	}
	//	public static Object callMethod(String className, String methodName, Object... parameters) throws Exception {
//		ClassLoader swtcl = getSwtbotbundle().getClass().getClassLoader();
//		
//		Class<?> classs = swtcl.loadClass(className);
//		Object instance = classs.newInstance();
//		Class<?>[] parameterTypes = new Class[parameters.length];
//		for (int i = 0; i < parameters.length; i++) {
//			parameterTypes[i] = parameters[i].getClass();
//		}
//		Method method = classs.getMethod(methodName, parameterTypes);
//		Object o = method.invoke(instance, parameters);
//		return o;
//	}

	
}
