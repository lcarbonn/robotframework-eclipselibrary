@echo off
set ECLIPSE_LIBRARY=dist/eclipselibrary-0.17-with-dependencies-e36.jar
set ROBOTFRAMEWORK=libext/robotframework-2.6.3.jar
java -Xmx512m -XX:MaxPermSize=256M  -Xbootclasspath/a:%ECLIPSE_LIBRARY% -jar  %ROBOTFRAMEWORK% --debugfile jybot.log --loglevel TRACE --outputdir results %* 