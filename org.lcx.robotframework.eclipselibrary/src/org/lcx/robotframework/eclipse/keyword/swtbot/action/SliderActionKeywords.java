package org.lcx.robotframework.eclipse.keyword.swtbot.action;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.SWTBotSlider;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class SliderActionKeywords {

	@RobotKeyword("Is the slider active\n\n"
            + "Example:\n"
            + "| Is Slider Active |\n")
        public boolean isSliderActive() throws Exception {
    		SWTBotSlider slider = (SWTBotSlider)Context.getCurrentWidget(SWTBotSlider.class);
    		return slider.isActive();
    	}

	@RobotKeyword("Is the slider enabled\n\n"
            + "Example:\n"
            + "| Is Slider Enabled |\n")
        public boolean isSliderEnabled() throws Exception {
    		SWTBotSlider slider = (SWTBotSlider)Context.getCurrentWidget(SWTBotSlider.class);
    		return slider.isEnabled();
    	}

	@RobotKeyword("Is the slider visible\n\n"
            + "Example:\n"
            + "| Is Slider Visible |\n")
        public boolean isSliderVisible() throws Exception {
    		SWTBotSlider slider = (SWTBotSlider)Context.getCurrentWidget(SWTBotSlider.class);
    		return slider.isVisible();
    	}

	@RobotKeyword("Get the text of the slider\n\n"
            + "Example:\n"
            + "| Get Slider Text |\n")
//    @ArgumentNames({"text"})
        public String getSliderText() throws Exception {
    		SWTBotSlider slider = (SWTBotSlider)Context.getCurrentWidget(SWTBotSlider.class);
    		return slider.getText();
    	}
	
	@RobotKeyword("Get the tooltip text of the slider\n\n"
            + "Example:\n"
            + "| Get Slider Tooltip Text |\n")
//    @ArgumentNames({"text"})
        public String getSliderTooltipText() throws Exception {
    		SWTBotSlider slider = (SWTBotSlider)Context.getCurrentWidget(SWTBotSlider.class);
    		return slider.getToolTipText();
    	}
	
	@RobotKeyword("Set the focus on the slider\n\n"
            + "Example:\n"
            + "| Set Focus On Slider |\n")
//    @ArgumentNames({"text"})
        public void setFocusOnSlider() throws Exception {
    		SWTBotSlider slider = (SWTBotSlider)Context.getCurrentWidget(SWTBotSlider.class);
    		slider.setFocus();
    	}

	@RobotKeyword("Get the slider maximum\n\n"
            + "Example:\n"
            + "| Get Slider Maximum |\n")
//    @ArgumentNames({"text"})
        public int getSliderMaximum() throws Exception {
    		SWTBotSlider slider = (SWTBotSlider)Context.getCurrentWidget(SWTBotSlider.class);
    		return slider.getMaximum();
    	}

	@RobotKeyword("Get the slider minimum\n\n"
            + "Example:\n"
            + "| Get Slider Minimum |\n")
//    @ArgumentNames({"text"})
        public int getSliderMinimum() throws Exception {
    		SWTBotSlider slider = (SWTBotSlider)Context.getCurrentWidget(SWTBotSlider.class);
    		return slider.getMinimum();
    	}

	@RobotKeyword("Get the slider page increment\n\n"
            + "Example:\n"
            + "| Get Slider Page Increment |\n")
//    @ArgumentNames({"text"})
        public int getSliderPageIncrement() throws Exception {
    		SWTBotSlider slider = (SWTBotSlider)Context.getCurrentWidget(SWTBotSlider.class);
    		return slider.getPageIncrement();
    	}

	@RobotKeyword("Get the slider selection\n\n"
            + "Example:\n"
            + "| Get Slider Selection |\n")
//    @ArgumentNames({"text"})
        public int getSliderSelection() throws Exception {
    		SWTBotSlider slider = (SWTBotSlider)Context.getCurrentWidget(SWTBotSlider.class);
    		return slider.getSelection();
    	}

	@RobotKeyword("Get the slider thumb\n\n"
            + "Example:\n"
            + "| Get Slider Thumb |\n")
//    @ArgumentNames({"text"})
        public int getSliderThumb() throws Exception {
    		SWTBotSlider slider = (SWTBotSlider)Context.getCurrentWidget(SWTBotSlider.class);
    		return slider.getThumb();
    	}

	@RobotKeyword("Set the slider selection\n\n"
            + "Example:\n"
            + "| Set Slider Selection | 0 |\n")
    @ArgumentNames({"index"})
        public void setSliderSelection(String index) throws Exception {
    		SWTBotSlider slider = (SWTBotSlider)Context.getCurrentWidget(SWTBotSlider.class);
			Integer i = Integer.valueOf(index).intValue();
			slider.setSelection(i);
    	}

}