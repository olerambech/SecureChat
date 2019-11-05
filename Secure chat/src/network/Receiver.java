package network;

import java.io.InputStream;

public class Receiver extends Thread {
	public Receiver(InputStream inputStream) {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		System.out.println("receiver thread started");
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
