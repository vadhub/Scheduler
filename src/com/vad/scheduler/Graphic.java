package com.vad.scheduler;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graphic extends JPanel {

	JGraf graf = new JGraf();
	@Override
	protected void paintComponent(Graphics g2) {
		
		graf.graph(this);

		super.paintComponent(g2);
		setBackground(Color.BLACK);
		for (int i = 0; i < Run.frame.getWidth(); i = i + 20) {
			g2.setColor(Color.LIGHT_GRAY);
			g2.drawLine(Run.frame.getWidth(), i, 0, i);
		}

		for (int i = 0; i < Run.frame.getHeight() + 310; i = i + 20) {
			g2.setColor(Color.LIGHT_GRAY);
			g2.drawLine(i, Run.frame.getHeight(), i, 0);
		}

	}
}
