package network;

import java.io.IOException;
import java.net.Socket;

public class Connection {
	private String ipadress;
	private String myNick;
	private Socket socket;
	public Connection(String ip, String myNick) {
		this.ipadress = ip;
		this.myNick = myNick;
	}
	
	public void connect() {
		try {
			socket = new Socket(ipadress, 5555);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Thread sender = new Sender(socket.getOutputStream());
			Thread receiver = new Receiver(socket.getInputStream());
			sender.start();
			receiver.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
