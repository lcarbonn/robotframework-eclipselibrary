/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.swtbot.actionfact;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.eclipse.utils.ShortcutParser;
import org.lcx.robotframework.swtbot.swt.finder.widgets.AbstractSWTBot;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class ShortcutActionKeywords {

	@RobotKeyword("Press Shortcut on current selected widget\n\n"
            + "Example:\n"
            + "Press Shortcut | ALT+CTRL+c |\n"
            + "Press Shortcut | CTRL+F11 |\n"
            + "modificationKeys : the combination of SWT.ALT | SWT.CTRL | SWT.SHIFT | SWT.COMMAND.\n"
            + "c the character\n")
    @ArgumentNames({"shortcut"})
        public void pressShortcut(String shortcut) throws SWTBotBridgeException {
    		AbstractSWTBot obot = (AbstractSWTBot)Context.getCurrentWidget(AbstractSWTBot.class);
    		int modKeys = ShortcutParser.parseModificationKeys(shortcut);
    		int keyCode = ShortcutParser.parseKeyCode(shortcut);
    		char c = ShortcutParser.parseCar(shortcut);
    		if(keyCode==ShortcutParser.NOT_FOUND) {
    			obot.pressShortcut(modKeys, c);
    		} else {
    			obot.pressShortcut(modKeys, keyCode, c);
    		}
    	}
}