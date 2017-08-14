package com.vad.scheduler;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Run {
	static JFrame frame = new JFrame("Scheduler");
	static JGraf graf = new JGraf();

	public static void main(String[] args) {

		JPanel panelx = new JPanel();

		JButton addObj = new JButton("Add");
		JButton delete = new JButton("Delete");

		panelx.setLayout(new BoxLayout(panelx, BoxLayout.Y_AXIS));

		panelx.add(addObj);
		panelx.add(delete);

		panelx.setBackground(Color.blue);

		frame.setLayout(new BorderLayout());

		frame.add("West", panelx);

		graf.graph(frame);
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setLocation(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
