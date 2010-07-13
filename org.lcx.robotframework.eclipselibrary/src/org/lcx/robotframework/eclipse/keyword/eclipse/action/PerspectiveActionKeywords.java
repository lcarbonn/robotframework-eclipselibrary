package org.lcx.robotframework.eclipse.keyword.eclipse.action;

import org.lcx.robotframework.eclipse.context.Context;
import org.lcx.robotframework.swtbot.eclipse.finder.widgets.SWTBotPerspective;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class PerspectiveActionKeywords {

	@RobotKeyword("Is the perspective active\n\n"
            + "Example:\n"
            + "| Is Perspective Active |\n")
        public boolean isPerspectiveActive() throws Exception {
    		SWTBotPerspective perspective = (SWTBotPerspective)Context.getCurrentWidget(SWTBotPerspective.class);
    		return perspective.isActive();
    	}

	@RobotKeyword("Activate the perspective\n\n"
            + "Example:\n"
            + "| Activate Perspective |\n")
//    @ArgumentNames({"text"})
        public void activatePerspective() throws Exception {
    		SWTBotPerspective perspective = (SWTBotPerspective)Context.getCurrentWidget(SWTBotPerspective.class);
    		perspective.activate();
    	}

	@RobotKeyword("Get the label of the perspective\n\n"
            + "Example:\n"
            + "| Get Perspective Label |\n")
//    @ArgumentNames({"text"})
        public String getPerspectiveLabel() throws Exception {
    		SWTBotPerspective perspective = (SWTBotPerspective)Context.getCurrentWidget(SWTBotPerspective.class);
    		return perspective.getLabel();
    	}
}