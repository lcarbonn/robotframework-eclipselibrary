@echo off
set CLASSPATH=D:\Dev\RobotFramework\TestEclipse\dist\eclipselibrary-0.20-with-dependencies.jar
set jython=C:\Tools\jython2.5.4rc1\jython.bat
set docpath=D:\Dev\RobotFramework\TestEclipse\documentation
rem %jython% -Dpython.path=C:\Python27\Lib\site-packages -m robot.libdoc --format html --version 0.20 org.lcx.robotframework.eclipse.EclipseLibrary %docpath%\EclipseLibrary.html
%jython% -Dpython.path=C:\Python27\Lib\site-packages -m robot.libdoc --format xml --version 0.20 org.lcx.robotframework.eclipse.EclipseLibrary %docpath%\EclipseLibrary.xml
