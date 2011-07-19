package org.lcx.robotframework.eclipse.keyword.swtbot.actionfact;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lcx.robotframework.eclipse.utils.ShortcutParser;

public class ShortcutTest {

	/*
	 */
	

	@Test
	public void testmodificationKeysParser() throws Exception {
		long t1 = System.currentTimeMillis();
	
		int SWT_ALT_CTRL = SWTConstants.ALT | SWTConstants.CTRL;
		assertEquals(SWT_ALT_CTRL, ShortcutParser.parseModificationKeys("ALT+CTRL+c"));
		assertEquals('c', ShortcutParser.parseCar("ALT+CTRL+c"));
		assertEquals(SWTConstants.F1, ShortcutParser.parseKeyCode("ALT+CTRL+F1"));
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
	}
}
