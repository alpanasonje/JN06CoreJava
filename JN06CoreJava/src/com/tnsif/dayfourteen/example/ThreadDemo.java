package com.tnsif.dayfourteen.example;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Runnable r=()->{
			for(int i=1;i<=30;i++)
			{
				try
				{
				System.out.println(Thread.currentThread()+" : "+i);
				Thread.sleep(0);
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
			}
		};

		Runnable rr=()->{
			for(int i=1;i<=30;i++)
			{
				try
				{
				System.out.println("\t\t\t"+Thread.currentThread()+" : Hello");
				Thread.sleep(0);
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
			}
		};
		
		Thread tOne=new Thread(r, "One");
		tOne.setPriority(1);
		Thread tTwo=new Thread(rr, "Two");
		tTwo.setPriority(3);
		tOne.start();
		tTwo.start();
		
	}

}
