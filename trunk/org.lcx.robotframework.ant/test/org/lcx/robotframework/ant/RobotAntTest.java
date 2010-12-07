package org.lcx.robotframework.ant;

import java.io.File;

import org.apache.tools.ant.BuildException;

import junit.framework.TestCase;

public class RobotAntTest extends TestCase {
 
	public String path="";
	
	@Override
	protected void setUp() throws Exception {
		path = new File("").getAbsolutePath()+"\\";
		
	}

	
	public void testFork1() {
		RobotAnt rf = new RobotAnt();
		// case nothing is given
		rf.setArguments();
		
		assertTrue(rf.isLocalFork());
		assertNotNull(rf.getCommandLine().getJar());
		assertEquals(path+RobotAnt.RFJAR, rf.getCommandLine().getJar());
		assertNull(rf.getCommandLine().getClassname());
	}
		
	public void testFork2() {
		RobotAnt rf = new RobotAnt();
		// case jar is given
		rf.setJar(new File("test.jar"));

		rf.setArguments();

		assertTrue(rf.isLocalFork());
		assertNotNull(rf.getCommandLine().getJar());
		assertEquals(path+"test.jar", rf.getCommandLine().getJar());
		assertNull(rf.getCommandLine().getClassname());
	}
	
	public void testFork4() {
		RobotAnt rf = new RobotAnt();
		// case fork is given without jar
		rf.setFork(true);
		
		rf.setArguments();

		assertTrue(rf.isLocalFork());
		assertNotNull(rf.getCommandLine().getJar());
		assertEquals(path+RobotAnt.RFJAR, rf.getCommandLine().getJar());
		assertNull(rf.getCommandLine().getClassname());
		
	}
	
	public void testFork5() {
		RobotAnt rf = new RobotAnt();
		// case fork is given with jar
		rf.setFork(true);
		rf.setJar(new File("test.jar"));

		rf.setArguments();

		assertTrue(rf.isLocalFork());
		assertNotNull(rf.getCommandLine().getJar());
		assertEquals(path+"test.jar", rf.getCommandLine().getJar());
		assertNull(rf.getCommandLine().getClassname());
		
	}
	
	public void testFork6() {
		RobotAnt rf = new RobotAnt();
		// case fork is given false without class
		rf.setFork(false);

		rf.setArguments();
		
		assertFalse(rf.isLocalFork());
		assertNull(rf.getCommandLine().getJar());
		assertNotNull(rf.getCommandLine().getClassname());
		assertEquals(RobotAnt.RFCLASS, rf.getCommandLine().getClassname());
	}
	
	public void testFork8() {
		RobotAnt rf = new RobotAnt();
		try {
			// case jar and class given
			rf.setClassname("myclass");
			rf.setJar(new File("jar"));

			rf.setArguments();

		} catch (Exception e) {
			assertTrue(e instanceof BuildException);
			assertEquals("Cannot use 'jar' and 'classname' attributes in same command.", e.getMessage());
		}
	}

	public void testFork9() {
		RobotAnt rf = new RobotAnt();
		try {
			// case jar and fork false
			rf.setJar(new File("jar"));
			rf.setFork(false);

			rf.setArguments();

		} catch (Exception e) {
			assertTrue(e instanceof BuildException);
			assertEquals("Cannot execute a jar in non-forked mode."
                    + " Please set fork='true'. ", e.getMessage());
		}
	}

	public void testFork10() {
		RobotAnt rf = new RobotAnt();
		try {
			// case jar and class given
			rf.setClassname("myclass");

			rf.setArguments();

			assertTrue("Should not be there but in exception", false);
		} catch (Exception e) {
			assertTrue(e instanceof BuildException);
			assertEquals("Cannot set 'classname' attribute in robotframework task.", e.getMessage());
		}
	}

	public void testArguments() {
		RobotAnt rf = new RobotAnt();
		// case jar and fork false
		rf.setData_sources("1");
		rf.setDebugfile("2");
		rf.setLoglevel("3");
		rf.setName("4");
		rf.setVariablefile("5");
		rf.setTest("6");
		rf.setSuite("7");
		rf.setOutputdir("8");

		rf.setArguments();

		assertEquals("1", rf.getData_sources());
		assertEquals("2", rf.getDebugfile());
		assertEquals("3", rf.getLoglevel());
		assertEquals("4", rf.getName());
		assertEquals("5", rf.getVariablefile());
		assertEquals("6", rf.getTest());
		assertEquals("7", rf.getSuite());
		assertEquals("8", rf.getOutputdir());
		String comline = "";
		for(String s : rf.getCommandLine().getCommandline()) {
			comline = comline + s +" ";
		}
		System.out.println(comline);
		assertTrue(comline.endsWith("--name 4 --variablefile 5 --loglevel 3 --debugfile 2 --outputdir 8 --suite 7 --test 6 1 "));
	}
}
