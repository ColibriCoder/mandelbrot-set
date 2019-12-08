package com.colibricode.Frames;

import java.awt.Color;
import java.awt.image.BufferedImage;

import com.colibricode.Frame;

public class Fractal extends Frame {
	private static final long serialVersionUID = 1L;
	int width, height, mapSize;
	BufferedImage bi;
	
	public Fractal(int width, int height) {
		super(width, height);
		this.width = width;
		this.height = height;
		this.bi = getBufferedImage();	
		this.mapSize = 4;
	}
	
	public void draw(int iterations) {
		clear();
		Map map = new Map(4);
		
        for (int x = 0; x < height; x++) {
    		for (int y = 0; y < width; y ++) {
    			float[] coord = map.getCoordinate(x, y);
    			
    			
//    			float a = coord[0] * 0.01f - 0.65f;
//				float b = coord[1] * 0.01f - 0.5f;
				
				
				float a = coord[0];
				float b = coord[1];
				float bkA = a;
				float bkB = b;
				int i = 0;
				
				while(i <= iterations) {
					float aa = a * a - b * b;
					float bb = 2 * a * b;
					
					a = aa + bkA;
					b = bb + bkB;
					
					
					if (Math.abs(a + b) > 16) {
						break;
					}

					i++;
				}
				

				if (i < iterations) {
					
					float overflowFix = 1 - 360 / 360;
					
//							System.out.println(width);
//					System.out.println(i);
					bi.setRGB(x, y, Color.HSBtoRGB((i - overflowFix) / iterations, 1, 1));
//	                bi.setRGB(x, y, Color.WHITE.getRGB());
				} else {
//					bi.setRGB(x, y, Color.BLACK.getRGB());
				}
					
				
//				   while(i <= iterations) {
//				      float aa = a * a - b * b;
//				      float bb = 2 * a * b;
//				  
//				      a = aa + bkA;
//				      b = bb + bkB;
//				      if (abs(a + b) > 16) {
//				       break; 
//				      }
//				      i++;
//				    }
//				    
//				    if (i < iterations) {
//				      color c = color(i, iterations, iterations);
//				      pg.stroke(c);
//				    } else {
//				      pg.stroke(0);
//				    }
//				     
//			        pg.point(x, y);
    			
            	
            }
        }	
	
	}
	
	private class Map {
		int size;
		Map(int size) {
			this.size = size;
		}
		public float[] getCoordinate(float x, float y) {
			float a = ((x * size) / width) - size / 2;
			float b = ((y * size) / width) - size / 2;
			
			
//			x --- a
//			width -- size
//			
			
//			float a = (((x * size) / width) / size) - 2;
//			float b = ((y * size / height) / size) - 2;
			
			
			float[] coord = {a, b};
			return coord;
		}
	}
}