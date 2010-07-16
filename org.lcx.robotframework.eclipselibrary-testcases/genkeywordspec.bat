@echo on

::
:: robotide.bat -- Python start up script for RobotIde on Windows
:: 

:: Python executable to use. 
set python="C:\RobotFramework\Python26\python.exe"
set jython="C:\RobotFramework\jython2.2\jython.bat"
set libdoc="C:\RobotFramework\Python26\Scripts\libdoc.py"
set PYTHONPATH=C:\RobotFramework\jython2.2;C:\RobotFramework\Python26;C:\RobotFramework\Python26\Lib
:: Run Rebot on Python interpreter
set CLASSPATH=C:\outils\jdk1.5.0_12\lib\tools.jar;C:\RobotFramework\TestEclipse\lib\eclipselibrary-0-1.jar
rem %jython% -Dpython.path=C:\RobotFramework\jython2.2;C:\RobotFramework\Python26 %libdoc% -f xml EclipseLibrary
%jython% %libdoc% --format xml --output eclipselibrary.xml EclipseLibrary-0-1.jar