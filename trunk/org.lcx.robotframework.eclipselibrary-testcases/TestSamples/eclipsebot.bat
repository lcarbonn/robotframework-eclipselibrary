@echo off
set ECLIPSE_LIBRARY=lib/eclipselibrary-0.11-with-dependencies.jar
set ROBOTFRAMEWORK=robotframework-2.5.4.1.jar
java -Xms256m -Xmx512m -XX:PermSize=64M -XX:MaxPermSize=256M  -Xbootclasspath/a:%ECLIPSE_LIBRARY% -jar  %ROBOTFRAMEWORK% --debugfile jybot.log --loglevel TRACE --outputdir results %* 