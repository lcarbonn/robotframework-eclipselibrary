package org.lcx.robotframework.eclipse.utils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TimeTest {

	/*
		days, day, d 
		hours, hour, h 
		minutes, minute, mins, min, m 
		seconds, second, secs, sec, s 
		milliseconds, millisecond, millis, ms 
		Examples:
		
		1 min 30 secs = 90000 
		1.5 minutes = 90000
		90 s = 90000
		1 day 2 hours 3 minutes 4 seconds 5 milliseconds = 93784000
		1d 2h 3m 4s 5ms = 93784000
	 */
	

	@Test
	public void testTimeParser() throws Exception {
		long t1 = System.currentTimeMillis();
		assertEquals(1000l, org.lcx.robotframework.eclipse.utils.TimeParser.parseMillisecond("1"));
		assertEquals(90000l, org.lcx.robotframework.eclipse.utils.TimeParser.parseMillisecond("1 min 30 secs"));
		assertEquals(90000l, org.lcx.robotframework.eclipse.utils.TimeParser.parseMillisecond("1.5 minutes"));
		assertEquals(90000l, org.lcx.robotframework.eclipse.utils.TimeParser.parseMillisecond("90 s"));
		assertEquals(93784005l, org.lcx.robotframework.eclipse.utils.TimeParser.parseMillisecond("1 day 2 hours 3 minutes 4 seconds 5 milliseconds"));
		assertEquals(93784005l, org.lcx.robotframework.eclipse.utils.TimeParser.parseMillisecond("1d 2h 3m 4s 5ms"));
		assertEquals(138308401l, org.lcx.robotframework.eclipse.utils.TimeParser.parseMillisecond("1.5d 2.4h 1.1m 2.4s 1ms"));
		long t2 = System.currentTimeMillis();
		System.out.println(t2-t1);
		
	}
}
