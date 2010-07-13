package org.lcx.robotframework.tools;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart;
import org.eclipse.swtbot.swt.finder.SWTBot;
import org.eclipse.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import org.lcx.robotframework.swtbot.eclipse.finder.AbstractSWTBotFactory;
import org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory;

public class ClassScannerGen {

	public static String directory = "D:/workspaces/Workspace_Mylyn_e35_sv3/org.lcx.robotframework.eclipselibrary-interface/gensrc/";
	public static String javaext = ".java";
	
	public static String oldPackage = "org.eclipse.swtbot";
	public static String newPackage = "org.lcx.robotframework.swtbot";
	public static String swtbotEclipsePackage = "org.eclipse.swtbot.eclipse";
	
	public static String swtPackage = "org.eclipse.swt.";
	public static String uiPackage = "org.eclipse.ui.";
	public static String jfacePackage = "org.eclipse.jface.";
	
	public static String finderPackage = "org.eclipse.swtbot.swt.finder.finders";
	public static String hamcrestPackage = "org.hamcrest";
	public static String resultsPackage = "swtbot.swt.finder.results";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			
			ClassScannerGen scanner = new ClassScannerGen();
//
			
//			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.AbstractSWTBot");
//			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.AbstractSWTBotControl");

			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotButton");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotCCombo");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotCheckBox");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotCLabel");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotCombo");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotCTabItem");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotDateTime");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotLabel");
//			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotLink");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotList");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotRadio");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotShell");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotSlider");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotSpinner");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotStyledText");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotTabItem");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotTable");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotTableColumn");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotTableItem");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotText");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotToggleButton");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarButton");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarDropDownButton");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarPushButton");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarRadioButton");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarSeparatorButton");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotToolbarToggleButton");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotTrayItem");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotTree");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotTreeItem");

			scanner.scanClass("org.eclipse.swtbot.swt.finder.utils.Position");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.utils.TableRow");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.utils.TableCollection");
//			scanner.scanClass("org.eclipse.swtbot.swt.finder.finders.Finder", "AbstractSWTBotObject", true);
			
			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart");
			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotCommand", SWTBotWorkbenchPart.class, true);
			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor", SWTBotWorkbenchPart.class, true);
			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotPerspective", SWTBotWorkbenchPart.class, true);
			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView", SWTBotWorkbenchPart.class, true);
			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor", SWTBotWorkbenchPart.class, true);
			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotViewMenu");

			scanner.scanClass("org.eclipse.swtbot.swt.finder.SWTBotFactory", AbstractSWTBotFactory.class, false);
			scanner.scanClass("org.eclipse.swtbot.swt.finder.SWTBot", SWTBotFactory.class, false);
			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot", SWTBot.class, false);

			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void scanClass(String className) throws Exception {
		scanClass(className, AbstractSWTBotControl.class, true);
	}

	public void scanClass(String className, Class<?> extend, boolean widget) throws Exception {
		StringBuffer pacsb = new StringBuffer();
		StringBuffer sb = new StringBuffer();
//		StringBuffer importsb = new StringBuffer();
		Set<String> importSet = new HashSet<String>();
		
		System.out.println("_____________________________________");
		Class<?> clazz = Class.forName(className);
		System.out.println(clazz);
		String pack = clazz.getPackage().getName();
		// package
		pacsb.append("package "+ pack + ";");
		pacsb.append("\n\n");

		// class
		String name = clazz.getSimpleName();
		
		sb.append("public class ");
		sb.append(name);
		if(extend!=null) {
			sb.append(" extends "+extend.getSimpleName());
			importSet.add(extend.getName());
		}
		sb.append(" {\n\n");
		
		
//		if(widget) {
//			importsb.append("import "+newPackage+".swt.finder.widgets.AbstractSWTBotControl;\n");
//		} else {
//			importsb.append("import org.lcx.robotframework.swtbot.eclipse.finder.AbstractSWTBotFactory;\n");
//			importsb.append("import org.lcx.robotframework.eclipse.context.Context;\n");
////			importsb.append("import org.lcx.robotframework.swtbot.swt.finder.widgets.*;\n");
////			importsb.append("import org.lcx.robotframework.swtbot.eclipse.finder.widgets.*;\n");
////			importsb.append("import org.lcx.robotframework.swtbot.swt.finder.finders.Finder;\n");
//			importsb.append("import org.lcx.robotframework.swtbot.swt.finder.SWTBot;\n");
//
//		}
//
//		importsb.append("import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;\n");
//		importsb.append("import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;\n");
		
		
		if(className.equals("org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot")) {
			
			sb.append("\tprivate static SWTWorkbenchBot instance;\n\n");

			sb.append("\tpublic static SWTWorkbenchBot getSWTWorkbenchBot() throws SWTBotBridgeException {\n");
			sb.append("\t\tif(instance==null) {\n");
			sb.append("\t\t\tinstance = new SWTWorkbenchBot();\n");
			sb.append("\t\t}\n");
			sb.append("\t\treturn instance;\n");
			sb.append("\t}\n\n");

			importSet.add("org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException");
			
			sb.append("\tpublic SWTWorkbenchBot() throws SWTBotBridgeException {\n");
			sb.append("\t\tsuper(null);\n");
			sb.append("\t\tSystem.out.println(\"Instanciation of SWTWorkbenchBot\");\n");
			sb.append("\t\tdistantObject = SWTBotBridge.getSWTWorkbenchBot();\n");
			sb.append("\t}\n\n");
			
		}

		// Constructor
		if(widget) {
	//		public SWTBotButton(Object o) {
	//			super(o);
	//			// TODO Auto-generated constructor stub
	//		}
			sb.append("\t");
			sb.append("public "+name+"(Object o) {\n");
			sb.append("\t\tsuper(o);\n");
			sb.append("\t}\n\n");
		} else {
//			public SWTBotFactory() throws SWTBotBridgeException {
//				super();
//			}
			sb.append("\t");
			sb.append("public "+name+"(Object o) throws SWTBotBridgeException {\n");
			sb.append("\t\tsuper(o);\n");
			sb.append("\t}\n\n");
		}
		
		SortedMap<String, Method> sm = new TreeMap<String, Method>();
		
		for(Method m : clazz.getDeclaredMethods()) {
			String key = m.getName();
			for (Type t : m.getGenericParameterTypes()) {
				key = key + t;
			}
			sm.put(key, m);
		}
		Iterator<String> it = sm.keySet().iterator();
		while(it.hasNext()) {
			Method m = sm.get(it.next());
			StringBuffer msb = new StringBuffer();
			boolean addSuppressWarnings = false;
			int modm = m.getModifiers();
			if(Modifier.isPublic(modm)) { // && !Modifier.isVolatile(modm)) {
				System.out.println(m);
				sb.append("\t//"+m+"\n");

				// TODO : maybe one day !
				if(m.toString().contains(swtPackage)) continue;
				if(m.toString().contains(uiPackage)) continue;
				if(m.toString().contains(hamcrestPackage)) continue;
				if(m.toString().contains(resultsPackage)) continue;
				if(m.toString().contains(finderPackage)) continue;
				if(m.toString().contains(jfacePackage)) continue;
				
				
				if(m.getName().equals("toString") 
						|| m.getName().equals("hashCode")
						|| m.getName().equals("equals")) {
					 continue;
				}
				
				
				msb.append("\tpublic ");
				// return type
				Type r = m.getGenericReturnType();
				if(r instanceof Class<?>) {
					Class<?> c = (Class<?>) r;
					msb.append( getTypeName(c) );
				} else {
					msb.append(r);
				}
				// method name
				msb.append( " " + m .getName());
				// parameters
				msb.append("(");
				int i = 0;
				boolean first = true;
				for(Type p : m.getGenericParameterTypes()) {
					if(!first) msb.append(", ");
					if(p instanceof Class<?>)
						msb.append(getTypeName((Class<?>)p) + " param"+i++);
					else 
						msb.append(p.toString() + " param"+i++);
					first = false;
				}
				msb.append(")");
				
				msb.append(" throws SWTBotBridgeException");
				msb.append(" {\n");

				importSet.add("org.lcx.robotframework.eclipse.bridge.SWTBotBridge");
				importSet.add("org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException");
				
				// method source
				
				String callMethod = "callMethod";
				if(isArray(m)) {
					callMethod = "callMethodWithArray";
				}

				String instance = "distantObject";
				if(r instanceof Class<?>) {
					Class<?> c = (Class<?>) r;

					if(c.getSimpleName().equals(name)) {
//							widget = SWTBotBridge.callMethod(widget, "typeText", param0, param1);
//							return this;
						msb.append("\t\t"+instance+" = SWTBotBridge."+callMethod+"("+instance+", \"");
						msb.append(m.getName());
						msb.append("\"");
						printParam(m, msb);
						msb.append(");\n");
						msb.append("\t\treturn this;");
					} else if(c.getPackage()!=null && c.getPackage().getName().startsWith(oldPackage)) {
//						Object o = SWTBotBridge."+callMethod+"(widget, "getTableItem", param0);
//						return new SWTBotTableItem(o);
						if(widget) {
							// for widgets
							msb.append("\t\tObject o = SWTBotBridge."+callMethod+"("+instance+", \"");
							msb.append(m.getName());
							msb.append("\"");
							printParam(m, msb);
							msb.append(");\n");
							msb.append("\t\treturn new ");
							msb.append(c.getSimpleName());
							msb.append("(o);");
							importSet.add(c.getName());
						} else {
							// for bots
	//						Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "viewByTitle", label);
	//						SWTBotView w = new SWTBotView(o);
	//						Context.setCurrentWidget(w);
	//						return w;
							
							msb.append("\t\tObject o = SWTBotBridge."+callMethod+"("+instance+", \"");
							msb.append(m.getName());
							msb.append("\"");
							printParam(m, msb);
							msb.append(");\n");
							msb.append("\t\t" + c.getName());
							msb.append(" w = new ");
							msb.append(c.getSimpleName());
							msb.append("(o);\n");
							if(!(c.getPackage().getName().startsWith(finderPackage))){
								msb.append("\t\tContext.setCurrentWidget(w);\n");
							}
							msb.append("\t\treturn w;");
							importSet.add(c.getName());
							importSet.add("org.lcx.robotframework.eclipse.context.Context");
						}
						
					} else {
						if(c.equals(String.class)) {
							msb.append("\t\treturn (String)SWTBotBridge."+callMethod+"("+instance+", \"");
							msb.append(m.getName());
							msb.append("\"");
							printParam(m, msb);
							msb.append(");");
						} else if (c.equals(void.class)) {
//							SWTBotBridge.callMethod(widget, "setDate", param0);
							msb.append("\t\tSWTBotBridge."+callMethod+"("+instance+", \"");
							msb.append(m.getName());
							msb.append("\"");
							printParam(m, msb);
							msb.append(");");
						
						} else if (c.equals(int.class)) {
//								Integer i = (Integer)SWTBotBridge.callMethod(widget, "isActive");
//								return i.intValue();
							msb.append("\t\tInteger i = (Integer)SWTBotBridge."+callMethod+"("+instance+", \"");
							msb.append(m.getName());
							msb.append("\"");
							printParam(m, msb);
							msb.append(");\n");
							msb.append("\t\treturn i.intValue();");
							
						} else if (c.equals(boolean.class)) {
//								Boolean b = (Boolean)SWTBotBridge.callMethod(widget, "isActive");
//								return b.booleanValue();
							msb.append("\t\tBoolean b = (Boolean)SWTBotBridge."+callMethod+"("+instance+", \"");
							msb.append(m.getName());
							msb.append("\"");
							printParam(m, msb);
							msb.append(");\n");
							msb.append("\t\treturn b.booleanValue();");
						} else if (c.equals(Date.class)) {
//							Object o = SWTBotBridge.callMethod(widget, "getDate");
////							date.getTime()
//							Long l = (Long)SWTBotBridge.callMethod(o, "getTime");
//							Date date = new Date(l.longValue());
//							return date;
							msb.append("\t\tObject o = SWTBotBridge."+callMethod+"("+instance+", \"");
							msb.append(m.getName());
							msb.append("\"");
							printParam(m, msb);
							msb.append(");\n");
							msb.append("\t\tLong l = (Long)SWTBotBridge.callMethod(o, \"getTime\");\n");
							msb.append("\t\tDate date = new Date(l.longValue());\n");
							msb.append("\t\treturn date;");
							importSet.add("java.util.Date");
						} else if (c.equals(String[].class)) {
//							String[] o = (String[])SWTBotBridge.callMethod(widget, "items");
//							return o;
							msb.append("\t\tString[] o = (String[])SWTBotBridge."+callMethod+"("+instance+", \"");
							msb.append(m.getName());
							msb.append("\"");
							printParam(m, msb);
							msb.append(");\n");
							msb.append("\t\treturn o;");
						} else if (c.isArray()) {
							//return (clazz[])SWTBotBridge.callMethodReturnSWTBotArray(instance, methodName, clazz, parameters);
							// TODO : if primitive or not and if array
							Class<?> type = (Class<?>)c.getComponentType();
							System.out.println(type);
							msb.append("\t\treturn ("+type.getName());
							msb.append("[]) SWTBotBridge.callMethodReturnSWTBotArray("+instance+", \"");
							msb.append(m.getName());
							msb.append("\"");
							msb.append(", ");
							msb.append(type.getSimpleName()+".class");
//							msb.append(", "+arraytype.class);
							printParam(m, msb);
							msb.append(");\n");
							importSet.add(type.getName());
						} else {
						
							msb.append("\t\t//TODO: class="+c);
							msb.append("\n\t\t return null;");
						}
					}
				} else {
//					System.out.println("class="+((ParameterizedType)r).getClass());
//					System.out.println("raw  ="+((ParameterizedType)r).getRawType());
//					System.out.println("owner="+((ParameterizedType)r).getOwnerType());
					if (((ParameterizedType)r).getRawType().equals(java.util.List.class)) {
						//return (List<String>)SWTBotBridge.callMethodList(distantObject, "getLines");
						// TODO : if primitive or not and if array
						msb.append("\t\treturn (List)SWTBotBridge.callMethodReturnPrimitiveList("+instance+", \"");
						msb.append(m.getName());
						msb.append("\"");
						printParam(m, msb);
						msb.append(");\n");
						addSuppressWarnings=true;
						importSet.add("java.util.List");
					} else {
						msb.append("\t\t//TODO: type="+r);
						msb.append("\n\t\t return null;");
					}
				}
				
				msb.append("\n\t}\n");
				msb.append("\n");
			}
			
			if(addSuppressWarnings) {
				sb.append("\t@SuppressWarnings(\"unchecked\")\n");
			}
			sb.append(msb.toString());

		}
		
		sb.append("\n}\n");
		
		StringBuffer importsb = new StringBuffer();

		for (String string : importSet) {
			importsb.append("import "+string+";\n");
		}
		
		String source = pacsb.toString() + "\n" + importsb.toString() +"\n\n"+ sb.toString();
		source = source.replace(oldPackage, newPackage);
		String packageName = clazz.getPackage().getName().replace(oldPackage, newPackage);
		saveFile(packageName, clazz.getSimpleName(), source);
	}
	
	public void saveFile(String pack, String name, String source) throws Exception {
		System.out.println("saveClass: "+pack+"."+name);
		String path = directory + pack.replace('.', '/');
		String fileName = path + "/" +name+ javaext;
		File folder = new File(path);
		folder.mkdirs();
		File file = new File(fileName);
		FileOutputStream fo = new FileOutputStream(file);
		for (char c :  source.toCharArray()) {
			fo.write(c);
		}
		fo.flush();
		fo.close();
	}
	
	public void printParam(Method m, StringBuffer sb) {
//		boolean first = true;
		int i = 0;
		for(Type p : m.getGenericParameterTypes()) {
			sb.append(", ");
			if(p instanceof Class<?>) {
				Class<?> type = (Class<?>)p;
		    	if (type.isArray()) {
		    	    try {
		        		Class<?> cl = type;
		        		int dimensions = 0;
		        		while (cl.isArray()) {
		        		    dimensions++;
		        		    cl = cl.getComponentType();
		        		}
		        		if(cl.isPrimitive())
		        			sb.append("("+cl.getSimpleName());
		        		else
		        			sb.append("(Object");
		        		for (int j = 0; j < dimensions; j++) {
		        		    sb.append("[])");
		        		}
		       	    } catch (Throwable e) { /*FALLTHRU*/ }
		    	}
			}
			sb.append("param"+i++);
//			first = false;
		}
	}
	
	public boolean isArray(Method m) {
//		boolean first = true;
		boolean isArray = false;
		for(Type p : m.getGenericParameterTypes()) {
			if(p instanceof Class<?>) {
				Class<?> type = (Class<?>)p;
		    	if (type.isArray()) {
		    		isArray = true;
		    	}
			}
		}
		return isArray;
	}

	public String getTypeName(Class<?> type) {
    	if (type.isArray()) {
    	    try {
    		Class<?> cl = type;
    		int dimensions = 0;
    		while (cl.isArray()) {
    		    dimensions++;
    		    cl = cl.getComponentType();
    		}
    		StringBuffer sb = new StringBuffer();
    		sb.append(cl.getName());
    		for (int i = 0; i < dimensions; i++) {
    		    sb.append("[]");
    		}
    		return sb.toString();
    	    } catch (Throwable e) { /*FALLTHRU*/ }
    	}
    	return type.getName();
        }
	
}
