package com.colibricode;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import com.colibricode.Frames.Fractal;

public class Renderer {
	private Frame frame;
	private Fractal fractal;
	int width, height;
	
	Renderer(int width, int height) {
		this.width = width;
		this.height = height;
		
	}
	
	public void renderFrame(String title) {
		switch (title) {
			case "mandelbrot":
				fractal = new Fractal(this.width, this.height);
				fractal.draw(100);
				frame = fractal;
		}
	}
	
	public void exportFrame() {
		try {
		    File outputfile = new File("saved.bmp");
		    ImageIO.write(frame.getBufferedImage(), "bmp", outputfile);
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public Frame getFrame() {
		return frame;
	}
	
}
