package com.tnsif.daythirteen.exampletwo;

public class ThreadDemo {

	public static void main(String[] args) {
		ChildThread tOne=new ChildThread("ThreadOne");
		ChildThread tTwo=new ChildThread("ThreadTwo");
		ChildThread tThree=new ChildThread("ThreadThree");		
		/*
		 * tOne.start(); tTwo.start(); tThree.start();
		 */
		System.out.println("-----------------------------------");

	}

}
