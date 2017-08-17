package com.vad.scheduler;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Run {
	static JFrame frame = new JFrame("Scheduler");
	static JGraf graf = new JGraf();
	static JButton addObj = new JButton("Add");
	static JButton delete = new JButton("Delete");

	public static void main(String[] args) {

		JPanel panelx = new JPanel();
		JPanel panelMenu = new JPanel();
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Window");
		JMenuItem mitem = new JMenuItem("Tools");		

		panelx.setLayout(new BoxLayout(panelx, BoxLayout.Y_AXIS));
		panelMenu.setLayout(new BoxLayout(panelMenu, BoxLayout.X_AXIS));
		
		panelMenu.add(menuBar);

		menuBar.add(menu);
		menu.add(mitem);	

		panelx.setBounds(34, 34, 70, 100);

		panelx.add(addObj);
		panelx.add(delete);

		panelx.setBackground(Color.LIGHT_GRAY);

		frame.setLayout(new BorderLayout());

		frame.add(panelx);
		frame.add("North", panelMenu);

		graf.graph(frame, addObj, delete);

		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setLocation(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JComponentDragging.belegeFlaechenMitListener(panelx);

	}

	

}
