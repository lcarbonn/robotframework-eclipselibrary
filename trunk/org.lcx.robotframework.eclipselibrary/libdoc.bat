@echo off
rem set JYTHONPATH=C:\RobotFramework\Python26\Lib\site-packages
set CLASSPATH=C:\RobotFramework\TestEclipse\dist\eclipselibrary-0.19-with-dependencies.jar
set jython=C:\RobotFramework\jython2.5.1\jython.bat
set docpath=C:\RobotFramework\TestEclipse\documentation
rem %jython% -m robot.libdoc --version 0.19 org.lcx.robotframework.eclipse.EclipseLibrary %docpath%\EclipseLibrary.html
%jython% -Dpython.path=C:\RobotFramework\Python26\Lib\site-packages -m robot.libdoc --version 0.19 org.lcx.robotframework.eclipse.EclipseLibrary %docpath%\EclipseLibrary.html
