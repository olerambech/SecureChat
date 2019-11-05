package network;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JTextArea;

public class Receiver extends Thread {
	private ServerSocket servSocket;
	private Socket socket;
	private JTextArea chatField;
	public Receiver(JTextArea chatField) {
		
		this.chatField = chatField;
		
	}
	public void run() {
		System.out.println("Waiting for a connection...");
		
		try {
			servSocket = new ServerSocket(5555);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		chatField.setText("test");
		chatField.updateUI();
		while(true) {
			try {
				socket = servSocket.accept();
				InputStream in = socket.getInputStream();
				byte[] inBytes = new byte[100];
				in.read(inBytes, 0, 100);
				chatField.setText(chatField.getText() + "\n" + new String(inBytes));
				chatField.updateUI();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
				
			
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
