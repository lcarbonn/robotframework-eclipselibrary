package org.lcx.robotframework.eclipse.keyword.eclipse.finder;

import java.util.List;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.lcx.robotframework.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotEditor;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class EditorFinderKeywords {

	
	@RobotKeyword("Find the active editor\n\n"
            + "Example:\n"
            + "| Find Active Editor |\n")
//    @ArgumentNames({"*params"})
    public SWTBotEditor findActiveEditor() throws SWTBotBridgeException{
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		return bot.activeEditor();
	}
	
	@RobotKeyword("Close all editors\n\n"
            + "Example:\n"
            + "| Close All Editors |\n")
//    @ArgumentNames({"*params"})
    public void closeAllEditors() throws SWTBotBridgeException{
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		bot.closeAllEditors();
	}

	@RobotKeyword("Save all editors\n\n"
            + "Example:\n"
            + "| Save All Editors |\n")
//    @ArgumentNames({"*params"})
    public void saveAllEditors() throws SWTBotBridgeException{
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		bot.saveAllEditors();
	}

	@RobotKeyword("Find the editor by its id\n\n"
            + "Example:\n"
            + "| Find Editor By Id | id |\n")
    @ArgumentNames({"id"})
    public SWTBotEditor findEditorById(String id) throws SWTBotBridgeException{
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		return bot.editorById(id);
	}

	@RobotKeyword("Find the editor by its title\n\n"
            + "Example:\n"
            + "| Find Editor By Title | title |\n")
    @ArgumentNames({"title"})
    public SWTBotEditor findEditorByLabel(String title) throws SWTBotBridgeException{
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
		return bot.editorByTitle(title);
	}

	@RobotKeyword("List all the editors title\n\n"
            + "Example:\n"
            + "| List All Editor Title | \n")
    @ArgumentNames({"label"})
    public String[] listAllEditorTitle() throws SWTBotBridgeException{
    	SWTWorkbenchBot bot = SWTWorkbenchBot.getSWTWorkbenchBot();
    	List<? extends SWTBotEditor> editors = bot.editors();
		String[] a = new String[editors.size()];
		int i = 0;
    	for (SWTBotEditor p : editors) {
    		a[i]=p.getTitle();
    		i++;
		}
		return a;
	}
}