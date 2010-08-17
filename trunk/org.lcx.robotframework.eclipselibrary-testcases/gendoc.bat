@echo off

::
:: robotide.bat -- Python start up script for RobotIde on Windows
:: 

:: Jython executable to use. 
set jython="C:\RobotFramework\jython2.2\jython.bat"
set libdoc="C:\RobotFramework\Python26\Lib\site-packages\libdoc.py"
set PYTHONPATH=C:\RobotFramework\Python26\Lib\site-packages

set CLASSPATH=C:\outils\jdk1.5.0_12\lib\tools.jar;C:\RobotFramework\TestEclipse\lib\eclipselibrary-0.1.jar;C:\RobotFramework\TestEclipse\lib\javalib-core-0.8.1-jar-with-dependencies.jar

echo Gen XML Keywords for Eclipse Library
call %jython% -Dpython.path=%PYTHONPATH% %libdoc% -f XML -N EclipseLibrary -o C:\RobotFramework\TestEclipse\documentation org.lcx.robotframework.eclipse.EclipseLibrary

echo Gen HTML Keywords doc for Eclipse Library
call %jython% -Dpython.path=%PYTHONPATH% %libdoc% -f HTML -N EclipseLibrary -o C:\RobotFramework\TestEclipse\documentation org.lcx.robotframework.eclipse.EclipseLibrary