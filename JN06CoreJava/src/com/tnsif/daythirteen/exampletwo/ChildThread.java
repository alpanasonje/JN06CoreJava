package com.tnsif.daythirteen.exampletwo;

public class ChildThread extends Thread{
	public ChildThread(String name)
	{
		super.setName(name);
		start();
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+"...."+i);
		}
	}
}
