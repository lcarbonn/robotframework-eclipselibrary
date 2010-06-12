package org.lcx.robotframework.tools;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.swt.finder.widgets.AbstractSWTBot;
import org.eclipse.swtbot.swt.finder.widgets.AbstractSWTBotControl;

public class MethodExporter {
	
	public static String oldPackage = "org.eclipse.swtbot";
	public static String newPackage = "org.lcx.robotframework.swtbot";
	public static String absPrefix = "Abstract";

	
//	public static String newException = "org.lcx.robotframework.eclipse.bridge.abs.SWTBotBridgeException";
	public static String directory = "D:/workspaces/Workspace_Mylyn_e35_sv3/org.lcx.robotframework.eclipselibrary-interface/gensrc/";
	public static String javaext = ".java";

	public static ArrayList<Class<?>> scanedClassList = new ArrayList<Class<?>>();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class<?> clazz = SWTWorkbenchBot.class;
//			Class<?> clazz = AbstractSWTBotControl.class;
			MethodExporter explorer = new MethodExporter();
			ArrayList<Class<?>> classList = new ArrayList<Class<?>>();
			explorer.exploreClass(clazz, classList);
			explorer.scanClass(classList);
			
//			for(Class<?> cla : scanedClassList) {
//				System.out.println("scanedClass="+cla);
//			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void scanClass(ArrayList<Class<?>> classList) throws Exception {
		for (Class<?> clazzz : classList) {
			ArrayList<Class<?>> classList2 = new ArrayList<Class<?>>();
			this.exploreClass(clazzz, classList2);
			this.scanClass(classList2);
		}
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
	
	public String exploreClass(Class<?> clazz, ArrayList<Class<?>> classList) throws Exception {
		System.out.println("exploreClass: "+clazz.getName());
		StringBuffer sb = new StringBuffer();
		String pack = clazz.getPackage().getName();
		sb.append("package "+ pack + ";");
		sb.append("\n\n");
		
		String name = absPrefix + clazz.getSimpleName();
		
		int mod = clazz.getModifiers();
		if(Modifier.isPublic(mod)) {
			sb.append("public ");
		}
		if(!clazz.isInterface()) {
			sb.append("abstract class " + name);
		} else if(clazz.isInterface()){
			sb.append("interface " + name);
		} else if(clazz.isEnum()){
			sb.append("enum " + name);
		}

		if(clazz.getTypeParameters().length!=0) {
			sb.append("<");
			boolean f = true;
			for(TypeVariable<?> tv : clazz.getTypeParameters()) {
				if(!f) sb.append(", ");
//				System.out.println("tp="+tv+", "+tv.getGenericDeclaration());
				sb.append(tv);
				for(Type type : tv.getBounds()) {
					Class<?> c = (Class<?>)type;
//					System.out.println("bound="+((Class<?>)type).getName());
					if(c.getName().startsWith(oldPackage)) {
						sb.append(" extends "+ c.getPackage().getName()+ "." + absPrefix+c.getSimpleName());
					} else {
						sb.append(" extends "+c.getName());
					}
				}
				f = false;
			}
			sb.append(">");
		}		
				
		
		if(clazz.getSuperclass() !=null && !clazz.isEnum()) {
//			System.out.println("class="+clazz.getName()+", superclass="+clazz.getSuperclass().getName());
			sb.append(" extends ");
			if(clazz.getSuperclass().getName().startsWith(oldPackage)) {
				sb.append(clazz.getSuperclass().getPackage().getName() + "." + absPrefix + clazz.getSuperclass().getSimpleName());
				if(!scanedClassList.contains(clazz.getSuperclass())) {
					classList.add(clazz.getSuperclass());
					scanedClassList.add(clazz.getSuperclass());
				}
			} else {
				sb.append(clazz.getSuperclass().getName());
			}
			if(clazz.getSuperclass().getTypeParameters().length!=0) {
				sb.append("<");
				boolean f = true;
				for(TypeVariable<?> tv : clazz.getSuperclass().getTypeParameters()) {
					if(!f) sb.append(", ");
					for(Type type : tv.getBounds()) {
						System.out.println("bound="+((Class<?>)type).getName());
						Class<?> c = ((Class<?>)type);
						if(c.getName().startsWith(oldPackage)) {
							sb.append(c.getPackage().getName()+ "." + absPrefix+c.getSimpleName());
						} else {
							sb.append(c.getName());
						}
					}
					
					f = false;
				}
				sb.append(">");
			}			
			
		}

		boolean first = true;
		for (Class<?> parent : clazz.getInterfaces()) {
			if(first) {
				if(clazz.isInterface()) sb.append(" extends ");	
				else  sb.append(" implements ");
			}
			else sb.append(", ");
			if(parent.getName().startsWith(oldPackage)) {
				sb.append(parent.getPackage().getName() + "." + absPrefix + parent.getSimpleName());
				if(!scanedClassList.contains(parent)) {
					classList.add(parent);
					scanedClassList.add(parent);
				}
			} else {
				sb.append(parent.getName());
			}
			
			first = false;
		}
		sb.append(" {\n\n");

		if(!clazz.isEnum()) {
			for (Method m : clazz.getDeclaredMethods()) {
				int modm = m.getModifiers();
				if((Modifier.isPublic(modm) || Modifier.isProtected(modm))  && !m.isSynthetic()) {
					String s = toGenericString(m, classList);
	//				System.out.println(m.toGenericString()+", "+m.isSynthetic()+", "+m.isBridge());
		//			s = s.replace(oldPackage, newPackage);
					sb.append("\t"+s+"\n");
				}
			}
		}
		sb.append("\n");
		sb.append("}\n");

		String source = sb.toString().replace(oldPackage, newPackage); 
		source = source.replace("transient ", "");
		this.saveFile(pack.replace(oldPackage, newPackage), name, source);
		
		return sb.toString();
	}
	
    public String toGenericString(Method m, ArrayList<Class<?>> classList) {
//    	System.out.println("m="+m);
    	try {
    	    StringBuilder sb = new StringBuilder();
//    	    int mod = m.getModifiers();
    	    sb.append("public abstract ");
//    		if(!Modifier.isPublic(mod)) sb.append("public abstract ");
//    		if(!Modifier.isProtected(mod)) sb.append("protected abstract ");
//	    	}
//    		if(!Modifier.isStatic(mod)) sb.append(" static ");
//    		if(!Modifier.isFinal(mod)) sb.append(" final ");
    		
    		// parameters
    	    Type[] typeparms = m.getTypeParameters();
    	    if (typeparms.length > 0) {
    		boolean first = true;
    		sb.append("<");

    		for(Type typeparm: typeparms) {
    		    if (!first)
    			sb.append(",");
    		    if (typeparm instanceof Class<?>) {
	//    			sb.append(((Class)typeparm).getName());
//    				sb.append(((Class<?>)typeparm).getPackage().getName());
    		    	Class<?> c = ((Class<?>)typeparm);
    				if(c.getName().startsWith(oldPackage)) {
						if(!scanedClassList.contains(c)) {
							classList.add(c);
							scanedClassList.add(c);
						}
    		    		sb.append(c.getPackage().getName() + "." + absPrefix + c.getSimpleName());
    				} else {
    		    		sb.append(c.getName());
    				}
    		    }
    		    else
    			sb.append(typeparm.toString());
//    		    sb.append(" type"+i++);
    		    first = false;
    		}
    		sb.append("> ");
    	    }


    	    // return types
    	    Type genRetType = m.getGenericReturnType();
    	    Class<?> retType = m.getReturnType();

//    	    System.out.println("genRetType="+genRetType+", retType"+retType);
    	    String c = genRetType.toString();
   	    	if(c.indexOf("<? extends ")!=-1) {
   	    		sb.append(getGenType(retType, c, "<? extends "));
	    	} else if (c.indexOf("<")!=-1) {
//	    		System.out.println("gagné");
//	    		System.out.println(getGenType(retType, c, "<"));
   	    		sb.append(getGenType(retType, c, "<") + " ");
    	    } else if(genRetType instanceof Class<?>) {
        	    	sb.append(getTypeName((Class<?>)genRetType, classList)  + " ");
    	    } else {
    	    	sb.append(genRetType.toString()  + " ");
    	    }
   	    	
    	    // generic parameters
    	    sb.append(m.getName() + "(");
    	    Type[] params = m.getGenericParameterTypes();
    	    for (int j = 0; j < params.length; j++) {
    	    	if((params[j] instanceof Class<?>)) {
    	    		sb.append(getTypeName((Class<?>)params[j], classList));
    	    	} else {
    	    		String p = params[j].toString();
    	    		if(p.startsWith(oldPackage)) {
    	    			p = p.substring(0, p.indexOf('<'));
    	    			Class<?> cp = Class.forName(p);
						if(!scanedClassList.contains(cp)) {
							classList.add(cp);
							scanedClassList.add(cp);
						}
						sb.append(cp.getPackage().getName() + "." + absPrefix + cp.getSimpleName());
    	    		} else {
    	    			sb.append((params[j].toString()));
    	    		}
    	    	}

    		sb.append(" param"+j);
    		if (j < (params.length - 1))
    		    sb.append(",");
    	    }
    	    sb.append(")");

   	    	// exceptions
   	    	Type[] exceptions = m.getGenericExceptionTypes();
    	    if (exceptions.length > 0) {
	    		sb.append(" throws ");
	    		for (int k = 0; k < exceptions.length; k++) {
	    		    sb.append((exceptions[k] instanceof Class<?>)?
	//    			      ((Class<?>)exceptions[k]).getName():
				    	  getTypeName((Class<?>)exceptions[k], classList):
	    			      exceptions[k].toString());
	    		    if (k < (exceptions.length - 1))
	    			sb.append(",");
	    		}
    	    }
    	    sb.append(";");
    	    return sb.toString();
    	} catch (Exception e) {
    		e.printStackTrace();
    	    return "<" + e + ">";
    	}
        }
	
    public String getTypeName(Class<?> type, ArrayList<Class<?>> classList) {
    	if (type.isArray()) {
    	    try {
    		Class<?> cl = type;
    		int dimensions = 0;
    		while (cl.isArray()) {
    		    dimensions++;
    		    cl = cl.getComponentType();
    		}
    		StringBuffer sb = new StringBuffer();

    		if(cl.getName().startsWith(oldPackage)) {
				if(!scanedClassList.contains(cl)) {
					classList.add(cl);
					scanedClassList.add(cl);
				}
        		sb.append(cl.getPackage().getName() + "." + absPrefix + cl.getSimpleName());
    		} else {
        		sb.append(cl.getName());
    		}
    		for (int i = 0; i < dimensions; i++) {
    		    sb.append("[]");
    		}
    		return sb.toString();
    	    } catch (Throwable e) {
    	    	e.printStackTrace();
    	   	/*FALLTHRU*/ 
    	    }
    	}
//    	return type.getName();
    	StringBuffer sb = new StringBuffer();
//    	System.out.println("type="+type + ", "+type.isPrimitive());
    	if(!type.isPrimitive()) {
			if(type.getName().startsWith(oldPackage)) {
				if(!scanedClassList.contains(type)) {
					classList.add(type);
					scanedClassList.add(type);
				}

	    		sb.append(type.getPackage().getName() + "." + absPrefix + type.getSimpleName());
			} else {
	    		sb.append(type.getName());
			}
			
    	} else {

				if(type.getName().startsWith(oldPackage)) {

					if(!scanedClassList.contains(type)) {
						classList.add(type);
						scanedClassList.add(type);
					}

		    		sb.append(type.getPackage().getName() + "." + absPrefix + type.getSimpleName());
				} else {
		    		sb.append(type.getName());
				}
		}
		return sb.toString();
      }

    private String getGenType(Class<?> retType, String c, String start) {
    	if(c.contains(oldPackage)) {
	    	StringBuffer sb = new StringBuffer();
			int beginIndex = c.indexOf(start)+start.length();
			int endIndex = c.lastIndexOf(">");
			String claa = c.substring(beginIndex, endIndex);
			sb.append(retType.getPackage().getName() +"." + absPrefix + retType.getSimpleName());
			if(claa.lastIndexOf('.')!=-1 && claa.contains(oldPackage)) {
				String pac = claa.substring(0, claa.lastIndexOf('.'));
				String cl = claa.substring(claa.lastIndexOf('.')+1);
	//			System.out.println("claa="+claa+", pac="+pac+", cl="+cl);
				sb.append(start+pac + "." + absPrefix + cl +">");
			} else {
				sb.append(start + claa +">");
			}
			return sb.toString();
    	}
    	return c;
    }

}
