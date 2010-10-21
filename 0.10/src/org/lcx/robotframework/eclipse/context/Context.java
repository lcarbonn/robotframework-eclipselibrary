/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.context;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.commons.AbstractSWTBotObject;

public class Context {

	private static Context context;
	
	private AbstractSWTBotObject currentWidget;

	public static Context currentContext() {
		if(context==null) {
			context = new Context();
		}
		return context;
	}
	
	public void setWidget(AbstractSWTBotObject object) {
		currentWidget = object;
	}

	public static void setCurrentWidget(AbstractSWTBotObject widget) {
		//System.out.println("setCurrentWidget="+widget.getClass().getName());
		Context.currentContext().setWidget(widget);
	}

	public AbstractSWTBotObject getWidget() {
		return currentWidget;
	}
	
	public static AbstractSWTBotObject getCurrentWidget() {
		return Context.currentContext().getWidget();
	}
	
	public static AbstractSWTBotObject getCurrentWidget(Class<?> clazz) throws SWTBotBridgeException {
		if(Context.currentContext().getWidget()==null) {
			throw new SWTBotBridgeException("There's no widget in the context");
		}
		Class<?> c = Context.currentContext().getWidget().getClass();
		boolean isInstanceOf = false;
		while(!isInstanceOf && !c.equals(Object.class)) {
			if(c.equals(clazz)) isInstanceOf = true;	
			c = c.getSuperclass();			
		}
		
		if(!isInstanceOf) {
			Class<?> wc = Context.currentContext().getWidget().getClass();
			throw new SWTBotBridgeException("Widget (of class:"+wc.getName()+") in the context is not a instance of expected class:"+clazz.getName());
		}
		
		return Context.currentContext().getWidget();
	}
}
