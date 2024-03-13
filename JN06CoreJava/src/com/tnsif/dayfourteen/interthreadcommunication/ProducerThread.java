package com.tnsif.dayfourteen.interthreadcommunication;

public class ProducerThread extends Thread {
	Product p;

	ProducerThread(Product p) {
		this.p = p;
	}

	public void run() {
		try {
			while (true) {
				p.put();
				Thread.sleep(600);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
