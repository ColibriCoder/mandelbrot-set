package com.colibricode;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Frame extends JPanel {
	private static final long serialVersionUID = 1L;
	int width, height;
	BufferedImage bi;
	public Frame(int width, int height) {
		this.width = width;
		this.height = height;
		bi = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.BLACK);
		g.drawImage(bi, 0, 0, null);
	}	


	public void clear() {
		for (int y = 0; y < width; y += 1) {
            for (int x = 0; x < height; x++) {
            	bi.setRGB(x, y, Color.BLACK.getRed());
            }
        }	
	}
	
	public BufferedImage getBufferedImage() {
		return bi;
	}
}


