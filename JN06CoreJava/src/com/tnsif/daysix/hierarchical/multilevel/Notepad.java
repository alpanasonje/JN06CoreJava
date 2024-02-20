package com.tnsif.daysix.hierarchical.multilevel;

public class Notepad {
	protected String content;
	
	public void writeContent(String str)
	{
		content=content+str;
		System.out.println("We can write simple text in Notepad");
	}
	public void show()
	{
		System.out.println("contents are : "+content);
	}
}
