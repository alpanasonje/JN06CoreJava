package com.tnsif.dayeighteen;

public class RunnableDemo {

	public static void main(String[] args) {
		
		//two threads
		//Thread 1 - Display Hello 10 times
		
		//Thread 2 - Display even nos between 1 to 100
		
		Runnable r=()->{
			for(int i=1;i<=10;i++)
				System.out.println(Thread.currentThread().getName()+" : Hello");
		};
		
		Runnable rr=()->
		{
			for(int i=2;i<=20;i+=2)
				System.out.println("\t\t\t"+Thread.currentThread().getName()+" : "+i);
		};

		Thread t1=new Thread(r,"Thread-One");
		Thread t2=new Thread(rr,"Thread-Two");
		
		t1.start();
		t2.start();
	}

}
