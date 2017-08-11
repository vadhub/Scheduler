package com.vad.scheduler;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Graphic extends JPanel{
	
	
	@Override
	protected void paintComponent(Graphics g2) {
	    super.paintComponent(g2);
	    setBackground(Color.BLACK);	    
	    for (int i = 0; i < Run.getFrame().getWidth(); i = i + 20) {
			g2.setColor(Color.LIGHT_GRAY);
			g2.drawLine(Run.getFrame().getWidth(), i, 0, i);				
						

		}
	    
	    for (int i = 0; i < Run.getFrame().getHeight(); i = i + 20) {
			g2.setColor(Color.LIGHT_GRAY);					
			g2.drawLine(i, Run.getFrame().getHeight(), i, 0);
		}
	    
	}
}
