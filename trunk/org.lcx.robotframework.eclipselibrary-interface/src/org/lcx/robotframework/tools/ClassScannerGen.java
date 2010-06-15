package org.lcx.robotframework.tools;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Date;

public class ClassScannerGen {

	public static String directory = "D:/workspaces/Workspace_Mylyn_e35_sv3/org.lcx.robotframework.eclipselibrary-interface/gensrc/";
	public static String javaext = ".java";
	
	public static String oldPackage = "org.eclipse.swtbot";
	public static String newPackage = "org.lcx.robotframework.swtbot";
	public static String swtPackage = "org.eclipse.swt.";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			
			ClassScannerGen scanner = new ClassScannerGen();
//
			
//			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.AbstractSWTBot");
//			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.AbstractSWTBotControl");
/*			
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotButton");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotCCombo");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotCheckBox");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotCLabel");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotCombo");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotCTabItem");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotDateTime");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotLabel");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.SWTBotLink");
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
*/
//			scanner.scanClass("org.eclipse.swtbot.swt.finder.utils.Position", null, false);
//			scanner.scanClass("org.eclipse.swtbot.swt.finder.utils.TableRow", null, false);
//			scanner.scanClass("org.eclipse.swtbot.swt.finder.utils.TableCollection", null, false);
//			scanner.scanClass("org.eclipse.swtbot.swt.finder.finders.Finder", "AbstractSWTBotObject", true);
			
//			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart");
//			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotCommand", "SWTBotWorkbenchPart", true);
//			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor", "SWTBotWorkbenchPart", true);
//			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotPerspective", "SWTBotWorkbenchPart", true);
//			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView", "SWTBotWorkbenchPart", true);
//			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor", "SWTBotWorkbenchPart", true);
//			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotViewMenu");

//			scanner.scanClass("org.eclipse.swtbot.swt.finder.SWTBotFactory", "AbstractSWTBotFactory", false);
//			scanner.scanClass("org.eclipse.swtbot.swt.finder.SWTBot", "SWTBotFactory", false);
			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot", "SWTBot", false);

			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	public void scanClass(String className) throws Exception {
		scanClass(className, "AbstractSWTBotControl", true);
	}

	public void scanClass(String className, String extend, boolean widget) throws Exception {
		StringBuffer pacsb = new StringBuffer();
		StringBuffer sb = new StringBuffer();
		StringBuffer importsb = new StringBuffer();
		
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
		if(extend!=null) sb.append(" extends "+extend);
		sb.append(" {\n\n");
		if(widget) {
			importsb.append("import "+newPackage+".swt.finder.widgets.AbstractSWTBotControl;\n");
		} else {
			importsb.append("import org.lcx.robotframework.swtbot.eclipse.finder.AbstractSWTBotFactory;\n");
			importsb.append("import org.lcx.robotframework.eclipse.context.Context;\n");
			importsb.append("import org.lcx.robotframework.swtbot.swt.finder.widgets.*;\n");
		}

		importsb.append("import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;\n");
		importsb.append("import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;\n");
		
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
			sb.append("public "+name+"() throws SWTBotBridgeException {\n");
			sb.append("\t\tsuper();\n");
			sb.append("\t}\n\n");
		}

		for(Method m : clazz.getDeclaredMethods()) {
			int modm = m.getModifiers();
			if(Modifier.isPublic(modm) && !Modifier.isVolatile(modm)) {
				System.out.println(m);
				sb.append("\t//"+m+"\n");
				if(m.toString().contains(swtPackage)) continue;
				
				sb.append("\tpublic ");
				// return type
				Type r = m.getGenericReturnType();
				if(r instanceof Class<?>) {
					Class<?> c = (Class<?>) r;
					sb.append( getTypeName(c) );
				} else {
					sb.append(r);
				}
				// method name
				sb.append( " " + m .getName());
				// parameters
				sb.append("(");
				int i = 0;
				boolean first = true;
				for(Type p : m.getGenericParameterTypes()) {
					if(!first) sb.append(", ");
					if(p instanceof Class<?>)
						sb.append(getTypeName((Class<?>)p) + " param"+i++);
					else 
						sb.append(p.toString() + " param"+i++);
					first = false;
				}

				sb.append(") throws SWTBotBridgeException {\n");
				// method source
//				Type r = m.getGenericReturnType();
				String instance = "distantObject";
				if(r instanceof Class<?>) {
					Class<?> c = (Class<?>) r;

					if(c.getSimpleName().equals(name)) {
//							widget = SWTBotBridge.callMethod(widget, "typeText", param0, param1);
//							return this;
						sb.append("\t\t"+instance+" = SWTBotBridge.callMethod("+instance+", \"");
						sb.append(m.getName());
						sb.append("\"");
						printParam(m, sb);
						sb.append(");\n");
						sb.append("\t\treturn this;");
					} else if(c.getPackage()!=null && c.getPackage().getName().startsWith(oldPackage)) {
//						Object o = SWTBotBridge.callMethod(widget, "getTableItem", param0);
//						return new SWTBotTableItem(o);
						if(widget) {
							// for widgets
							sb.append("\t\tObject o = SWTBotBridge.callMethod("+instance+", \"");
							sb.append(m.getName());
							sb.append("\"");
							printParam(m, sb);
							sb.append(");\n");
							sb.append("\t\treturn new ");
							sb.append(c.getSimpleName());
							sb.append("(o);");
						} else {
							// for bots
	//						Object o = SWTBotBridge.callMethod(SWTWorkbenchBot, "viewByTitle", label);
	//						SWTBotView w = new SWTBotView(o);
	//						Context.setCurrentWidget(w);
	//						return w;
							
							sb.append("\t\tObject o = SWTBotBridge.callMethod("+instance+", \"");
							sb.append(m.getName());
							sb.append("\"");
							printParam(m, sb);
							sb.append(");\n");
							sb.append("\t\t" + c.getSimpleName());
							sb.append(" w = new ");
							sb.append(c.getSimpleName());
							sb.append("(o);\n");
							sb.append("\t\tContext.setCurrentWidget(w);\n");
							sb.append("\t\treturn w;");
						}
						
					} else {
						if(c.equals(String.class)) {
							sb.append("\t\treturn (String)SWTBotBridge.callMethod("+instance+", \"");
							sb.append(m.getName());
							sb.append("\"");
							printParam(m, sb);
							sb.append(");");
						} else if (c.equals(void.class)) {
//							SWTBotBridge.callMethod(widget, "setDate", param0);
							sb.append("\t\tSWTBotBridge.callMethod("+instance+", \"");
							sb.append(m.getName());
							sb.append("\"");
							printParam(m, sb);
							sb.append(");");
						
						} else if (c.equals(int.class)) {
//								Integer i = (Integer)SWTBotBridge.callMethod(widget, "isActive");
//								return i.intValue();
							sb.append("\t\tInteger i = (Integer)SWTBotBridge.callMethod("+instance+", \"");
							sb.append(m.getName());
							sb.append("\"");
							printParam(m, sb);
							sb.append(");\n");
							sb.append("\t\treturn i.intValue();");
							
						} else if (c.equals(boolean.class)) {
//								Boolean b = (Boolean)SWTBotBridge.callMethod(widget, "isActive");
//								return b.booleanValue();
							sb.append("\t\tBoolean b = (Boolean)SWTBotBridge.callMethod("+instance+", \"");
							sb.append(m.getName());
							sb.append("\"");
							printParam(m, sb);
							sb.append(");\n");
							sb.append("\t\treturn b.booleanValue();");
						} else if (c.equals(Date.class)) {
//							Object o = SWTBotBridge.callMethod(widget, "getDate");
////							date.getTime()
//							Long l = (Long)SWTBotBridge.callMethod(o, "getTime");
//							Date date = new Date(l.longValue());
//							return date;
							sb.append("\t\tObject o = SWTBotBridge.callMethod("+instance+", \"");
							sb.append(m.getName());
							sb.append("\"");
							printParam(m, sb);
							sb.append(");\n");
							sb.append("\t\tLong l = (Long)SWTBotBridge.callMethod(o, \"getTime\");\n");
							sb.append("\t\tjava.util.Date date = new java.util.Date(l.longValue());\n");
							sb.append("\t\treturn date;");
						} else if (c.equals(String[].class)) {
//							String[] o = (String[])SWTBotBridge.callMethod(widget, "items");
//							return o;
							sb.append("\t\tString[] o = (String[])SWTBotBridge.callMethod("+instance+", \"");
							sb.append(m.getName());
							sb.append("\"");
							printParam(m, sb);
							sb.append(");\n");
							sb.append("\t\treturn o;");
						} else {
							sb.append("\t\t//TODO: class="+c);
							sb.append("\n\t\t return null;");
						}
					}
				} else {
					sb.append("\t\t//TODO: type="+r);
					sb.append("\n\t\t return null;");
				}
				
				sb.append("\n\t}\n");
				sb.append("\n");
			} else {
				
			}
		}
		
		sb.append("\n}\n");
		
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
		        			sb.append("("+cl.getName());
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
