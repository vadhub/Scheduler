package com.vad.scheduler;



import javax.swing.JFrame;

public class Run{
	private static JFrame frame;
	public static void main(String[] args) {
		setFrame(new JFrame("Scheduler"));	
		Graphic g = new Graphic();
		
		
		getFrame().setSize(400, 400);
		getFrame().setVisible(true);
		getFrame().setLocation(400, 400);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().add(g);
	}
	public static JFrame getFrame() {
		return frame;
	}
	public static void setFrame(JFrame frame) {
		Run.frame = frame;
	}

}
