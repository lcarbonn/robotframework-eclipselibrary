package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class StyledTextKeywords {
	

    @RobotKeyword("Select the first StyledText\n\n"
            + "Example:\n"
            + "| Select Styled Text | \n")
//    @ArgumentNames({"text"})
        public void selectStyledText() throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	bot.styledText();
    }
    
    @RobotKeyword("Select StyledText with the given mnemonicText\n\n"
            + "Example:\n"
            + "| Select Styled Text With Text | New Task | \n")
    @ArgumentNames({"mnemonicText"})
        public void selectStyledTextWithText(String mnemonicText) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	bot.styledText(mnemonicText);
    }

    @RobotKeyword("Select the indexed StyledText with the given mnemonicText\n\n"
            + "Example:\n"
            + "| Select Indexed Styled Text With Text | New Task | 0 | \n")
    @ArgumentNames({"mnemonicText", "index"})
        public void selectIndexedStyledTextWithText(String mnemonicText, String index) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	bot.styledText(mnemonicText, indexI);
    }

    @RobotKeyword("Select the indexed StyledText\n\n"
            + "Example:\n"
            + "| Select Indexed Styled Text | 0 | \n")
    @ArgumentNames({"index"})
        public void selectIndexedStyledText(String index) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	bot.styledText(indexI);
    }
    
    @RobotKeyword("Set text into the indexed StyledText\n\n"
            + "Example:\n"
            + "| Set Text Into Indexed Styled Text | New Task | this is a foo |\n")
    @ArgumentNames({"index", "text"})
        public void setTextIntoIndexedStyledText(String index, String text) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	bot.styledText(indexI).setText(text);
    }	
	
    @RobotKeyword("Text of indexed StyledText should be equal to the given text.\n\n"
            + "Example:\n"
            + "| Styled Text Should Be Equal | username | foo |\n")
    @ArgumentNames({"index", "text"})
        public void styledTextShouldBeEqual(String index, String text) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	String s = bot.styledText(indexI).getText();
    	assertTrue(s.equals(text));
    }	
    
    @RobotKeyword("Lines of indexed StyledText should be equal to the givens text.\n\n"
            + "Example:\n"
            + "| Styled Text Lines Should Be Equal | 0 | line1 | line2 |\n")
    @ArgumentNames({"index", "*lines"})
        public void styledTextLinesShouldBeEqual(String index, String... lines) throws Exception {
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	int indexI = Integer.valueOf(index).intValue();
    	List<String> ls = bot.styledText(indexI).getLines();
    	assertTrue(ls.size()==lines.length);
    	int i=0;
    	for (String s : ls) {
    		assertTrue(s.equals(lines[i++]));
    	}
    }	

}
