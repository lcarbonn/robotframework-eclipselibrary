package org.lcx.robotframework.eclipse.bridge;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.lcx.robotframework.eclipse.launcher.EclipseMain;

public class SWTBotBridge {

	private static boolean debug = true;
	
	private static Object SWTBotBundle = null;
	private static Object SWTBotService = null;
	private static ClassLoader SWTBotClassLoader = null;
	
	public final static String BUNDLE_NAME="org.lcx.robotframework.swtbotplugin";
	public final static String BUNDLE_SERVICE="org.lcx.robotframework.swtbotplugin.service.SwtbotService";
//	public final static String BUNDLE_VERSION="1.0.0.201005311531";
	
	
	public static Object getSwtbotbundle() throws Exception {
		if(SWTBotBundle==null) {
			try {
				if(debug) {
					System.out.println("Find bundle name="+BUNDLE_NAME);
					System.out.println("Starter in bridge="+EclipseMain.starter);
				}
				
				// Eclipse is running?
				Method isRunning = EclipseMain.starter.getDeclaredMethod("isRunning");
				Object brunning = isRunning.invoke(EclipseMain.starter);
				if(debug) System.out.println("Eclipse is running="+brunning);
	
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
						SWTBotBundle = bundle;
					}
				}
				if(SWTBotBundle!=null) {
					if(debug) System.out.println("swtbotbundle="+SWTBotBundle);
					if(debug) System.out.println("swtbotbundle class="+SWTBotBundle.getClass().getName());
		
					// state of the bundle
					Method getState = SWTBotBundle.getClass().getMethod("getState");
					Object state = getState.invoke(SWTBotBundle);
					if(debug) System.out.println("swtbotbundle state="+state);
				}
				else throw new Exception("bundle named "+BUNDLE_NAME + " not found");
			}
			catch (Exception e) {
				e.printStackTrace();
				throw new Exception("Error in SwtBotBundle Bridge to get the bundle\n Eclipse may not be completly started\n Add -timeout parameter to your Eclipse starting keyword", e);
			}
				
		}
		return SWTBotBundle;
	}

	public static Object getSwtbotservice() throws Exception {
		if(SWTBotService==null) {
			try {
				ClassLoader swtcl = getSwtbotbundle().getClass().getClassLoader();
				
				//loadclass SwtbotService
				Class<?> swtstring = swtcl.loadClass("java.lang.String");
				Constructor<?>  swtcstring = swtstring.getDeclaredConstructor(new Class[] {String.class});
				Object swtservice = swtcstring.newInstance(new Object[] {BUNDLE_SERVICE});
				
				Method loadClass = SWTBotBundle.getClass().getMethod("loadClass", new Class[] {String.class});
				Class<?> service = (Class<?>)loadClass.invoke(SWTBotBundle, swtservice);
				SWTBotService = service.newInstance();
			}
			catch (Exception e) {
				e.printStackTrace();
				throw new Exception("Error in SwtBotBundle Bridge to get the service\n Eclipse may not be completly started\n Add -timeout parameter to your Eclipse starting keyword", e);
			}

		}
		return SWTBotService;
	}

	public static Object getSWTWorkbenchBot() throws SWTBotBridgeException {
		try {
			Method getSWTWorkbenchBot = SWTBotBridge.getSwtbotservice().getClass().getDeclaredMethod("getSWTWorkbenchBot");
			Object SWTWorkbenchBot = getSWTWorkbenchBot.invoke(SWTBotService);
			if(debug) System.out.println("SWTWorkbenchBot classLoader="+SWTWorkbenchBot.getClass().getClassLoader());
			SWTBotClassLoader = SWTWorkbenchBot.getClass().getClassLoader();
			return SWTWorkbenchBot;
		} catch (Exception e) {
			e.printStackTrace();
			throw new SWTBotBridgeException(e);
		}
	}
	
	public static Class<?> loadClass(String className) throws NoSuchMethodException, Exception {
//		ClassLoader swtcl = getSwtbotservice().getClass().getClassLoader();
//		System.out.println("getSwtbotservice classLoader="+swtcl);

		Class<?> c = SWTBotClassLoader.loadClass(className);

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
//				for(Method m : instance.getClass().getMethods()) {
//					System.out.println("method="+m);
//					for(Class<?> c : m.getParameterTypes()) {
//						System.out.println("\tparamTypeClass="+c);
//					}
//				}
	
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
			Class<?>[] parameterTypes = new Class[parameters.length];
			for (int i = 0; i < parameters.length; i++) {
				if(parameters[i] instanceof Class<?> ) {
					throw new SWTBotBridgeException("Object is a class, should call another method");
				}
				parameterTypes[i] = getClass(parameters[i]);
			}
			if(debug) {
//				for(Method m : instance.getClass().getMethods()) {
//					System.out.println("method="+m);
//					for(Class<?> c : m.getParameterTypes()) {
//						System.out.println("\tparamTypeClass="+c);
//					}
//				}
	
				System.out.println("called method="+methodName);
				for (int i = 0; i < parameters.length; i++) {
					System.out.println("\t with param="+parameters[i]+", of class="+parameterTypes[i]);
				}
				System.out.println("\t on instance of class="+instance.getClass().getName());
			}
			
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
//		System.out.println("=====================================");
//		System.out.println("called method="+methodName+", parametersClass="+parameters.getClass().getName());
//		for(Object p : parameters) {
//			System.out.println("\t with param="+p+", of class="+p.getClass().getName());
//		}
//		System.out.println("\t on instance of class="+instance.getClass().getName());

		try {

//			for(Method m : instance.getClass().getMethods()) {
//				System.out.println("method="+m);
//				for(Class<?> c : m.getParameterTypes()) {
//					System.out.println("\tparamTypeClass="+c);
//				}
//			}
			
			Method method = instance.getClass().getMethod(methodName, parameters.getClass());
			//parameters passed with (Object) instead of Object[] to pass it as one single array object
			Object o = method.invoke(instance, (Object)parameters);
			return o;
		} catch (Exception e) {
			e.printStackTrace();
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

}
