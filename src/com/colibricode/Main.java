package com.colibricode;

import com.colibricode.Window;
import com.colibricode.Renderer;

public class Main {
	
	public static void main(String[] args) {
		int WIDTH = 600;
		int HEIGHT = 600;
		String[] frames = {
			"mandelbrot"
		};

		Window window = new Window(WIDTH, HEIGHT, "~ Mandelbrot set ~");
		Renderer renderer = new Renderer(WIDTH, HEIGHT);
		
		System.out.println("ColibriCode project ~ Mandelbrot set visualisation.");
		
		renderer.renderFrame(frames[0]);
		
		window.setGraphics(renderer.getFrame());
		window.show();
	}
	
}
