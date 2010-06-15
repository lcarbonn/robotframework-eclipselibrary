package org.lcx.robotframework.tools;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ClassScanner {

	public static String directory = "D:/workspaces/Workspace_Mylyn_e35_sv3/org.lcx.robotframework.eclipselibrary-interface/scanned/";
	public static String javaext = ".txt";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			
			ClassScanner scanner = new ClassScanner();
			scanner.scanClass("org.eclipse.swtbot.swt.finder.SWTBotFactory");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.SWTBot");
			
			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot");

			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotPerspective");
			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView");
			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart");
			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotViewMenu");
			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEditor");
			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor");
			scanner.scanClass("org.eclipse.swtbot.eclipse.finder.widgets.SWTBotCommand");
			
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.AbstractSWTBot");
			scanner.scanClass("org.eclipse.swtbot.swt.finder.widgets.AbstractSWTBotControl");
			
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

			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	public void scanClass(String className) throws Exception {
		StringBuffer sb = new StringBuffer();
		System.out.println("_____________________________________");
		Class<?> clazz = Class.forName(className);
		System.out.println(clazz);
		sb.append(clazz+"\n");
		for(Method m : clazz.getDeclaredMethods()) {
			int mod = m.getModifiers();
			if(Modifier.isPublic(mod)) {
				System.out.println(m);
				sb.append(m+"\n");
			}
		}
		saveFile(clazz.getPackage().getName(), clazz.getName(), sb.toString());
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
	
}
