/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotDateTime;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class DateTimeActionKeywords {

	@RobotKeyword("Is the dateTime active\n\n"
            + "Example:\n"
            + "| Is DateTime Active |\n")
        public boolean isDateTimeActive() throws Exception {
    		SWTBotDateTime dateTime = (SWTBotDateTime)Context.getCurrentWidget(SWTBotDateTime.class);
    		return dateTime.isActive();
    	}

	@RobotKeyword("Is the dateTime enabled\n\n"
            + "Example:\n"
            + "| Is DateTime Enabled |\n")
        public boolean isDateTimeEnabled() throws Exception {
    		SWTBotDateTime dateTime = (SWTBotDateTime)Context.getCurrentWidget(SWTBotDateTime.class);
    		return dateTime.isEnabled();
    	}

	@RobotKeyword("Is the dateTime visible\n\n"
            + "Example:\n"
            + "| Is DateTime Visible |\n")
        public boolean isDateTimeVisible() throws Exception {
    		SWTBotDateTime dateTime = (SWTBotDateTime)Context.getCurrentWidget(SWTBotDateTime.class);
    		return dateTime.isVisible();
    	}

	@RobotKeyword("Get the text of the dateTime\n\n"
            + "Example:\n"
            + "| Get DateTime Text |\n")
//    @ArgumentNames({"text"})
        public String getDateTimeText() throws Exception {
    		SWTBotDateTime dateTime = (SWTBotDateTime)Context.getCurrentWidget(SWTBotDateTime.class);
    		return dateTime.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the dateTime\n\n"
            + "Example:\n"
            + "| Get DateTime Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getDateTimeTooltipText() throws Exception {
    		SWTBotDateTime dateTime = (SWTBotDateTime)Context.getCurrentWidget(SWTBotDateTime.class);
    		return dateTime.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the dateTime\n\n"
            + "Example:\n"
            + "| Set Focus On DateTime |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnDateTime() throws Exception {
    		SWTBotDateTime dateTime = (SWTBotDateTime)Context.getCurrentWidget(SWTBotDateTime.class);
    		dateTime.setFocus();
    	}
	
	@RobotKeyword("Get the date with teh given pattern (see java SimpleDateFormat patterns)\n\n"
            + "Example:\n"
            + "| Get DateTime Date | yyyy.MM.dd |\n")
    @ArgumentNames({"pattern"})
        public String getDateTimeDate(String pattern) throws Exception {
    		SWTBotDateTime dateTime = (SWTBotDateTime)Context.getCurrentWidget(SWTBotDateTime.class);
    		Date date = dateTime.getDate();
    		if(pattern!=null) {
    			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    			return sdf.format(date);
    		} else {
    			return date.toString();
    		}
    	}

	@RobotKeyword("Set the date with teh given pattern (see java SimpleDateFormat patterns)\n\n"
            + "Example:\n"
            + "| Set DateTime Date | yyyy.MM.dd | 2010.12.31 \n")
    @ArgumentNames({"pattern", "date"})
        public void setDateTimeDate(String pattern, String date) throws Exception {
    		SWTBotDateTime dateTime = (SWTBotDateTime)Context.getCurrentWidget(SWTBotDateTime.class);
    		if(date !=null && pattern!=null) {
    			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
    			Date dated = sdf.parse(date);
    			dateTime.setDate(dated);
    		}
    	}
}