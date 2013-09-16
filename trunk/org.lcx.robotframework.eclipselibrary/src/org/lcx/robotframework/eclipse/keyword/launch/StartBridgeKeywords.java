/*
 * Copyright 2013 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.keyword.launch;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.lcx.robotframework.eclipse.LibraryLogger;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridge;
import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;

@RobotKeywords
public class StartBridgeKeywords {

	private Logger log = LibraryLogger.getLogger();

	
	@RobotKeyword("Start the SWTBot bridge\n"
    		+ "This is used for SWT application that run without Eclipse/RCP.\n"
    		+ "For RCP application use StartEclipse keyword\n"
            + "Example:\n"
            + "| Start SWTBotBridge |\n")
//    @ArgumentNames({"*params"})
    public void startSWTBotBridge() throws Exception {
		log.info("SwtbotPlugin for RF starting");
		if(SWTBotBridge.getSWTWORKBENCHBOT()!=null) {
			log.info("SwtbotPlugin for RF already initialized");
			return;
		}
		try {
			ClassLoader syscl = ClassLoader.getSystemClassLoader();
			Class<?> service = syscl.loadClass("org.lcx.robotframework.swtbotplugin.service.SwtbotService");
			Method mb = service.getDeclaredMethod("getSWTBot");
			Object swtbot = mb.invoke(null);
			SWTBotBridge.setSWTBOTCLASSLOADER(syscl);
			SWTBotBridge.setSWTWORKBENCHBOT(swtbot);
							
		} catch (Exception e) {
			// plugin is not started under robotframework, so not a problem
			log.error("SwtbotPlugin for RF on error", e);
			throw new SWTBotBridgeException("SwtbotPlugin for RF on error", e);
		}
		log.info("SwtbotPlugin for RF started");
	}
	
}
