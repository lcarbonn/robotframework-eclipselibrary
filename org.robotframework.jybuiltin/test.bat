@echo off
set JAVA_OPTS=-Xmx512m
set ROBOTFRAMEWORK=dist/robotframework-2.5.5.jar
set JUNIT_LIBRARY=dist/junitlibrary-0.1-with-dependencies.jar
set RF_OPTS=--debugfile jybot.log --loglevel TRACE --outputdir results
set cp=%ROBOTFRAMEWORK%;%JUNIT_LIBRARY%
java -classpath %cp% Main
