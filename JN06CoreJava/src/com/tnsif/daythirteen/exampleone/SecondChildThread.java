package com.tnsif.daythirteen.exampleone;

import com.tnsif.daythirteen.Operations;

public class SecondChildThread extends Thread{
	public void run()
	{
		Operations.displayFactorial(5);
	}

}
