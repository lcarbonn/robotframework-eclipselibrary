package org.lcx.robotframework.eclipse.keyword.eclipse.action;

import java.util.List;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class EclipseEditorActionKeywords {

	@RobotKeyword("Is the eclipseEditor active\n\n"
            + "Example:\n"
            + "| Is EclipseEditor Active |\n")
        public boolean isEclipseEditorActive() throws Exception {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		return eclipseEditor.isActive();
    	}

	@RobotKeyword("Close the eclipseEditor\n\n"
            + "Example:\n"
            + "| Close EclipseEditor |\n")
//    @ArgumentNames({"text"})
        public void closeEclipseEditor() throws Exception {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		eclipseEditor.close();
    	}

	@RobotKeyword("Get the title of the eclipseEditor\n\n"
            + "Example:\n"
            + "| Get EclipseEditor Title |\n")
//    @ArgumentNames({"text"})
        public String getEclipseEditorTitle() throws Exception {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		return eclipseEditor.getTitle();
    	}

	@RobotKeyword("Show the eclipseEditor\n\n"
            + "Example:\n"
            + "| Show EclipseEditor |\n")
//    @ArgumentNames({"text"})
        public void showEclipseEditor() throws Exception {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		eclipseEditor.show();
    	}

	@RobotKeyword("Set the focus on the eclipseEditor\n\n"
            + "Example:\n"
            + "| Set Focus On EclipseEditor |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnEclipseEditor() throws Exception {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		eclipseEditor.setFocus();
    	}
	
	@RobotKeyword("Get eclipseEditor toolbars tooltip\n\n"
            + "Example:\n"
            + "| Get EclipseEditor ToolbarButtons tooltip |\n")
//    @ArgumentNames({"text"})
        public String[] getEclipseEditorToolbarButtons() throws Exception {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		List<SWTBotToolbarButton> tbs = eclipseEditor.getToolbarButtons();
    		String[] l = new String[tbs.size()];
    		int i = 0;
    		for (SWTBotToolbarButton tb : tbs) {
				l[i] = tb.getToolTipText();
				i++;
			}
    		return l;
    	}
	
	@RobotKeyword("Save the eclipseEditor\n\n"
            + "Example:\n"
            + "| Save EclipseEditor |\n")
//    @ArgumentNames({"text"})
        public void saveEclipseEditor() throws Exception {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		eclipseEditor.save();
    	}

	@RobotKeyword("Save and close the eclipseEditor\n\n"
            + "Example:\n"
            + "| Save And Close EclipseEditor |\n")
//    @ArgumentNames({"text"})
        public void saveAndCloseEclipseEditor() throws Exception {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		eclipseEditor.saveAndClose();
    	}

	@RobotKeyword("Is the eclipseEditor dirty\n\n"
            + "Example:\n"
            + "| Is EclipseEditor Dirty |\n")
        public boolean isEclipseEditorDirty() throws Exception {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		return eclipseEditor.isDirty();
    	}

	
}