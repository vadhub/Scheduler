package com.vad.scheduler;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Run {
	static JFrame frame;
	
	static JGraf graf = new JGraf();

	public static void main(String[] args) {
		frame = new JFrame("Scheduler");		
		Graphic g = new Graphic();
		JPanel panelx = new JPanel();
		
		frame.getContentPane().add(g);		

		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setLocation(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	

	}

}
