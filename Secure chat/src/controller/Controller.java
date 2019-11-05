package controller;

import gui.Window;
import network.Receiver;

public class Controller {
	public static void main(String[] args) {
		Window window = new Window();
		Thread rec = new Receiver(window.getChatField());
		rec.start();
	}
}
