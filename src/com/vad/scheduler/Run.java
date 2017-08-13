package com.vad.scheduler;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Run {
	static JFrame frame;
	
	static JGraf graf = new JGraf();

	public static void main(String[] args) {
		frame = new JFrame("Scheduler");
		
		JPanel panelx = new JPanel();
		
		graf.graph(frame);

		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setLocation(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	

	}

}
