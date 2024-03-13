package com.tnsif.dayfourteen.interthreadcommunication;

public class Product {
	int n;
	boolean status=true;
	synchronized void  put() throws InterruptedException
	{
		if (status)
		{
			n++;
			System.out.println("Product produced..."+n);
			status=false;
			notify();
		}
		else
		{
			wait();			
			status=true;
		}
		
	}
	synchronized void get()throws InterruptedException
	{
		if (!status)
		{
			System.out.println("Product consumed..."+n);
			status=true;
			notify();
		}
		else
		{
			wait();			
			status=false;
		}
		
		
	}
}
