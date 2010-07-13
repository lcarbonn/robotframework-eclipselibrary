package org.lcx.robotframework.eclipse.keyword.swtbot.actionfact;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBotControl;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ContextMenuActionKeywords {
	
    @RobotKeyword("Click on the context menu with the given text on the last widget\n\n"
            + "Example:\n"
            + "| Click On Context Menu | text | \n")
    @ArgumentNames({"text"})
        public void clickOnContextMenu(String text) throws Exception {
    	AbstractSWTBotControl widget = Context.getCurrentWidget();
    	widget.contextMenu(text).click();
    }
    
	@RobotKeyword("Is the contextMenu enabled\n\n"
            + "Example:\n"
            + "| Is Context Menu Enabled | text |\n")
    @ArgumentNames({"text"})
        public boolean isContextMenuEnabled(String text) throws Exception {
    		AbstractSWTBotControl widget = (AbstractSWTBotControl)Context.getCurrentWidget(AbstractSWTBotControl.class);
    		return widget.contextMenu(text).isEnabled();
    	}

	@RobotKeyword("Is the contextMenu active\n\n"
            + "Example:\n"
            + "| Is Context Menu Active | text |\n")
    @ArgumentNames({"text"})
        public boolean isContextMenuActive(String text) throws Exception {
    		AbstractSWTBotControl widget = (AbstractSWTBotControl)Context.getCurrentWidget(AbstractSWTBotControl.class);
    		return widget.contextMenu(text).isActive();
    	}

	@RobotKeyword("Is the contextMenu checked\n\n"
            + "Example:\n"
            + "| Is Context Menu Checked | text |\n")
    @ArgumentNames({"text"})
        public boolean isContextMenuChecked(String text) throws Exception {
    		AbstractSWTBotControl widget = (AbstractSWTBotControl)Context.getCurrentWidget(AbstractSWTBotControl.class);
    		return widget.contextMenu(text).isChecked();
    	}

	@RobotKeyword("Is the contextMenu visible\n\n"
            + "Example:\n"
            + "| Is Context Menu Visible | text |\n")
    @ArgumentNames({"text"})
        public boolean isContextMenuVisible(String text) throws Exception {
    		AbstractSWTBotControl widget = (AbstractSWTBotControl)Context.getCurrentWidget(AbstractSWTBotControl.class);
    		return widget.contextMenu(text).isVisible();
    	}

	@RobotKeyword("Set the focus on the contextMenu\n\n"
            + "Example:\n"
            + "| Set Focus On Context Menu | text |\n")
    @ArgumentNames({"text"})
        public void setFocusOnContextMenu(String text) throws Exception {
    		AbstractSWTBotControl widget = (AbstractSWTBotControl)Context.getCurrentWidget(AbstractSWTBotControl.class);
    		widget.contextMenu(text).setFocus();
    	}

	@RobotKeyword("Get the the text of the contextMenu\n\n"
            + "Example:\n"
            + "| Get Context Menu Text | text |\n")
    @ArgumentNames({"text"})
        public String getContextMenuText(String text) throws Exception {
    		AbstractSWTBotControl widget = (AbstractSWTBotControl)Context.getCurrentWidget(AbstractSWTBotControl.class);
    		return widget.contextMenu(text).getText();
    	}

	@RobotKeyword("Get the the Tooltip text of the contextMenu\n\n"
            + "Example:\n"
            + "| Get Context Menu Tooltip Text | text |\n")
    @ArgumentNames({"text"})
        public String getContextMenuTooltipText(String text) throws Exception {
    		AbstractSWTBotControl widget = (AbstractSWTBotControl)Context.getCurrentWidget(AbstractSWTBotControl.class);
    		return widget.contextMenu(text).getToolTipText();
    	}

	@RobotKeyword("Select the sub menu of the contextMenu\n\n"
            + "Example:\n"
            + "| Get Context Menu Tooltip Text | text | subtext |\n")
    @ArgumentNames({"text", "subtext"})
        public void SelectMenuOnContextMenu(String text, String subtext) throws Exception {
    		AbstractSWTBotControl widget = (AbstractSWTBotControl)Context.getCurrentWidget(AbstractSWTBotControl.class);
    		Context.setCurrentWidget(widget.contextMenu(text).menu(subtext));
    	}
}
