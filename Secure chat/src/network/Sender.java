package network;

import java.io.OutputStream;

public class Sender extends Thread {
	public Sender(OutputStream outputStream) {
		// TODO Auto-generated constructor stub
	}

	public void run() {
		System.out.println("sender thread started");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
