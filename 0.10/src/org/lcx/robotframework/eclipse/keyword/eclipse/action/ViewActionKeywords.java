/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.eclipse.action;

import java.util.List;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotView;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotViewMenu;
import org.robotframework.javalib.annotation.ArgumentNames;
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
	
	@RobotKeyword("Get a menu item matching the give label and optional index on the view\n\n"
            + "Example:\n"
            + "| Get View Menu |\n")
    @ArgumentNames({"label", "*index"})
        public void getViewMenu(String label, String... index) throws Exception {
    		SWTBotView view = (SWTBotView)Context.getCurrentWidget(SWTBotView.class);
    		int ind = -1;
    		try {
        		ind = Integer.valueOf(index[0]).intValue();
			} catch (Exception e) {
				// nothing to do
			}
    		if(ind!=-1) {
    			Context.setCurrentWidget(view.menu(label, ind));
    		} else {
    			Context.setCurrentWidget(view.menu(label));
    		}
    	}

	@RobotKeyword("Get the list of menus label of the view\n\n"
            + "Example:\n"
            + "| Get View Menus Label |\n")
//    @ArgumentNames({"text"})
        public String[] getViewMenusLabel() throws Exception {
    		SWTBotView view = (SWTBotView)Context.getCurrentWidget(SWTBotView.class);
    		List<SWTBotViewMenu> tbs = view.menus();
    		String[] l = new String[tbs.size()];
    		int i = 0;
    		for (SWTBotViewMenu menu : tbs) {
				l[i] = menu.getText();
				i++;
			}
    		return l;
    	}

}