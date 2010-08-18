package org.lcx.robotframework.swtbot.commons;

/*
 * Class color to manage acces to SWT colors
 */
public class Color {

	private int red;
	private int green;
	private int blue;
	
	public Color(int red, int green, int blue) {
		super();
		this.red = red;
		this.green = green;
		this.blue = blue;
	}
	
	public int getRed() {
		return red;
	}
	public void setRed(int red) {
		this.red = red;
	}
	public int getGreen() {
		return green;
	}
	public void setGreen(int green) {
		this.green = green;
	}
	public int getBlue() {
		return blue;
	}
	public void setBlue(int blue) {
		this.blue = blue;
	}
	
	public String toString() {
		
		return "#" + format(red) +format(green) + format(blue);
		
	}
	
	private String format(int color) {
		String r = Integer.toString(color, 16);
		if(red<16) r = "0"+r;
		return r.toUpperCase();
	}
}
