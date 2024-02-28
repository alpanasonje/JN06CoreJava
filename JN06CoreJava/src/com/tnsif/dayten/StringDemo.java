package com.tnsif.dayten;

public class StringDemo {

	public static void main(String[] args) {
		String s="Hello";
		String sOne="Hi";
		String sTwo="Hello";
		
		System.out.println(s+"\t"+s.hashCode());
		System.out.println(sOne+"\t"+sOne.hashCode());
		System.out.println(sTwo+"\t"+sTwo.hashCode());
		
		System.out.println(s==sOne); //references
		System.out.println(s==sTwo);
		System.out.println(sTwo==sOne);
		
		String sFour=new String("Hello");
		System.out.println(sFour+"\t"+sFour.hashCode());
		System.out.println(sTwo==sFour); //comparing memory references
		System.out.println(sTwo.equals(sFour)); //comparing contents
		
		s="   Hello Student!! Good Afternoon   ";
		System.out.println(s+" Length : "+s.length());
		System.out.println("character at 2 position : "+s.charAt(2));
		System.out.println("Index of o : "+s.indexOf('o',5));
		System.out.println("Last index of o : "+s.lastIndexOf('o'));
		System.out.println(s.trim());
		System.out.println("SQL".compareTo("Python"));
		System.out.println("SQL".compareTo("SQL"));
		s="Hello";
		System.out.println(s==sTwo);
		s=s.toUpperCase();
		System.out.println(s==sTwo);
		System.out.println("---------------------------------------------");
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb);
		sb.append(" Students");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		System.out.println("---------------------------------------------");
		StringBuilder ssb=new StringBuilder(s);
		System.out.println(ssb);
		ssb.append(" Students!!");
		System.out.println(ssb);
		ssb.replace(5, 5, " TNSIF ");
		System.out.println(ssb);
		
		
	}

}
