/*
 * Copyright 2013 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.gef.action;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart;
import org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditor;
import org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefViewer;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class GefEditorActionKeywords {

	@RobotKeyword("Activate default tool on Gef Editor\n\n"
            + "Example:\n"
            + "| Activate Default Tool on Gef Editor |\n")
        public void activateDefaultToolOnGefEditor() throws SWTBotBridgeException {
		SWTBotGefEditor editor = (SWTBotGefEditor)Context.getCurrentWidget(SWTBotGefEditor.class);
    		editor.activateDefaultTool();
    	}
	
	@RobotKeyword("Activate tool with specified label and index on Gef Editor\n\n"
            + "Example:\n"
            + "| Activate Tool on Gef Editor | label |\n"
            + "| Activate Tool on Gef Editor | label | index |\n")
        @ArgumentNames({"*params"})
        public void activateToolOnGefEditor(String... params) throws SWTBotBridgeException {
		
	    	String label = null;
	    	int index = -1;
	    	
	    	int nbParam = params.length;
	    	if (nbParam==1) {
	    		try {
	    			index = Integer.valueOf(params[0]).intValue();
				} catch (NumberFormatException e) {
					// param is not numeric, so considered as mnemonic
					label = params[0];
				}
	    	}
	    	if(nbParam==2) {
				label = params[0];
	    		try {
	    			index = Integer.valueOf(params[1]).intValue();
				} catch (NumberFormatException e) {
					// nothing to do
				}
	    	}
			
			SWTBotGefEditor editor = (SWTBotGefEditor)Context.getCurrentWidget(SWTBotGefEditor.class);
			if(label!=null && index != -1) {
				editor.activateTool(label, index);
			} else {
				editor.activateTool(label);
			}
		
  		}
	
	@RobotKeyword("Clear the cache of edit parts on Gef Editor\n\n"
        + "Example:\n"
        + "| Clear Gef Editor |\n")
	    public void clearGefEditor() throws SWTBotBridgeException {
		SWTBotGefEditor editor = (SWTBotGefEditor)Context.getCurrentWidget(SWTBotGefEditor.class);
			editor.clear();
		}

	@RobotKeyword("Click on the edit part which owns the specified label at the top left hand corner of its bounds on Gef Editor\n\n"
            + "Example:\n"
            + "| Click On Gef Editor | label |\n")
        @ArgumentNames({"label"})
        public void clickOnGefEditor(String label) throws SWTBotBridgeException {
		SWTBotGefEditor editor = (SWTBotGefEditor)Context.getCurrentWidget(SWTBotGefEditor.class);
    		editor.click(label);
    	}

	@RobotKeyword("Click on the editor at the specified location on Gef Editor\n\n"
            + "Example:\n"
            + "| Click On Gef Editor | xPosition | yPosition |\n")
        @ArgumentNames({"xPosition", "yPosition"})
        public void clickOnGefEditor(String xPosition, String yPosition) throws SWTBotBridgeException {
			SWTBotGefEditor editor = (SWTBotGefEditor)Context.getCurrentWidget(SWTBotGefEditor.class);
			int xI = -1;
			int yI = -1;
			xI = Integer.valueOf(xPosition).intValue();
			yI = Integer.valueOf(yPosition).intValue();
			if(xI!=-1 && yI!=-1) {
	    		editor.click(xI, yI);
			}
	}

	@RobotKeyword("Click on context menu on Gef Editor\n\n"
            + "Example:\n"
            + "| Click Context Menu On Gef Editor | label |\n")
        @ArgumentNames({"label"})
        public void clickContextMenuOnGefEditor(String label) throws SWTBotBridgeException {
		SWTBotGefEditor editor = (SWTBotGefEditor)Context.getCurrentWidget(SWTBotGefEditor.class);
    		editor.clickContextMenu(label);
    	}

	@RobotKeyword("Type the given text into the graphical editor, presuming that it is already in 'direct edit' mode on Gef Editor\n\n"
            + "Example:\n"
            + "| Direct Edit Type On Gef Editor | text |\n")
        @ArgumentNames({"text"})
        public void directEditTypeOnGefEditor(String text) throws SWTBotBridgeException {
		SWTBotGefEditor editor = (SWTBotGefEditor)Context.getCurrentWidget(SWTBotGefEditor.class);
    		editor.directEditType(text);
    	}


	@RobotKeyword("Double click on the edit part which owns the specified label at the top left hand corner of its bounds on Gef Editor\n\n"
            + "Example:\n"
            + "| Double Click On Gef Editor | label |\n")
        @ArgumentNames({"label"})
        public void doubleClickOnGefEditor(String label) throws SWTBotBridgeException {
		SWTBotGefEditor editor = (SWTBotGefEditor)Context.getCurrentWidget(SWTBotGefEditor.class);
    		editor.doubleClick(label);
    	}

	@RobotKeyword("Double click on the editor at the specified location on Gef Editor\n\n"
            + "Example:\n"
            + "| Double click On Gef Editor | xPosition | yPosition |\n")
        @ArgumentNames({"xPosition", "yPosition"})
        public void doubleClickOnGefEditor(String xPosition, String yPosition) throws SWTBotBridgeException {
			SWTBotGefEditor editor = (SWTBotGefEditor)Context.getCurrentWidget(SWTBotGefEditor.class);
			int xI = -1;
			int yI = -1;
			xI = Integer.valueOf(xPosition).intValue();
			yI = Integer.valueOf(yPosition).intValue();
			if(xI!=-1 && yI!=-1) {
	    		editor.doubleClick(xI, yI);
			}
	}

	@RobotKeyword("Drag and drop the specified edit part to the specified location on Gef Editor\n\n"
            + "Example:\n"
            + "| Drag Gef Editor | label | toXPosition | toYPosition |\n")
        @ArgumentNames({"label", "xPosition", "yPosition"})
        public void dragGefEditor(String label, String toXPosition, String toYPosition) throws SWTBotBridgeException {
			SWTBotGefEditor editor = (SWTBotGefEditor)Context.getCurrentWidget(SWTBotGefEditor.class);
			int xI = -1;
			int yI = -1;
			xI = Integer.valueOf(toXPosition).intValue();
			yI = Integer.valueOf(toYPosition).intValue();
			if(xI!=-1 && yI!=-1) {
	    		editor.drag(label, xI, yI);
			}
	}

	@RobotKeyword("Drag and drop from the specified to the specified location on Gef Editor\n\n"
            + "Example:\n"
            + "| Drag Gef Editor | fromXPosition | fromYPosition | toXPosition | toYPosition |\n")
        @ArgumentNames({"fromXPosition", "fromYPosition", "xPosition", "yPosition"})
        public void dragGefEditor(String fromXPosition, String fromYPosition, String toXPosition, String toYPosition) throws SWTBotBridgeException {
			SWTBotGefEditor editor = (SWTBotGefEditor)Context.getCurrentWidget(SWTBotGefEditor.class);
			int xI = -1;
			int yI = -1;
			int fxI = -1;
			int fyI = -1;
			fxI = Integer.valueOf(fromXPosition).intValue();
			fyI = Integer.valueOf(fromYPosition).intValue();
			xI = Integer.valueOf(toXPosition).intValue();
			yI = Integer.valueOf(toYPosition).intValue();
			if(xI!=-1 && yI!=-1) {
	    		editor.drag(fxI, fyI, xI, yI);
			}
	}

	@RobotKeyword("Find the Gef EditPart with label of the current Gef Editor\n\n"
            + "Example:\n"
            + "| Find Edit Part Of Gef Editor | label |\n")
    @ArgumentNames({"label"})
    public SWTBotGefEditPart findEditPartOfGefEditor(String label) throws SWTBotBridgeException{
		SWTBotGefEditor editor = (SWTBotGefEditor)Context.getCurrentWidget(SWTBotGefEditor.class);
		SWTBotGefEditPart ep = editor.getEditPart(label);
		Context.setCurrentWidget(ep);
    	return ep;
	}
	
	@RobotKeyword("Find the Gef Main EditPart of the current Gef Editor\n\n"
            + "Example:\n"
            + "| Find Main Edit Part Of Gef Editor |\n")
    public SWTBotGefEditPart findMainEditPartOfGefEditor() throws SWTBotBridgeException{
		SWTBotGefEditor editor = (SWTBotGefEditor)Context.getCurrentWidget(SWTBotGefEditor.class);
		SWTBotGefEditPart ep = editor.mainEditPart();
		Context.setCurrentWidget(ep);
    	return ep;
	}

	@RobotKeyword("Find the wrapped SWTBotGefViewer instance of the current Gef Editor\n\n"
            + "Example:\n"
            + "| Find SWTBotGefViewer Of Gef Editor |\n")
    public SWTBotGefViewer findSWTBotGefViewerOfGefEditor() throws SWTBotBridgeException{
		SWTBotGefEditor editor = (SWTBotGefEditor)Context.getCurrentWidget(SWTBotGefEditor.class);
		SWTBotGefViewer ep = editor.getSWTBotGefViewer();
		Context.setCurrentWidget(ep);
    	return ep;
	}
	
	@RobotKeyword("Is the Gef Editor active\n\n"
            + "Example:\n"
            + "| Is Gef Editor Active |\n")
        public boolean isGefEditorActive() throws SWTBotBridgeException {
		SWTBotGefEditor editor = (SWTBotGefEditor)Context.getCurrentWidget(SWTBotGefEditor.class);
    		return editor.isActive();
    	}

	@RobotKeyword("Is the Gef Editor dirty\n\n"
            + "Example:\n"
            + "| Is Gef Editor dirty |\n")
        public boolean isGefEditorDirty() throws SWTBotBridgeException {
		SWTBotGefEditor editor = (SWTBotGefEditor)Context.getCurrentWidget(SWTBotGefEditor.class);
    		return editor.isDirty();
    	}

	@RobotKeyword("Select this edit part as a single selection on Gef Editor\n\n"
            + "Example:\n"
            + "| Select EditPart On Gef Editor | label |\n")
        @ArgumentNames({"label"})
        public void selectEditPartOnGefEditor(String label) throws SWTBotBridgeException {
		SWTBotGefEditor editor = (SWTBotGefEditor)Context.getCurrentWidget(SWTBotGefEditor.class);
    		editor.select(label);
    	}

}