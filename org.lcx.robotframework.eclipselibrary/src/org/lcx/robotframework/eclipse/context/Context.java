package org.lcx.robotframework.eclipse.context;

import org.lcx.robotframework.swtbot.swt.finder.widget.SWTBotWidget;

public class Context {

	private static Context context;
	
	private SWTBotWidget currentWidget;

	public static Context currentContext() {
		if(context==null) {
			context = new Context();
		}
		return context;
	}
	
	public void setWidget(SWTBotWidget widget) {
		currentWidget = widget;
	}

	public static void setCurrentWidget(SWTBotWidget widget) {
		Context.currentContext().setWidget(widget);
	}

	public SWTBotWidget getWidget() {
		return currentWidget;
	}
	
	public static SWTBotWidget getCurrentWidget() {
		return Context.currentContext().getWidget();
	}
	
}
