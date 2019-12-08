package com.colibricode;

import java.awt.Graphics;
import javax.swing.JFrame;

public class Window {
	int width;
	int height;
	JFrame window;
	
	Window(int width, int height, String title) {
		this.window = create(width, height, title);
	}
	
	public void setGraphics(Frame frame) {
		window.add(frame);
	}
	
	public void show() {
		window.setVisible(true);
	}
	
	private JFrame create(int width, int height, String title) {
		JFrame window;
		window = new JFrame("~ Mandelbrot set ~");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setSize(width, height);
		return window;
	}
}
