*** settings ***
Library    EclipseLibrary


*** test cases ***
Sample test case
    [Documentation]    This test is for java SWT application (non RCP)

	log to console    %{CLASSPATH}
    Set Eclipse Library Log Level    DEBUG
	Start Application In Separate Thread    fr.valtech.mc.SWTSample
	Start SWTBotBridge
	Find Text
	Set Text Text    lolo
	Find Button
	${text}=    Get Button Text
	Should Be Equal     	${text}    Valider
	Click Button