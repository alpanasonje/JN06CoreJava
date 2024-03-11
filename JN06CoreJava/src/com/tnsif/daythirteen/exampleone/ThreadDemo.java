package com.tnsif.daythirteen.exampleone;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("----In Main Thread-----------");
		System.out.println(Thread.currentThread().getName());
		//Operations.checkOddEven(5);
		//Operations.displayFactorial(5);
		//creation of child thread
		FirstChildThread firstThread=new FirstChildThread(); 
		SecondChildThread secondThread=new SecondChildThread();
		firstThread.start();
		//firstThread.start();
		secondThread.start();
		
		System.out.println("----End of Main Thread--------");

	}

}
