# Installation for Java/SWT #

Since v0.15 Eclipse Library provide facilities to test Java/SWT application
(outside RCP/Eclipse)

For Eclipse RCP/SWT application see [InstallationForEclipse](InstallationForEclipse.md)

Robotframework Eclipse Library compatibility :
  * [Compatibility](Compatibility.md)

## Eclipse library ##
> Download the latest `EclipseLibrary` jar file.
  * The jar with all dependencies for swt [eclipselibrary-x.x-with-dependencies-swt.jar](http://code.google.com/p/robotframework-eclipselibrary/downloads/list)
  * The jar include EclipseLibrary itself, SWTBot for SWT testing, EclipseLibrary plugin (bridge to SWTBot) and Javalibcore for RobotFramework

> Download the swtbot.bat robotframework script for `EclipseLibrary` tests
  * [swtbot.bat](http://robotframework-eclipselibrary.googlecode.com/files/swtbot.bat)
  * swtbot.bat is a sample script that help you start your application test.
  * swtbot.bat add all jars in the lib folder to the classpath and lunch robotframework

## Running with your Java/SWT application ##
> Classpath should have:
  * your application!
  * SWT and also JFaces jars (even if you don't use JFace, SWTBot need it)
  * `EclipseLibrary` jar with dependencies for swt
  * and robotframework standalone jar

## Samples ##
You can fin dunder svn the sample I use.
https://robotframework-eclipselibrary.googlecode.com/svn/trunk/org.lcx.robotframework.swt-testcases


## Some feedbacks ##
  * Cannot load 32-bit SWT libraries on 64-bit JVM
just change java 64 to java 32

  * Take care, this test only SWT widgets, not AWT.
For AWT or Swing, please use swing library

  * Can't find a control
people should add "Start SWTBotBridge" keywords after "Start Application"
when use "Start Application", it will block testcase , prefer "Start Application In Separate Thread"