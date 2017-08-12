package com.vad.scheduler;

import javax.swing.JFrame;

public class Run {
	static JFrame frame;

	public static void main(String[] args) {
		frame = new JFrame("Scheduler");		
		Graphic g = new Graphic();

		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setLocation(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(g.addGraph());
		frame.add(g);
		

	}

}
