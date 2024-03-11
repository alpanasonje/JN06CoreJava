package com.tnsif.daythirteen;

public class SingleThreadDemo {

	public static void main(String[] args) {
		System.out.println("----In Main Thread-----------");
		System.out.println(Thread.currentThread().getName());
		Operations.checkOddEven(5);
		Operations.displayFactorial(5);
		System.out.println("----End of Main Thread--------");

	}

}
