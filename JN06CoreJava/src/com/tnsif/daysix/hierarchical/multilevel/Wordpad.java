package com.tnsif.daysix.hierarchical.multilevel;

public class Wordpad extends Notepad {
	protected boolean isBold;
	protected boolean isItalic;
	
	protected String image;
	
	@Override
	public void writeContent(String str)
	{
		super.content+=str;
	}
	
	public void changeStyle(boolean boldStyle)
	{
		isBold=boldStyle;
	}
	
	public void addImage(String img)
	{
		image=img;
	}	
}
