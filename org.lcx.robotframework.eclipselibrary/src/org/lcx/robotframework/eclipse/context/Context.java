package org.lcx.robotframework.eclipse.context;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;

public class Context {

	private static Context context;
	
	private AbstractSWTBotControl currentWidget;

	public static Context currentContext() {
		if(context==null) {
			context = new Context();
		}
		return context;
	}
	
	public void setWidget(AbstractSWTBotControl widget) {
		currentWidget = widget;
	}

	public static void setCurrentWidget(AbstractSWTBotControl widget) {
		System.out.println("setCurrentWidget="+widget.getClass().getName());
		Context.currentContext().setWidget(widget);
	}

	public AbstractSWTBotControl getWidget() {
		return currentWidget;
	}
	
	public static AbstractSWTBotControl getCurrentWidget() {
		return Context.currentContext().getWidget();
	}
	
	public static AbstractSWTBotControl getCurrentWidget(Class<?> clazz) throws SWTBotBridgeException {
		if(Context.currentContext().getWidget()==null) {
			throw new SWTBotBridgeException("There's no widget in the context");
		}
		if(!Context.currentContext().getWidget().getClass().equals(clazz)) {
			Class<?> wc = Context.currentContext().getWidget().getClass();
			throw new SWTBotBridgeException("Widget (of class:"+wc.getName()+") in the context is not a instance of expected class:"+clazz.getName());
		}
		return Context.currentContext().getWidget();
	}
}
