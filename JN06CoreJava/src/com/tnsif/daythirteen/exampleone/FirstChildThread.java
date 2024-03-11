package com.tnsif.daythirteen.exampleone;

import com.tnsif.daythirteen.Operations;

public class FirstChildThread extends Thread {
	public void run()
	{
		Operations.checkOddEven(5);
	}
}
