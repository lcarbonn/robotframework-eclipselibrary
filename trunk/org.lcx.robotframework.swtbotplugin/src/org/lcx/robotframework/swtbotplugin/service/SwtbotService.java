package org.lcx.robotframework.swtbotplugin.service;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swtbot.eclipse.finder.SWTWorkbenchBot;
import org.eclipse.swtbot.eclipse.finder.waits.Conditions;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotPerspective;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.waits.ICondition;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotList;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotMenu;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTable;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

public class SwtbotService {

	public Display getDisplay() {
		final IWorkbench workbench = PlatformUI.getWorkbench();
		if (workbench == null)
			return null;
		final Display display = workbench.getDisplay();
		System.out.println("SwtbotServiceImpl workbench display="+display);
		
		SWTWorkbenchBot bot = new SWTWorkbenchBot();
		SWTBotMenu menu = bot.menu("Help");
		SWTBotMenu about = menu.menu("About Eclipse Platform");
		about.click();
		System.out.println("About getTitle="+bot.shell("About Eclipse Platform").getText());
		return display;
	}
	
	public SWTWorkbenchBot getSWTWorkbenchBot() {
		SWTWorkbenchBot bot = new SWTWorkbenchBot();
		return bot;
	}
	
	public void testSwtBot(){
		SWTWorkbenchBot	bot = new SWTWorkbenchBot();
		SWTBotPerspective persp = bot.perspectiveByLabel("Planning");
		persp.activate();
		SWTBotView view = bot.viewByTitle("Task Repositories");
		view.toolbarButton("Add Task Repository...").click();
//		SWTBotShell shell = bot.shell("Add Task Repository");
//		shell.activate();
		SWTBotTable table = bot.table();
		table.select("Task Vision (Task list using Google SpreadSheet)");
		bot.button("Next >").click();
		
		bot.textWithLabel("User ID: ").setText("scrumvision.4ut");
		bot.textWithLabel("Password: ").setText("scrum4utvision");
		bot.checkBox("Save Password").click();
		bot.label("Select an available tasks list").setFocus();
//		System.out.println("text button="+bot.button(0).getText());
		bot.button(0).click();

		SWTBotList listSS = bot.list(0);
		ICondition condition = Conditions.widgetIsEnabled(listSS);
		bot.waitUntil(condition, 50000);

		listSS.select("SimpleTaskList");
		SWTBotList listWS = bot.list(1);
		listWS.select("TaskList");

		//		bot.menu("File").menu("New").menu("Project...").click();
// 
//		SWTBotShell shell = bot.shell("New Project");
//		shell.activate();
//		bot.tree().select("Java Project");
//		bot.button("Next >").click();
// 
//		bot.textWithLabel("Project name:").setText("MyFirstProject");
// 
//		bot.button("Finish").click();
//		// FIXME: assert that the project is actually created, for later
	}
	
}
