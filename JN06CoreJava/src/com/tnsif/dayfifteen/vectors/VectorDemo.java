package com.tnsif.dayfifteen.vectors;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) throws InterruptedException {
		//Vector<Integer> v=new Vector();
		ArrayList<Integer> v=new ArrayList<Integer>();
		

		Runnable r=()->
		{
			for(int i=1;i<=5;i++)
				v.add(i);
		};
		
		Runnable rr=()->
		{
			for(int i=100;i<=105;i++)
				v.add(i);
		};
		
		Thread tOne=new Thread(r);
		Thread tTwo=new Thread(rr);
		tOne.start();
		tTwo.start();
		tOne.join();
		tTwo.join();
		System.out.println(v);
	}

}
