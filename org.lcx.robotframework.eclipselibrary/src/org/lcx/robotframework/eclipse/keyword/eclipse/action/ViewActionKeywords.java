package org.lcx.robotframework.eclipse.keyword.eclipse.action;

import java.util.List;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ViewActionKeywords {

	@RobotKeyword("Is the view active\n\n"
            + "Example:\n"
            + "| Is View Active |\n")
        public boolean isViewActive() throws Exception {
    		SWTBotView view = (SWTBotView)Context.getCurrentWidget(SWTBotView.class);
    		return view.isActive();
    	}

	@RobotKeyword("Close the view\n\n"
            + "Example:\n"
            + "| Close View |\n")
//    @ArgumentNames({"text"})
        public void closeView() throws Exception {
    		SWTBotView view = (SWTBotView)Context.getCurrentWidget(SWTBotView.class);
    		view.close();
    	}

	@RobotKeyword("Get the title of the view\n\n"
            + "Example:\n"
            + "| Get View Title |\n")
//    @ArgumentNames({"text"})
        public String getViewTitle() throws Exception {
    		SWTBotView view = (SWTBotView)Context.getCurrentWidget(SWTBotView.class);
    		return view.getTitle();
    	}

	@RobotKeyword("Show the view\n\n"
            + "Example:\n"
            + "| Show View |\n")
//    @ArgumentNames({"text"})
        public void showView() throws Exception {
    		SWTBotView view = (SWTBotView)Context.getCurrentWidget(SWTBotView.class);
    		view.show();
    	}

	@RobotKeyword("Set the focus on the view\n\n"
            + "Example:\n"
            + "| Set Focus On View |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnView() throws Exception {
    		SWTBotView view = (SWTBotView)Context.getCurrentWidget(SWTBotView.class);
    		view.setFocus();
    	}
	
	@RobotKeyword("Set the focus on the view\n\n"
            + "Example:\n"
            + "| Set Focus On View |\n")
//    @ArgumentNames({"text"})
        public String[] getViewToolbarButtons() throws Exception {
    		SWTBotView view = (SWTBotView)Context.getCurrentWidget(SWTBotView.class);
    		List<SWTBotToolbarButton> tbs = view.getToolbarButtons();
    		String[] l = new String[tbs.size()];
    		tbs.toArray(l);
    		return l;
    	}
	
}