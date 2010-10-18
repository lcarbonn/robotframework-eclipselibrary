package org.lcx.robotframework.eclipse.utils;

import java.util.ArrayList;
import java.util.List;

public class TimeParser {

	
	public static long parseMillisecond(String text) {
		
		try {
			long d = Integer.parseInt(text);
			return d * 1000;
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		long days = 0l;
		long hours = 0l;
		long minutes = 0l;
		long seconds = 0l;
		long milliseconds = 0l;

		List<String> listValue = new ArrayList<String>();
		List<String> listType = new ArrayList<String>();
		
		String stext = text.toLowerCase();
		StringBuffer temp = new StringBuffer();
		boolean isNumInProgress = false;
		boolean hasChanged = false;

		for (char c : stext.toCharArray()) {
			hasChanged = false;
			if(!isNumInProgress && (Character.isDigit(c) || c=='.')) {
				isNumInProgress = true;
				if(temp.toString().length()>0) listType.add(temp.toString().trim());
				hasChanged = true;
			}
			if(isNumInProgress && !Character.isDigit(c) && c!='.') {
				isNumInProgress = false;
				if(temp.toString().length()>0) listValue.add(temp.toString().trim());
				hasChanged = true;
			}
			if(hasChanged) {
				temp = new StringBuffer();
			}
			temp.append(c);
		}
		if(temp.toString().length()>0) listType.add(temp.toString().trim());
		
		for (int i = 0; i < listType.size(); i++) {
			String type = listType.get(i);

			Double d = Double.valueOf(listValue.get(i));

			if(type.equals("days")
				|| type.equals("day")
				|| type.equals("d")
					) {
					days = ((Double)(d * 86400000d)).longValue();
			}
			else if(type.equals("hours")
					|| type.equals("hour")
					|| type.equals("h")
						) {
					hours = ((Double)(d * 3600000d)).longValue();
				}
			else if(type.equals("minutes")
					|| type.equals("minute")
					|| type.equals("mins")
					|| type.equals("min")
					|| type.equals("m")
						) {
					minutes = ((Double)(d * 60000d)).longValue();
				}
			else if(type.equals("seconds")
					|| type.equals("second")
					|| type.equals("secs")
					|| type.equals("sec")
					|| type.equals("s")
						) {
					seconds = ((Double)(d * 1000d)).longValue();
				}
			else if(type.equals("milliseconds")
					|| type.equals("millisecond")
					|| type.equals("millis")
					|| type.equals("ms")
						) {
					milliseconds = d.longValue();
				}
			else throw new NumberFormatException("Wrong format");
		}
		long time = days + hours + minutes + seconds + milliseconds;
		return time;
	}
}
