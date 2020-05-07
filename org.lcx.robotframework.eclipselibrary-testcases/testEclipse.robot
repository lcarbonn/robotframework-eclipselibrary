*** settings ***
Library    EclipseLibrary
Resource    ./EclipseLibraryKeywords.html


*** variables ***
${eclipse_install}    file:/C:/Users/jbeaumont/Documents/app/eclipse
${eclipse_data}       file:/C:/Users/jbeaumont/Documents/ALTRAN/git_repository/tas/workspace12
${eclipse_params}     -ea -DapplicationXMI=com.opcoach.e4tester.core/E4TesterApplication.e4xmi -Dfile.encoding=Cp1252 -os win32 -ws win32 -arch x86_64 -nl fr_FR -consoleLog -product com.opcoach.e4tester.test.components.test -configuration file:/C:/Users/jbeaumont/Documents/ALTRAN/git_repository/tas/E4Tester/com.opcoach.e4tester.test.components.test/target/work/configuration  


*** test cases ***
Test Eclipse installation
    [Documentation]    Test in progress...

	log to console    %{CLASSPATH}
    Set Eclipse Library Log Level    DEBUG
	Start Eclipse    -install    ${eclipse_install}
	...              -data       ${eclipse_data}    ${eclipse_params}
	Set Capture Screenshot On Error    error.jpg
    Set Eclipse Library Log Level     DEBUG	
	Find Active View
	Is the active view is Welcome