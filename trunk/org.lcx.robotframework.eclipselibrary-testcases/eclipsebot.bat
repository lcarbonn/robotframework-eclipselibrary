@echo off
set ECLIPSE_LIBRARY=dist/eclipselibrary-0.19-with-dependencies.jar
set ROBOTFRAMEWORK=libext/robotframework-2.7.7.jar
java -Xmx512m -XX:MaxPermSize=256M  -Xbootclasspath/a:%ECLIPSE_LIBRARY% -jar  %ROBOTFRAMEWORK% --debugfile jybot.log --loglevel DEBUG --outputdir results %* 