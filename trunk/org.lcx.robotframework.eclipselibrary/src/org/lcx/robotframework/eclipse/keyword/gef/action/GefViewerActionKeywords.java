/*
 * Copyright 2013 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.gef.action;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefEditPart;
import org.lcx.robotframework.swtbot.eclipse.gef.finder.widgets.SWTBotGefViewer;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class GefViewerActionKeywords {

	@RobotKeyword("Activate default tool on Gef Viewer\n\n"
            + "Example:\n"
            + "| Activate Default Tool on Gef Viewer |\n")
        public void activateDefaultToolOnGefViewer() throws SWTBotBridgeException {
		SWTBotGefViewer viewer = (SWTBotGefViewer)Context.getCurrentWidget(SWTBotGefViewer.class);
    		viewer.activateDefaultTool();
    	}
	
	@RobotKeyword("Activate tool with specified label and index on Gef Viewer\n\n"
            + "Example:\n"
            + "| Activate Tool on Gef Viewer | label |\n"
            + "| Activate Tool on Gef Viewer | label | index |\n")
        @ArgumentNames({"*params"})
        public void activateToolOnGefViewer(String... params) throws SWTBotBridgeException {
		
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
			
			SWTBotGefViewer viewer = (SWTBotGefViewer)Context.getCurrentWidget(SWTBotGefViewer.class);
			if(label!=null && index != -1) {
				viewer.activateTool(label, index);
			} else {
				viewer.activateTool(label);
			}
		
  		}
	
	@RobotKeyword("Clear the cache of edit parts on Gef Viewer\n\n"
        + "Example:\n"
        + "| Clear Gef Viewer |\n")
	    public void clearGefViewer() throws SWTBotBridgeException {
		SWTBotGefViewer viewer = (SWTBotGefViewer)Context.getCurrentWidget(SWTBotGefViewer.class);
			viewer.clear();
		}

	@RobotKeyword("Click on the edit part which owns the specified label at the top left hand corner of its bounds on Gef Viewer\n\n"
            + "Example:\n"
            + "| Click On Gef Viewer | label |\n")
        @ArgumentNames({"label"})
        public void clickOnGefViewer(String label) throws SWTBotBridgeException {
		SWTBotGefViewer viewer = (SWTBotGefViewer)Context.getCurrentWidget(SWTBotGefViewer.class);
    		viewer.click(label);
    	}

	@RobotKeyword("Click on the viewer at the specified location on Gef Viewer\n\n"
            + "Example:\n"
            + "| Click On Gef Viewer | xPosition | yPosition |\n")
        @ArgumentNames({"xPosition", "yPosition"})
        public void clickOnGefViewer(String xPosition, String yPosition) throws SWTBotBridgeException {
			SWTBotGefViewer viewer = (SWTBotGefViewer)Context.getCurrentWidget(SWTBotGefViewer.class);
			int xI = -1;
			int yI = -1;
			xI = Integer.valueOf(xPosition).intValue();
			yI = Integer.valueOf(yPosition).intValue();
			if(xI!=-1 && yI!=-1) {
	    		viewer.click(xI, yI);
			}
	}

	@RobotKeyword("Click on context menu on Gef Viewer\n\n"
            + "Example:\n"
            + "| Click Context Menu On Gef Viewer | label |\n")
        @ArgumentNames({"label"})
        public void clickContextMenuOnGefViewer(String label) throws SWTBotBridgeException {
		SWTBotGefViewer viewer = (SWTBotGefViewer)Context.getCurrentWidget(SWTBotGefViewer.class);
    		viewer.clickContextMenu(label);
    	}

	@RobotKeyword("Type the given text into the graphical viewer, presuming that it is already in 'direct edit' mode on Gef Viewer\n\n"
            + "Example:\n"
            + "| Direct Edit Type On Gef Viewer | text |\n")
        @ArgumentNames({"text"})
        public void directEditTypeOnGefViewer(String text) throws SWTBotBridgeException {
		SWTBotGefViewer viewer = (SWTBotGefViewer)Context.getCurrentWidget(SWTBotGefViewer.class);
    		viewer.directEditType(text);
    	}


	@RobotKeyword("Double click on the edit part which owns the specified label at the top left hand corner of its bounds on Gef Viewer\n\n"
            + "Example:\n"
            + "| Double Click On Gef Viewer | label |\n")
        @ArgumentNames({"label"})
        public void doubleClickOnGefViewer(String label) throws SWTBotBridgeException {
		SWTBotGefViewer viewer = (SWTBotGefViewer)Context.getCurrentWidget(SWTBotGefViewer.class);
    		viewer.doubleClick(label);
    	}

	@RobotKeyword("Double click on the viewer at the specified location on Gef Viewer\n\n"
            + "Example:\n"
            + "| Double click On Gef Viewer | xPosition | yPosition |\n")
        @ArgumentNames({"xPosition", "yPosition"})
        public void doubleClickOnGefViewer(String xPosition, String yPosition) throws SWTBotBridgeException {
			SWTBotGefViewer viewer = (SWTBotGefViewer)Context.getCurrentWidget(SWTBotGefViewer.class);
			int xI = -1;
			int yI = -1;
			xI = Integer.valueOf(xPosition).intValue();
			yI = Integer.valueOf(yPosition).intValue();
			if(xI!=-1 && yI!=-1) {
	    		viewer.doubleClick(xI, yI);
			}
	}

	@RobotKeyword("Drag and drop the specified edit part to the specified location on Gef Viewer\n\n"
            + "Example:\n"
            + "| Drag Gef Viewer | label | toXPosition | toYPosition |\n")
        @ArgumentNames({"label", "xPosition", "yPosition"})
        public void dragGefViewer(String label, String toXPosition, String toYPosition) throws SWTBotBridgeException {
			SWTBotGefViewer viewer = (SWTBotGefViewer)Context.getCurrentWidget(SWTBotGefViewer.class);
			int xI = -1;
			int yI = -1;
			xI = Integer.valueOf(toXPosition).intValue();
			yI = Integer.valueOf(toYPosition).intValue();
			if(xI!=-1 && yI!=-1) {
	    		viewer.drag(label, xI, yI);
			}
	}

	@RobotKeyword("Drag and drop from the specified to the specified location on Gef Viewer\n\n"
            + "Example:\n"
            + "| Drag Gef Viewer | fromXPosition | fromYPosition | toXPosition | toYPosition |\n")
        @ArgumentNames({"fromXPosition", "fromYPosition", "xPosition", "yPosition"})
        public void dragGefViewer(String fromXPosition, String fromYPosition, String toXPosition, String toYPosition) throws SWTBotBridgeException {
			SWTBotGefViewer viewer = (SWTBotGefViewer)Context.getCurrentWidget(SWTBotGefViewer.class);
			int xI = -1;
			int yI = -1;
			int fxI = -1;
			int fyI = -1;
			fxI = Integer.valueOf(fromXPosition).intValue();
			fyI = Integer.valueOf(fromYPosition).intValue();
			xI = Integer.valueOf(toXPosition).intValue();
			yI = Integer.valueOf(toYPosition).intValue();
			if(xI!=-1 && yI!=-1) {
	    		viewer.drag(fxI, fyI, xI, yI);
			}
	}

	@RobotKeyword("Find the Gef EditPart with label of the current Gef Viewer\n\n"
            + "Example:\n"
            + "| Find Edit Part Of Gef Viewer | label |\n")
    @ArgumentNames({"label"})
    public SWTBotGefEditPart findEditPartOfGefViewer(String label) throws SWTBotBridgeException{
		SWTBotGefViewer viewer = (SWTBotGefViewer)Context.getCurrentWidget(SWTBotGefViewer.class);
		SWTBotGefEditPart ep = viewer.getEditPart(label);
		Context.setCurrentWidget(ep);
    	return ep;
	}
	
	@RobotKeyword("Find the Gef Main EditPart of the current Gef Viewer\n\n"
            + "Example:\n"
            + "| Find Main Edit Part Of Gef Viewer |\n")
    public SWTBotGefEditPart findMainEditPartOfGefViewer() throws SWTBotBridgeException{
		SWTBotGefViewer viewer = (SWTBotGefViewer)Context.getCurrentWidget(SWTBotGefViewer.class);
		SWTBotGefEditPart ep = viewer.mainEditPart();
		Context.setCurrentWidget(ep);
    	return ep;
	}

	@RobotKeyword("Select this edit part as a single selection on Gef Viewer\n\n"
            + "Example:\n"
            + "| Select EditPart Of Gef Viewer | label |\n")
        @ArgumentNames({"label"})
        public void selectEditPartOfGefViewer(String label) throws SWTBotBridgeException {
		SWTBotGefViewer viewer = (SWTBotGefViewer)Context.getCurrentWidget(SWTBotGefViewer.class);
    		viewer.select(label);
    	}

}