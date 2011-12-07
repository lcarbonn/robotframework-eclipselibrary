/*
 * Copyright 2011 L. Carbonnaux
 */
package org.lcx.robotframework.jybuiltin.keyword;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.lcx.robotframework.jybuiltin.LibraryLogger;
import org.robotframework.javalib.annotation.ArgumentNames;
import org.robotframework.javalib.annotation.RobotKeyword;
import org.robotframework.javalib.annotation.RobotKeywords;
import org.robotframework.jybuiltin.JyBuiltInFactory;
import org.robotframework.jybuiltin.interfaces.JyBuiltIn;

@RobotKeywords
public class JyBuiltInKeywords {

	private Logger log = LibraryLogger.getLogger();
	private JyBuiltIn builtin=null;
	
	@RobotKeyword("First Test Step\n")
    @ArgumentNames({"*params"})
    public void firstTestStep(String... params) {
        log.debug("called");
        builtin = JyBuiltInFactory.getJyBuiltIn();

        testMisc();
        testVariables();
        testRunKeyword();
        testVerify();
        
	}
	
	@RobotKeyword("Second Test Step\n")
    @ArgumentNames({"*params"})
    public void secondTestStep(String... params) {
        log.debug("called");
        builtin = JyBuiltInFactory.getJyBuiltIn();

        testSecondVariables();
        
	}

	public void setLog(String level) {
		log.setLevel(Level.toLevel(level));
	}
	
	private void testMisc() {
        builtin.no_operation();
        testloglevel();
        testLog();
        testSleep();
        testCatenate();
        testTags();
        testLibraries();
        testEvaluate();
        builtin.set_test_message("This is a test message");
	}
	
	private void testCatenate() {
		String s = builtin.catenate("SEPARATOR=---", "Hello", "world");
		builtin.log("catenate="+s);
		assertEquals("Hello---world", s);
	}
	
	private void testTags() {
		builtin.set_tags("tag1", "tag2", "tag3");
		builtin.remove_tags("tag2", "tag3");
	}

	private void testLibraries() {
		Object o = builtin.get_library_instance("JyBuiltInLibrary");
		builtin.log("library instance="+o+", class="+o.getClass().getName());
	}
	
	private void testEvaluate() {
		Object o = builtin.evaluate("random.randint(0, sys.maxint)", "random,sys");
		builtin.log("evaluate="+o+", class="+o.getClass().getName());
	}
	

	private void testloglevel() {
		builtin.log("start testloglevel");

        String loglevel = builtin.set_log_level("INFO");

        loglevel = builtin.set_log_level(loglevel);
        log.debug("loglevel:"+loglevel);
        assertEquals("INFO", loglevel);
        
        loglevel = "TRACE";
        loglevel = builtin.set_log_level(loglevel);
        log.debug("loglevel:"+loglevel);
        assertEquals("TRACE", loglevel);

        builtin.log("end   testloglevel");
        
     }
	
	private void testLog(){
        builtin.log("start testLog");
		
        builtin.log("this is a INFO log");
        builtin.log("this is a DEBUG log", "DEBUG");
        builtin.log_many("One message", "second message", "third message");
        builtin.log_many("Only One message");
        builtin.comment("this is a comment");
        
        builtin.log("end   testLog");
        
	}
	
	@SuppressWarnings("unchecked")
	private void testVariables() {
        builtin.log("start testVariables");

        builtin.log("start log_variables");
		builtin.log_variables("INFO");
		builtin.log_variables();
        builtin.log("end log_variables");

        String testname = (String)builtin.get_variable("${TEST_NAME}");
        assertEquals("SimpleTest", testname);

        Map<String, Object> variables = builtin.get_variables();
        assertTrue(variables.size()>0);
        builtin.log("begin get_variables");
        for (String key : variables.keySet()) {
        	Object o = variables.get(key);
        	if(o!=null)
        		builtin.log("\tkey="+key+", value="+o+", class="+o.getClass().getName());
        	else
        		builtin.log("\tkey="+key+", value="+o);
		}
        builtin.log("end get_variables");
        
        
        Object value = variables.get("${False}");
        builtin.log("print ${False}="+value);
        assertEquals(Boolean.FALSE, value);

        String text = builtin.replace_variables("This is the ${TEST_NAME} test");
        assertEquals("This is the SimpleTest test", text);
        builtin.log("print replace="+text);
        text = builtin.replace_variables("@{liste}");
        assertEquals("[u'1', u'2', u'3', u'4']", text);
        builtin.log("print replace="+text);

        builtin.variable_should_exist("${TEST_NAME}", "exist");
        builtin.variable_should_not_exist("${NOT_EXISTS_VAR}", "don't exist");
        builtin.variable_should_exist("${TEST_NAME}");
        builtin.variable_should_not_exist("${NOT_EXISTS_VAR}");

        Object o = builtin.get_variable("${TEST_NAME}");
        builtin.log("TEST_NAME class="+o.getClass().getName()+", o="+o);
        String s = (String)builtin.get_variable("${TEST_NAME}");
        assertEquals("SimpleTest", s);
        
        // Global variable
        o = builtin.get_variable("${GLOBAL_VARIABLE}");
        builtin.log("GLOBAL_VARIABLE class="+o.getClass().getName()+", o="+o);
        Object[] ss = (Object[])builtin.get_variable("${GLOBAL_VARIABLE}");
        assertTrue(ss.length>0);
        for (int i = 0; i < ss.length; i++) {
			builtin.log("ss["+i+"]="+ss[i]+" of class:"+ss[i].getClass().getName());
		}

        List<Object> list = new ArrayList<Object>();
        list.add("toto");
        list.add(new Integer(12));
        list.add(false);
        
        builtin.set_global_variable("${GLOBAL_VARIABLE}", "global", new Integer(3), true, list);
        o = builtin.get_variable("${GLOBAL_VARIABLE}");
        builtin.log("GLOBAL_VARIABLE class="+o.getClass().getName()+", o="+o);
        ss = (Object[])builtin.get_variable("${GLOBAL_VARIABLE}");
        assertTrue(ss.length>0);
        for (int i = 0; i < ss.length; i++) {
			builtin.log("ss["+i+"]="+ss[i]+" of class:"+ss[i].getClass().getName());
		}
        list.add("added after");
        assertEquals("global", ss[0]);
        assertEquals(new Integer(3), ss[1]);
        assertEquals(true, ss[2]);
        assertEquals(list, ss[3]);
        List<Object> slist = (List<Object>)ss[3];
        for (Object object : slist) {
        	builtin.log("slist="+object+" of class:"+object.getClass().getName());
		}
        assertEquals("toto", slist.get(0));
        assertEquals(new Integer(12), slist.get(1));
        assertEquals(false, slist.get(2));
        
        builtin.set_global_variable("${GLOBAL_VARIABLE}", "global");
        builtin.variable_should_exist("${GLOBAL_VARIABLE}", "global var exist");
        Object var = builtin.get_variable("${GLOBAL_VARIABLE}");
        assertEquals("global", var);
        
        builtin.set_global_variable("${GLOBAL_VARIABLE}", "global", new Integer(3), true, list);
        
        
        // Suite variable
        builtin.set_suite_variable("${SUITE_VARIABLE}", "suite");
        builtin.variable_should_exist("${SUITE_VARIABLE}", "suite var exist");
        var = builtin.get_variable("${SUITE_VARIABLE}");
        assertEquals("suite", var);

        // Test variable
        builtin.set_test_variable("${TEST_VARIABLE}", "test");
        builtin.variable_should_exist("${TEST_VARIABLE}", "test var exist");
        var = builtin.get_variable("${TEST_VARIABLE}");
        assertEquals("test", var);
        List<String> liste = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            liste.add("list"+i);
		}
       
	}

	private void testSleep() {
		builtin.sleep("1s", "wait 1 sec");
		builtin.sleep("1s 3ms", "wait 1 sec and 3 ms");
		builtin.sleep("1s");
		builtin.sleep("1s 3ms");
	}

	private void testRunKeyword() {
        log.debug("log:"+builtin.run_keyword("log", "this is a log", "this is a second log"));
	}

	@SuppressWarnings("unchecked")
	private void testSecondVariables() {
        builtin.log("start testSecondVariables");

        Object[] ss = (Object[])builtin.get_variable("${GLOBAL_VARIABLE}");
        builtin.log("GLOBAL_VARIABLE class="+ss.getClass().getName()+", ss="+ss);
        assertTrue(ss.length>0);
        for (int i = 0; i < ss.length; i++) {
			builtin.log("ss["+i+"]="+ss[i]+" of class:"+ss[i].getClass().getName());
		}
        assertEquals("global", ss[0]);
        assertEquals(new Integer(3), ss[1]);
        assertEquals(true, ss[2]);
        List<Object> slist = (List<Object>)ss[3];
        for (Object object : slist) {
        	builtin.log("slist="+object+" of class:"+object.getClass().getName());
		}
        assertEquals("toto", slist.get(0));
        assertEquals(new Integer(12), slist.get(1));
        assertEquals(false, slist.get(2));
        builtin.log("end testSecondVariables");
	}

	private void testVerify() {
		testEquals();
	}

	private void testEquals() {
		builtin.log("start testEquals");
		try {
			builtin.fail("this is a failure");	
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("fail message="+e.getMessage());
		}
		
//		builtin.should_be_true("'${TEST_VARIABLE}' == 'test'");
//		builtin.should_be_equal(new PyString("${TEST_VARIABLE}"), new PyString("test"), "message");
//		System.out.println("fail="+builtin.fail("failmessage"));
		builtin.log("end testEquals");
	}
}