/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.eclipse.action;

import java.util.List;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotToolbarButton;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class EditorActionKeywords {

	@RobotKeyword("Is the editor active\n\n"
            + "Example:\n"
            + "| Is Editor Active |\n")
        public boolean isEditorActive() throws Exception {
    		SWTBotEditor editor = (SWTBotEditor)Context.getCurrentWidget(SWTBotEditor.class);
    		return editor.isActive();
    	}

	@RobotKeyword("Close the editor\n\n"
            + "Example:\n"
            + "| Close Editor |\n")
//    @ArgumentNames({"text"})
        public void closeEditor() throws Exception {
    		SWTBotEditor editor = (SWTBotEditor)Context.getCurrentWidget(SWTBotEditor.class);
    		editor.close();
    	}

	@RobotKeyword("Get the title of the editor\n\n"
            + "Example:\n"
            + "| Get Editor Title |\n")
//    @ArgumentNames({"text"})
        public String getEditorTitle() throws Exception {
    		SWTBotEditor editor = (SWTBotEditor)Context.getCurrentWidget(SWTBotEditor.class);
    		return editor.getTitle();
    	}

	@RobotKeyword("Show the editor\n\n"
            + "Example:\n"
            + "| Show Editor |\n")
//    @ArgumentNames({"text"})
        public void showEditor() throws Exception {
    		SWTBotEditor editor = (SWTBotEditor)Context.getCurrentWidget(SWTBotEditor.class);
    		editor.show();
    	}

	@RobotKeyword("Set the focus on the editor\n\n"
            + "Example:\n"
            + "| Set Focus On Editor |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnEditor() throws Exception {
    		SWTBotEditor editor = (SWTBotEditor)Context.getCurrentWidget(SWTBotEditor.class);
    		editor.setFocus();
    	}
	
	@RobotKeyword("Get editor toolbars tooltip\n\n"
            + "Example:\n"
            + "| Get Editor ToolbarButtons tooltip |\n")
//    @ArgumentNames({"text"})
        public String[] getEditorToolbarButtons() throws Exception {
    		SWTBotEditor editor = (SWTBotEditor)Context.getCurrentWidget(SWTBotEditor.class);
    		List<SWTBotToolbarButton> tbs = editor.getToolbarButtons();
    		String[] l = new String[tbs.size()];
    		int i =0;
    		for (SWTBotToolbarButton tb : tbs) {
				l[i] = tb.getToolTipText();
				i++;
			}
    		return l;
    	}
	
	@RobotKeyword("Save the editor\n\n"
            + "Example:\n"
            + "| Save Editor |\n")
//    @ArgumentNames({"text"})
        public void saveEditor() throws Exception {
    		SWTBotEditor editor = (SWTBotEditor)Context.getCurrentWidget(SWTBotEditor.class);
    		editor.save();
    	}

	@RobotKeyword("Save and close the editor\n\n"
            + "Example:\n"
            + "| Save And Close Editor |\n")
//    @ArgumentNames({"text"})
        public void saveAndCloseEditor() throws Exception {
    		SWTBotEditor editor = (SWTBotEditor)Context.getCurrentWidget(SWTBotEditor.class);
    		editor.saveAndClose();
    	}

	@RobotKeyword("Is the editor dirty\n\n"
            + "Example:\n"
            + "| Is Editor Dirty |\n")
        public boolean isEditorDirty() throws Exception {
    		SWTBotEditor editor = (SWTBotEditor)Context.getCurrentWidget(SWTBotEditor.class);
    		return editor.isDirty();
    	}

	
}