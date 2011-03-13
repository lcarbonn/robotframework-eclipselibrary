/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.eclipse.action;

import java.util.List;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class EclipseEditorActionKeywords {

	@RobotKeyword("Is the eclipseEditor active\n\n"
            + "Example:\n"
            + "| Is EclipseEditor Active |\n")
        public boolean isEclipseEditorActive() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		return eclipseEditor.isActive();
    	}

	@RobotKeyword("Close the eclipseEditor\n\n"
            + "Example:\n"
            + "| Close EclipseEditor |\n")
//    @ArgumentNames({"text"})
        public void closeEclipseEditor() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		eclipseEditor.close();
    	}

	@RobotKeyword("Is the eclipseEditor enabled\n\n"
            + "Example:\n"
            + "| Is EclipseEditor Enabled |\n")
        public boolean isEclipseEditorEnabled() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		return eclipseEditor.isEnabled();
    	}

	@RobotKeyword("Get the title of the eclipseEditor\n\n"
            + "Example:\n"
            + "| Get EclipseEditor Title |\n")
//    @ArgumentNames({"text"})
        public String getEclipseEditorTitle() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		return eclipseEditor.getTitle();
    	}

	@RobotKeyword("Get the text of the eclipseEditor\n\n"
            + "Example:\n"
            + "| Get EclipseEditor Text |\n")
//    @ArgumentNames({"text"})
        public String getEclipseEditorText() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		return eclipseEditor.getText();
    	}
	
	@RobotKeyword("Set the text of the eclipseEditor\n\n"
			+ "Example:\n"
            + "| Set EclipseEditor Text | text |\n")
    @ArgumentNames({"text"})
        public void setEclipseEditorText(String text) throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
			eclipseEditor.setText(text);
    	}

	@RobotKeyword("Show the eclipseEditor\n\n"
            + "Example:\n"
            + "| Show EclipseEditor |\n")
//    @ArgumentNames({"text"})
        public void showEclipseEditor() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		eclipseEditor.show();
    	}

	@RobotKeyword("Set the focus on the eclipseEditor\n\n"
            + "Example:\n"
            + "| Set Focus On EclipseEditor |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnEclipseEditor() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		eclipseEditor.setFocus();
    	}
	
	@RobotKeyword("Save the eclipseEditor\n\n"
            + "Example:\n"
            + "| Save EclipseEditor |\n")
//    @ArgumentNames({"text"})
        public void saveEclipseEditor() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		eclipseEditor.save();
    	}

	@RobotKeyword("Save and close the eclipseEditor\n\n"
            + "Example:\n"
            + "| Save And Close EclipseEditor |\n")
//    @ArgumentNames({"text"})
        public void saveAndCloseEclipseEditor() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		eclipseEditor.saveAndClose();
    	}

	@RobotKeyword("Is the eclipseEditor dirty\n\n"
            + "Example:\n"
            + "| Is EclipseEditor Dirty |\n")
        public boolean isEclipseEditorDirty() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		return eclipseEditor.isDirty();
    	}

	@RobotKeyword("Does the eclipse editor has bullet on the current line\n\n"
            + "Example:\n"
            + "| Eclipse Editor Has Bullet On Current Line |\n")
        public boolean eclipseEditorHasBulletOnCurrentLine() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		return eclipseEditor.hasBulletOnCurrentLine();
    	}
	
	@RobotKeyword("Does the eclipse editor has bullet on the given line\n\n"
            + "Example:\n"
            + "| Eclipse Editor Has Bullet On Given Line | 0 | \n")
     @ArgumentNames({"line"})
       public boolean eclipseEditorHasBulletOnGivenLine(String line) throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		int i = Integer.valueOf(line).intValue();
    		return eclipseEditor.hasBulletOnLine(i);
    	}

	@RobotKeyword("Auto completes the given proposal\n\n"
			+ "\t insertText the text to be inserted before activating the auto-complete."
			+ "\t proposalText the auto-completion proposal to select from the list."
            + "Example:\n"
            + "| Auto Complete Proposal For EclipseEditor | insertText | proposalText |\n")
     @ArgumentNames({"insertText", "proposalText"})
       public void autoCompleteProposalForEclipseEditor(String insertText, String proposalText) throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		eclipseEditor.autoCompleteProposal(insertText, proposalText);
    	}

	@RobotKeyword("Gets the auto completion proposal matching the given text\n\n"
			+ "\t insertText the text to be inserted before activating the auto-complete."
            + "Example:\n"
            + "| Get Auto Complete Proposals For EclipseEditor | insertText |\n")
     @ArgumentNames({"insertText"})
       public String[] getAutoCompleteProposalsForEclipseEditor(String insertText) throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		List<String> l = eclipseEditor.getAutoCompleteProposals(insertText);
    		String[] a = new String[l.size()];
    		l.toArray(a);
    		return a;
    	}

	@RobotKeyword("Gets the lines of the eclipse editor\n\n"
            + "Example:\n"
            + "| Get EclipseEditor Lines | \n")
//     @ArgumentNames({"insertText"})
       public String[] getEclipseEditorLines() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		List<String> l = eclipseEditor.getLines();
    		String[] a = new String[l.size()];
    		l.toArray(a);
    		return a;
    	}

	@RobotKeyword("Count the lines of the eclipse editor\n\n"
            + "Example:\n"
            + "| Count EclipseEditor Line | \n")
//     @ArgumentNames({"insertText"})
       public int countEclipseEditorLine() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		return eclipseEditor.getLineCount();
    	}

	@RobotKeyword("Count the quickfix item of the eclipse editor\n\n"
            + "Example:\n"
            + "| Count EclipseEditor Quickfix Item | \n")
//     @ArgumentNames({"insertText"})
       public int countEclipseEditorQuickfixListItem() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		return eclipseEditor.getQuickfixListItemCount();
    	}

	@RobotKeyword("Gets the quick fixes of the eclipse editor\n\n"
            + "Example:\n"
            + "| Get EclipseEditor Quick Fixes | \n")
//     @ArgumentNames({"insertText"})
       public String[] getEclipseEditorQuickFixes() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		List<String> l = eclipseEditor.getQuickFixes();
    		String[] a = new String[l.size()];
    		l.toArray(a);
    		return a;
    	}

	@RobotKeyword("Gets the eclipse editor styled text\n\n"
            + "Example:\n"
            + "| Get EclipseEditor StyledText | \n")
//     @ArgumentNames({"insertText"})
       public SWTBotStyledText getEclipseEditorStyledText() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		SWTBotStyledText text = eclipseEditor.getStyledText();
    		Context.setCurrentWidget(text);
    		return text;
    	}
	
	@RobotKeyword("Gets the eclipse editor selection\n\n"
            + "Example:\n"
            + "| Get EclipseEditor Selection | \n")
//     @ArgumentNames({"insertText"})
       public String getEclipseEditorSelection() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		return eclipseEditor.getSelection();
    	}
	
	@RobotKeyword("Gets the eclipse editor text on current line\n\n"
            + "Example:\n"
            + "| Get EclipseEditor Text On Current Line | \n")
//     @ArgumentNames({"insertText"})
       public String getEclipseEditorTextOnCurrentLine() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		return eclipseEditor.getTextOnCurrentLine();
    	}

	@RobotKeyword("Gets the eclipse editor text on given line\n\n"
            + "Example:\n"
            + "| Get EclipseEditor Text On Given Line | 0 |\n")
     @ArgumentNames({"line"})
       public String getEclipseEditorTextOnGivenLine(String line) throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		int i = Integer.valueOf(line).intValue();
    		return eclipseEditor.getTextOnLine(i);
    	}

	@RobotKeyword("Gets the eclipse editor tooltip text\n\n"
            + "Example:\n"
            + "| Get EclipseEditor Tooltip Text | \n")
//     @ArgumentNames({"line"})
       public String getEclipseEditorTooltipText() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		return eclipseEditor.getToolTipText();
    	}

	@RobotKeyword("Insert text at the end of the eclipse editor \n\n"
            + "Example:\n"
            + "| Insert EclipseEditor Text | text | \n")
    @ArgumentNames({"text"})
        public void insertEclipseEditorText(String text) throws SWTBotBridgeException {
    		SWTBotEclipseEditor editor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		editor.insertText(text);
    	}

	@RobotKeyword("Insert text at the given location of the eclipseEditor \n\n"
			+ "\t line the line number, 0 based."
            + "\t column the column number, 0 based."
			+ "Example:\n"
            + "| Insert EclipseEditor Text At Position | 0 | 0 | text | \n")
    @ArgumentNames({"line", "column", "text"})
        public void insertEclipseEditorTextAtPosition(String line, String column, String text) throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		if(line!=null && column!=null) {
				Integer l = Integer.valueOf(line).intValue();
				Integer c = Integer.valueOf(column).intValue();
				eclipseEditor.insertText(l, c, text);
    		}    	
    	}

	@RobotKeyword("Navigate to the given position in the eclipseEditor \n\n"
			+ "\t line the line number, 0 based."
            + "\t column the column number, 0 based."
			+ "Example:\n"
            + "| Navigate To EclipseEditor Position | 0 | 0 |\n")
    @ArgumentNames({"line", "column"})
        public void navigateToEclipseEditorPosition(String line, String column) throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		if(line!=null && column!=null) {
				Integer l = Integer.valueOf(line).intValue();
				Integer c = Integer.valueOf(column).intValue();
				eclipseEditor.navigateTo(l, c);
    		}    	
    	}
	
	@RobotKeyword("Type text into eclipseEditor\n\n"
			+ "Example:\n"
            + "| Type EclipseEditor Text | text | \n")
    @ArgumentNames({"text"})
        public void typeEclipseEditorText(String text) throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
			eclipseEditor.typeText(text);
    	}

 	@RobotKeyword("Type text into eclipseEditor with the interval between consecutive key strokes\n\n"
			+ "Example:\n"
            + "| Type EclipseEditor Text With Interval | text | \n")
    @ArgumentNames({"text", "interval"})
        public void typeEclipseEditorTextWithInterval(String text, String interval) throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		Integer i = Integer.valueOf(interval).intValue();
			eclipseEditor.typeText(text, i);
    	}

	@RobotKeyword("Type the text into the eclipseEditor at the given position\n\n"
			+ "\t line the line number, 0 based."
            + "\t column the column number, 0 based."
            + "\t the text to type."
			+ "Example:\n"
            + "| Type EclipseEditor Text At Position | 0 | 0 | text |\n")
    @ArgumentNames({"line", "column", "text"})
        public void typeEclipseEditorTextAtPosition(String line, String column, String text) throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		if(line!=null && column!=null) {
				Integer l = Integer.valueOf(line).intValue();
				Integer c = Integer.valueOf(column).intValue();
				eclipseEditor.typeText(l, c, text);
    		}    	
    	}

	@RobotKeyword("Applys a quick fix item with the given name to the eclipseEditor\n\n"
			+ "Example:\n"
            + "| Quickfix EclipseEditor | text |\n")
    @ArgumentNames({"text"})
        public void quickfixEclipseEditor(String text) throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
			eclipseEditor.quickfix(text);
    	}
	
	@RobotKeyword("Applys a quick fix item with the given index to the eclipseEditor\n\n"
			+ "\t quickFixIndex the index of the quickfix item to apply"
			+ "Example:\n"
            + "| Quickfix Index EclipseEditor | 0 |\n")
    @ArgumentNames({"quickFixIndex"})
        public void quickfixIndexEclipseEditor(String quickFixIndex) throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		Integer i = Integer.valueOf(quickFixIndex).intValue();
			eclipseEditor.quickfix(i);
    	}
	
	@RobotKeyword("Select the current line of eclipseEditor \n\n"
			+ "Example:\n"
            + "| Select EclipseEditor Current Line |\n")
//    @ArgumentNames({"line", "column"})
        public void selectEclipseEditorCurrentLine() throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
			eclipseEditor.selectCurrentLine();
    	}

	@RobotKeyword("Select the given line of eclipseEditor \n\n"
			+ "Example:\n"
            + "| Select EclipseEditor Given Line |\n")
    @ArgumentNames({"line"})
        public void selectEclipseEditorGivenLine(String line) throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		if(line!=null) {
				Integer l = Integer.valueOf(line).intValue();
				eclipseEditor.selectLine(l);
    		}    	
    	}

	@RobotKeyword("Select eclipseEditor range\n\n"
			+ "\t line the line number, 0 based."
            + "\t column the column number, 0 based."
            + "\t length the length of the selection"
			+ "Example:\n"
            + "| Select EclipseEditor Range | 0 | 0 | 10 | \n")
    @ArgumentNames({"line", "column", "length"})
        public void selectEclipseEditorRange(String line, String column, String length) throws SWTBotBridgeException {
    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
    		if(line!=null && column!=null && length!=null) {
				Integer l = Integer.valueOf(line).intValue();
				Integer c = Integer.valueOf(column).intValue();
				Integer r = Integer.valueOf(length).intValue();
				eclipseEditor.selectRange(l, c, r);
    		}    	
    	}
	
//	@RobotKeyword("Presses the shortcut specified by the given keys\n\n"
//			+ "Parameters:\n"
//			+ "\t modificationKeys the combination of SWT.ALT | SWT.CTRL | SWT.SHIFT | SWT.COMMAND.\n"
//			+ "\t c the character.\n"
//			+ "Example:\n"
//            + "| Press EclipseEditor Shortcut | SWT.CTRL+SWT.ALT | a \n")
//    @ArgumentNames({"modificationKeys", "char"})
//        public void pressEclipseEditorShortcut(String modificationKeys, String column) throws Exception {
//    		SWTBotEclipseEditor eclipseEditor = (SWTBotEclipseEditor)Context.getCurrentWidget(SWTBotEclipseEditor.class);
//    		StringTokenizer st = new StringTokenizer(modificationKeys, "+");
//    		while(st.hasMoreTokens()) {
//    			String mk = st.nextToken().trim();
//    		}
//			eclipseEditor.pressShortcut(param0, param1)
//    	}
	
}