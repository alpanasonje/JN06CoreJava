package com.tnsif.daythirteen.examplefour;

public class RunnableDemo {

	public static void main(String[] args) {
		//Using implementable class
		ClassOne obj=new ClassOne();
		Thread t=new Thread(obj);
		t.start();
		
		//using anonymous class
		Runnable r=new Runnable() {
			@Override
			public void run() {
				for(int i=1;i<=20;i+=2)
				{
					System.out.println("Odd number : "+i);
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
				}
			}
		};
		
		Thread tOne=new Thread(r);
		tOne.start();
		
		//Using Lambda Expression
		Runnable rr=()->{
			for(int i=2;i<=20;i+=2)
			{
				System.out.println("Even number : "+i);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
		};
		Thread tTwo=new Thread(rr);
		tTwo.start();
	}

}
