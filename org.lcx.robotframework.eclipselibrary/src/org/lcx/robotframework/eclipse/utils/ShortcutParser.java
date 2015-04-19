/*
 * Copyright 2010 L. Carbonnaux
 */
package org.lcx.robotframework.eclipse.utils;

import java.util.HashSet;
import java.util.Set;

import org.lcx.robotframework.eclipse.bridge.SWTBotBridgeException;


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
	public static char parseCar(String text) throws SWTBotBridgeException {
		//Check if keycode is passed
		String[] s = text.split("\\+");
		for (int i = 0; i < s.length; i++) {
			String ks = s[i].trim();
			if(ks.equalsIgnoreCase("SPACE")) {
				return ' ';
			}
			else if(ks.equalsIgnoreCase("ENTER")) {
				return '\r';
			}
			else if(ks.equalsIgnoreCase("CR")) {
				return '\r';
			}
		}
		
		if(text.length()>0) return text.charAt(text.length()-1);
		throw new SWTBotBridgeException("No character specified");
	}

	/**
	 * Parse incoming text to SWT keycode
	 * keyCode the keyCode, these may be special keys like F1-F15, or navigation keys like HOME, PAGE_UP
	 * @param text
	 * @return
	 */
	public static int parseKeyCode(String text) {
		String[] s = text.split("\\+");
		int key = NOT_FOUND;
		for (int i = 0; i < s.length; i++) {
			String ks = s[i].trim();
			if(ks.equalsIgnoreCase("F1")) {
				key = SWTConstants.F1;
			} else if(ks.equalsIgnoreCase("F2")) {
				key = SWTConstants.F2;
			} else if(ks.equalsIgnoreCase("F3")) {
				key = SWTConstants.F3;
			} else if(ks.equalsIgnoreCase("F4")) {
				key = SWTConstants.F4;
			} else if(ks.equalsIgnoreCase("F5")) {
				key = SWTConstants.F5;
			} else if(ks.equalsIgnoreCase("F6")) {
				key = SWTConstants.F6;
			} else if(ks.equalsIgnoreCase("F7")) {
				key = SWTConstants.F7;
			} else if(ks.equalsIgnoreCase("F8")) {
				key = SWTConstants.F8;
			} else if(ks.equalsIgnoreCase("F9")) {
				key = SWTConstants.F9;
			} else if(ks.equalsIgnoreCase("F10")) {
				key = SWTConstants.F10;
			} else if(ks.equalsIgnoreCase("F11")) {
				key = SWTConstants.F11;
			} else if(ks.equalsIgnoreCase("F12")) {
				key = SWTConstants.F12;
			} else if(ks.equalsIgnoreCase("F13")) {
				key = SWTConstants.F13;
			} else if(ks.equalsIgnoreCase("F14")) {
				key = SWTConstants.F14;
			} else if(ks.equalsIgnoreCase("F15")) {
				key = SWTConstants.F15;
			} else if(ks.equalsIgnoreCase("ARROW_UP")) {
				key = SWTConstants.ARROW_UP;
			} else if(ks.equalsIgnoreCase("ARROW_DOWN")) {
				key = SWTConstants.ARROW_DOWN;
			} else if(ks.equalsIgnoreCase("ARROW_LEFT")) {
				key = SWTConstants.ARROW_LEFT;
			} else if(ks.equalsIgnoreCase("ARROW_RIGHT")) {
				key = SWTConstants.ARROW_RIGHT;
			} else if(ks.equalsIgnoreCase("HOME")) {
				key = SWTConstants.HOME;
			} else if(ks.equalsIgnoreCase("END")) {
				key = SWTConstants.END;
			} else if(ks.equalsIgnoreCase("INSERT")) {
				key = SWTConstants.INSERT;
			} else if(ks.equalsIgnoreCase("PAGE_UP")) {
				key = SWTConstants.PAGE_UP;
			} else if(ks.equalsIgnoreCase("PAGE_DOWN")) {
				key = SWTConstants.PAGE_DOWN;
			} else if(ks.equalsIgnoreCase("KEYPAD_MULTIPLY")) {
				key = SWTConstants.KEYPAD_MULTIPLY;
			} else if(ks.equalsIgnoreCase("KEYPAD_ADD")) {
				key = SWTConstants.KEYPAD_ADD;
			} else if(ks.equalsIgnoreCase("KEYPAD_SUBTRACT")) {
				key = SWTConstants.KEYPAD_SUBTRACT;
			} else if(ks.equalsIgnoreCase("KEYPAD_DECIMAL")) {
				key = SWTConstants.KEYPAD_DECIMAL;
			} else if(ks.equalsIgnoreCase("KEYPAD_DIVIDE")) {
				key = SWTConstants.KEYPAD_DIVIDE;
			} else if(ks.equalsIgnoreCase("KEYPAD_0")) {
				key = SWTConstants.KEYPAD_0;
			} else if(ks.equalsIgnoreCase("KEYPAD_1")) {
				key = SWTConstants.KEYPAD_1;
			} else if(ks.equalsIgnoreCase("KEYPAD_2")) {
				key = SWTConstants.KEYPAD_2;
			} else if(ks.equalsIgnoreCase("KEYPAD_3")) {
				key = SWTConstants.KEYPAD_3;
			} else if(ks.equalsIgnoreCase("KEYPAD_4")) {
				key = SWTConstants.KEYPAD_4;
			} else if(ks.equalsIgnoreCase("KEYPAD_5")) {
				key = SWTConstants.KEYPAD_5;
			} else if(ks.equalsIgnoreCase("KEYPAD_6")) {
				key = SWTConstants.KEYPAD_6;
			} else if(ks.equalsIgnoreCase("KEYPAD_7")) {
				key = SWTConstants.KEYPAD_7;
			} else if(ks.equalsIgnoreCase("KEYPAD_8")) {
				key = SWTConstants.KEYPAD_8;
			} else if(ks.equalsIgnoreCase("KEYPAD_9")) {
				key = SWTConstants.KEYPAD_9;
			} else if(ks.equalsIgnoreCase("KEYPAD_EQUAL")) {
				key = SWTConstants.KEYPAD_EQUAL;
			} else if(ks.equalsIgnoreCase("KEYPAD_CR")) {
				key = SWTConstants.KEYPAD_CR;
			} else if(ks.equalsIgnoreCase("HELP")) {
				key = SWTConstants.HELP;
			} else if(ks.equalsIgnoreCase("CAPS_LOCK")) {
				key = SWTConstants.CAPS_LOCK;
			} else if(ks.equalsIgnoreCase("NUM_LOCK")) {
				key = SWTConstants.NUM_LOCK;
			} else if(ks.equalsIgnoreCase("SCROLL_LOCK")) {
				key = SWTConstants.SCROLL_LOCK;
			} else if(ks.equalsIgnoreCase("PAUSE")) {
				key = SWTConstants.PAUSE;
			} else if(ks.equalsIgnoreCase("BREAK")) {
				key = SWTConstants.BREAK;
			} else if(ks.equalsIgnoreCase("PRINT_SCREEN")) {
				key = SWTConstants.PRINT_SCREEN;
			}
		}
		return key;
	}

}
