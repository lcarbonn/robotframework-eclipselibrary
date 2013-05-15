package org.lcx.robotframework.tools;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotWorkbenchPart;
import org.lcx.robotframework.swtbot.swt.finder.SWTBot;
import org.lcx.robotframework.swtbot.swt.finder.SWTBotFactory;

public class ClassScanner {

	public static String directory = "D:/workspaces/Workspace_Mylyn_e35_sv3/org.lcx.robotframework.eclipselibrary-interface/scanned/";
	public static String javaext = ".txt";
	public String filter = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			
			ClassScanner scanner = new ClassScanner();
//			scanner.filter = "wait";
			scanner.filter = "button";
			scanner.scanClass(SWTBotFactory.class);
			scanner.scanClass(SWTBot.class);
			scanner.scanClass(SWTBotWorkbenchPart.class);
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

	public void scanClass(Class<?> clazz) throws Exception {
		StringBuffer sb = new StringBuffer();
		System.out.println("_____________________________________");
		System.out.println(clazz);
		sb.append(clazz+"\n");
		for(Method m : clazz.getDeclaredMethods()) {
			int mod = m.getModifiers();
			if(Modifier.isPublic(mod)) {
				if(filter!=null){
					String filter2= (""+filter.charAt(0)).toUpperCase() + filter.substring(1);
					if(m.getName().contains(filter) || m.getName().contains(filter2)) {
						System.out.println(m.getName() + " : "+m);
					}
				}
//				System.out.println(m.getName() + " : "+m);
				sb.append(m+"\n");
			}
		}
//		saveFile(clazz.getPackage().getName(), clazz.getName(), sb.toString());
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
