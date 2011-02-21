@echo off
set ECLIPSE_LIBRARY=dist/eclipselibrary-0.14-with-dependencies-e36.jar
set ROBOTFRAMEWORK=libext/robotframework-2.5.6.jar
java -Xmx512m -XX:MaxPermSize=256M  -Xbootclasspath/a:%ECLIPSE_LIBRARY% -jar  %ROBOTFRAMEWORK% --debugfile jybot.log --loglevel TRACE --outputdir results %* 