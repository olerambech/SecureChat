package test;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestSender {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 5555);
			OutputStream ut = socket.getOutputStream();
			byte[] utBytes = "Dette er fra internett".getBytes();
			ut.write(utBytes);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
