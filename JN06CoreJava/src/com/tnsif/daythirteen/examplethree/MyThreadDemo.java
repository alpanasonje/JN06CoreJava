package com.tnsif.daythirteen.examplethree;

public class MyThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+"\tStart of Main()------------------------");
		MyThread t1=new MyThread();
		t1.start();
		//t1.run(); single threaded
		//Thread.sleep(1500);
		t1.join(); //main thread will wait till t1 ends
		System.out.println(Thread.currentThread().getName()+"\tEnd of Main()------------------------");
	}

}
