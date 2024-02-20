package com.tnsif.daysix.hierarchical.multilevel;

public class MsWord extends Wordpad {
	boolean isMailMergePossible;
	
	@Override
	public void writeContent(String str)
	{
		content+=str;
		System.out.println("Writing advance content : "+content);
	}
	public void changeItalicStyle(boolean style)
	{
		super.isItalic=style;
	}
}
