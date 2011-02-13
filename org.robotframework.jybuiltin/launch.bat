@echo on
set JAVA_OPTS=-Xmx512m
set JYBUILTIN=dist/jybuiltin-0.1.jar
set JYTHON=dist/jython.jar
set ROBOTFRAMEWORK=dist/robotframework-2.5.5.jar
set RFMAIN=org.robotframework.RobotFramework
set JYBIL_LIBRARY=dist/jybuiltinlibrary-0.1-with-dependencies.jar
set RF_OPTS=--debugfile jybot.log --loglevel TRACE --outputdir results
set cp=%JYBUILTIN%;%ROBOTFRAMEWORK%;%JYBIL_LIBRARY%
::set JYTHONPATH=%ROBOTFRAMEWORK%/Lib;%JYBUILTIN%/Lib
::java -Xbootclasspath/a:%cp% %JAVA_OPTS%  -jar %ROBOTFRAMEWORK% %RF_OPTS% %*
java -cp %cp% %JAVA_OPTS% %RFMAIN% %RF_OPTS% %*