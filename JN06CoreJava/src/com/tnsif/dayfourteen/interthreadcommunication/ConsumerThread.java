package com.tnsif.dayfourteen.interthreadcommunication;

public class ConsumerThread extends Thread {
	Product p;

	public ConsumerThread(Product p) {
		this.p = p;
	}

	public void run() {
		try {
			while (true) {
				p.get();
				Thread.sleep(600);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
