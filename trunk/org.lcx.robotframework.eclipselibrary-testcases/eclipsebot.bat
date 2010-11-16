@echo off
set ECLIPSE_LIBRARY=lib/eclipselibrary-0.13-with-dependencies-e36.jar
set ROBOTFRAMEWORK=libext/robotframework-2.5.4.1.jar
java -Xmx512m -XX:MaxPermSize=256M  -Xbootclasspath/a:%ECLIPSE_LIBRARY% -jar  %ROBOTFRAMEWORK% --debugfile jybot.log --loglevel TRACE --outputdir results %* 