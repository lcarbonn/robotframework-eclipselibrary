/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.utils;

import java.util.HashSet;
import java.util.Set;

import org.lcx.robotframework.eclipse.keyword.swtbot.actionfact.SWTConstants;

public class ShortcutParser {
	
	public static int NOT_FOUND = -1;

	/**
	 * Parse incoming text to int Modification Keys
	 * SWT.ALT | SWT.CTRL | SWT.SHIFT | SWT.COMMAND
	 * @param text
	 * @return
	 */
	public static int parseModificationKeys(String text) {
		String[] s = text.split("\\+");
		Set<Integer> si = new HashSet<Integer>();
		for (int i = 0; i < s.length; i++) {
			if(s[i].trim().equalsIgnoreCase("ALT")) {
				si.add(SWTConstants.ALT);
			} else if(s[i].trim().equalsIgnoreCase("CTRL")) {
				si.add(SWTConstants.CTRL);
			} else if(s[i].trim().equalsIgnoreCase("SHIFT")) {
				si.add(SWTConstants.SHIFT);
			} else if(s[i].trim().equalsIgnoreCase("COMMAND")) {
				si.add(SWTConstants.COMMAND);
			}
		}
		int key = 0;
		for (Integer i : si) {
			key = key | i;
		}
		if(key==0) key = NOT_FOUND;
		return key;
	}
	
	/**
	 * Parse incoming text to char keyboard character
	 * @param text
	 * @return
	 */
	public static char parseCar(String text) {
		return text.trim().charAt(text.length()-1);
	}

	/**
	 * Parse incoming text to SWT keycode
	 * keyCode the keyCode, these may be special keys like F1-F12, or navigation keys like HOME, PAGE_UP
	 * @param text
	 * @return
	 */
	public static int parseKeyCode(String text) {
		String[] s = text.split("\\+");
		int key = NOT_FOUND;
		for (int i = 0; i < s.length; i++) {
			if(s[i].trim().equalsIgnoreCase("F1")) {
				key = SWTConstants.F1;
			} else if(s[i].trim().equalsIgnoreCase("F2")) {
				key = SWTConstants.F2;
			} else if(s[i].trim().equalsIgnoreCase("F3")) {
				key = SWTConstants.F3;
			} else if(s[i].trim().equalsIgnoreCase("F4")) {
				key = SWTConstants.F4;
			} else if(s[i].trim().equalsIgnoreCase("F5")) {
				key = SWTConstants.F5;
			} else if(s[i].trim().equalsIgnoreCase("F6")) {
				key = SWTConstants.F6;
			} else if(s[i].trim().equalsIgnoreCase("F7")) {
				key = SWTConstants.F7;
			} else if(s[i].trim().equalsIgnoreCase("F8")) {
				key = SWTConstants.F8;
			} else if(s[i].trim().equalsIgnoreCase("F9")) {
				key = SWTConstants.F9;
			} else if(s[i].trim().equalsIgnoreCase("F10")) {
				key = SWTConstants.F10;
			} else if(s[i].trim().equalsIgnoreCase("F11")) {
				key = SWTConstants.F11;
			} else if(s[i].trim().equalsIgnoreCase("F12")) {
				key = SWTConstants.F12;
			} else if(s[i].trim().equalsIgnoreCase("UP")) {
				key = SWTConstants.UP;
			} else if(s[i].trim().equalsIgnoreCase("DOWN")) {
				key = SWTConstants.DOWN;
			} else if(s[i].trim().equalsIgnoreCase("LEFT")) {
				key = SWTConstants.LEFT;
			} else if(s[i].trim().equalsIgnoreCase("RIGHT")) {
				key = SWTConstants.RIGHT;
			} else if(s[i].trim().equalsIgnoreCase("HOME")) {
				key = SWTConstants.HOME;
			} else if(s[i].trim().equalsIgnoreCase("END")) {
				key = SWTConstants.END;
			} else if(s[i].trim().equalsIgnoreCase("INSERT")) {
				key = SWTConstants.INSERT;
			} else if(s[i].trim().equalsIgnoreCase("PAGE_UP")) {
				key = SWTConstants.PAGE_UP;
			} else if(s[i].trim().equalsIgnoreCase("PAGE_DOWN")) {
				key = SWTConstants.PAGE_DOWN;
			}
		}
		return key;
	}

}
