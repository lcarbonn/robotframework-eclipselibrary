/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import java.util.List;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotStyledText;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class StyledTextActionKeywords {

	@RobotKeyword("Is the styledText active\n\n"
            + "Example:\n"
            + "| Is StyledText Active |\n")
        public boolean isStyledTextActive() throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		return styledText.isActive();
    	}

	@RobotKeyword("Is the styledText enabled\n\n"
            + "Example:\n"
            + "| Is StyledText Enabled |\n")
        public boolean isStyledTextEnabled() throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		return styledText.isEnabled();
    	}

	@RobotKeyword("Is the styledText visible\n\n"
            + "Example:\n"
            + "| Is StyledText Visible |\n")
        public boolean isStyledTextVisible() throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		return styledText.isVisible();
    	}

	@RobotKeyword("Get the text of the styledText\n\n"
            + "Example:\n"
            + "| Get StyledText Text |\n")
//    @ArgumentNames({"text"})
        public String getStyledTextText() throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		return styledText.getText();
    	}
	
	@RobotKeyword("Set the text of the styledText\n\n"
			+ "Example:\n"
            + "| Set StyledText Text | text |\n")
    @ArgumentNames({"text"})
        public void setStyledTextText(String text) throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
			styledText.setText(text);
    	}
	
	@RobotKeyword("Get the tooltip text of the styledText\n\n"
            + "Example:\n"
            + "| Get StyledText Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getStyledTextTooltipText() throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		return styledText.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the styledText\n\n"
            + "Example:\n"
            + "| Set Focus On StyledText |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnStyledText() throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		styledText.setFocus();
    	}
	
	@RobotKeyword("Count the styledText lines\n\n"
            + "Example:\n"
            + "| Count StyledText Lines |\n")
//    @ArgumentNames({"text"})
        public int countStyledTextLines() throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		return styledText.getLineCount();
    	}
	
	@RobotKeyword("Get the styledText selection\n\n"
            + "Example:\n"
            + "| Get StyledText Selection |\n")
//    @ArgumentNames({"text"})
        public String getStyledTextSelection() throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		return styledText.getSelection();
    	}

	@RobotKeyword("Get the text of the current line of the styledText\n\n"
            + "Example:\n"
            + "| Get Text On Current StyledText Line |\n")
//    @ArgumentNames({"text"})
        public String getTextOnCurrentStyledTextLine() throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		return styledText.getTextOnCurrentLine();
    	}

	@RobotKeyword("Get the text of the given line of the styledText\n\n"
            + "Example:\n"
            + "| Get Text On Given StyledText Line | 0 |\n")
    @ArgumentNames({"index"})
        public String getTextOnGivenStyledTextLine(String index) throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		if(index!=null) {
				Integer i = Integer.valueOf(index).intValue();
				return styledText.getTextOnLine(i);
    		}
    		return null;
    	}

	@RobotKeyword("Get the styledText lines\n\n"
            + "Example:\n"
            + "| Get StyledText Lines |\n")
//    @ArgumentNames({"text"})
        public String[] getStyledTextLines() throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		List<String> list = styledText.getLines();
    		String[] a = new String[list.size()];
    		styledText.getLines().toArray(a);
    		return a;
    	}

	@RobotKeyword("Does the current line has a bullet\n\n"
            + "Example:\n"
            + "| StyledText Has Bullet On Current Line |\n")
//    @ArgumentNames({"text"})
        public boolean styledTextHasBulletOnCurrentLine() throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		return styledText.hasBulletOnCurrentLine();
    	}

	@RobotKeyword("Does the given line has a bullet\n\n"
            + "Example:\n"
            + "| StyledText Has Bullet On Given Line |\n")
    @ArgumentNames({"index"})
        public boolean styledTextHasBulletOnGivenLine(String index) throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		if(index!=null) {
				Integer i = Integer.valueOf(index).intValue();
				return styledText.hasBulletOnLine(i);
    		}
    		return false;
    	}

	@RobotKeyword("Insert text at the end of the styledText \n\n"
            + "Example:\n"
            + "| Insert StyledText Text | text | \n")
    @ArgumentNames({"text"})
        public void insertStyledTextText(String text) throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		styledText.insertText(text);
    	}

	@RobotKeyword("Insert text at the given location of the styledText \n\n"
			+ "\t line the line number, 0 based."
            + "\t column the column number, 0 based."
			+ "Example:\n"
            + "| Insert StyledText Text At Position | 0 | 0 | text | \n")
    @ArgumentNames({"line", "column", "text"})
        public void insertStyledTextTextAtPosition(String line, String column, String text) throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		if(line!=null && column!=null) {
				Integer l = Integer.valueOf(line).intValue();
				Integer c = Integer.valueOf(column).intValue();
				styledText.insertText(l, c, text);
    		}    	
    	}

	@RobotKeyword("Navigate to the given position in the styledText \n\n"
			+ "\t line the line number, 0 based."
            + "\t column the column number, 0 based."
			+ "Example:\n"
            + "| Navigate To StyledText Position | 0 | 0 |\n")
    @ArgumentNames({"line", "column"})
        public void navigateToStyledTextPosition(String line, String column) throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		if(line!=null && column!=null) {
				Integer l = Integer.valueOf(line).intValue();
				Integer c = Integer.valueOf(column).intValue();
				styledText.navigateTo(l, c);
    		}    	
    	}

	@RobotKeyword("Select the current line of styledText \n\n"
			+ "Example:\n"
            + "| Select StyledText Current Line |\n")
//    @ArgumentNames({"line", "column"})
        public void selectStyledTextCurrentLine() throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
			styledText.selectCurrentLine();
    	}

	@RobotKeyword("Select the given line of styledText \n\n"
			+ "Example:\n"
            + "| Select StyledText Given Line |\n")
    @ArgumentNames({"line"})
        public void selectStyledTextGivenLine(String line) throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		if(line!=null) {
				Integer l = Integer.valueOf(line).intValue();
				styledText.selectLine(l);
    		}    	

    	}

	@RobotKeyword("Select styledText range\n\n"
			+ "\t line the line number, 0 based."
            + "\t column the column number, 0 based."
            + "\t length the length of the selection"
			+ "Example:\n"
            + "| Select StyledText Range | 0 | 0 | 10 | \n")
    @ArgumentNames({"line", "column", "length"})
        public void selectStyledTextRange(String line, String column, String length) throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		if(line!=null && column!=null && length!=null) {
				Integer l = Integer.valueOf(line).intValue();
				Integer c = Integer.valueOf(column).intValue();
				Integer r = Integer.valueOf(length).intValue();
				styledText.selectRange(l, c, r);
    		}    	
    	}
	/* TODO : keyboard layout for text typing
	@RobotKeyword("Type text into styledText\n\n"
			+ "Example:\n"
            + "| Type StyledText Text | text | \n")
    @ArgumentNames({"text"})
        public void typeStyledTextText(String text) throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
			styledText.typeText(text);
    	}

*/
	
	/* TODO : keyboard layout for text typing
 	@RobotKeyword("Type text into styledText with the interval between consecutive key strokes\n\n"
			+ "Example:\n"
            + "| Type StyledText Text With Interval | text | \n")
    @ArgumentNames({"text", "interval"})
        public void typeStyledTextTextWithInterval(String text, String interval) throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		Integer i = Integer.valueOf(interval).intValue();
			styledText.typeText(text, i);
    	}
*/
	
	/* TODO : keyboard layout for text typing
	@RobotKeyword("Type the text into the styledText at the given position\n\n"
			+ "\t line the line number, 0 based."
            + "\t column the column number, 0 based."
            + "\t the text to type."
			+ "Example:\n"
            + "| Type StyledText Text At Position | 0 | 0 | text |\n")
    @ArgumentNames({"line", "column", "text"})
        public void typeStyledTextTextAtPosition(String line, String column, String text) throws Exception {
    		SWTBotStyledText styledText = (SWTBotStyledText)Context.getCurrentWidget(SWTBotStyledText.class);
    		if(line!=null && column!=null) {
				Integer l = Integer.valueOf(line).intValue();
				Integer c = Integer.valueOf(column).intValue();
				styledText.typeText(l, c, text);
    		}    	
    	}
*/

}