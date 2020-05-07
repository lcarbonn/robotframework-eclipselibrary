@echo off
:: set all jar files in the classpath
setlocal EnableDelayedExpansion
set classpath=./
for %%f in (./lib/*.jar) do (set classpath=!classpath!;./lib/%%f)
:: call rf
java -Xmx512m -cp %classpath% org.robotframework.RobotFramework --debugfile jybot.log --loglevel TRACE --outputdir results %* 