package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

import gui.Window;
import network.Connection;
import network.StartReceiver;

public class Controller { 
	public static void main(String[] args) {
		Window window = new Window();
		Thread rec = new StartReceiver(window.getChatField());
		rec.start();
		
		JButton btnConnect = window.getbtnConnect();
		
		btnConnect.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				System.out.println("Trying to connect to partner...");
				Connection connect = new Connection(window.getIp(), "TestNick");
				connect.connect();
			}
		});
	}
}
