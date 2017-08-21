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
	static JButton save = new JButton("Save");

	static JPanel panelx = new JPanel();
	static JPanel panelMenu = new JPanel();
	static JPanel mainPanel = new JPanel();

	static JMenuBar menuBar = new JMenuBar();
	static JMenu menu = new JMenu("Window");
	static JMenuItem mitem = new JMenuItem("Tools");
	static JMenuItem mitemE = new JMenuItem("Chnage Style Edge");

	public static void main(String[] args) {

		panelx.setLayout(new BoxLayout(panelx, BoxLayout.X_AXIS));
		panelMenu.setLayout(new BoxLayout(panelMenu, BoxLayout.X_AXIS));

		mainPanel.setLayout(new BorderLayout());

		ActionList.ActionObj(mitem, panelx);		
		ActionList.ScreenShot(save, frame);
		ActionList.ChnageStyleEdge(mitemE);
		
		
		panelMenu.add(menuBar);

		menuBar.add(menu);
		menu.add(mitem);
		menu.add(mitemE);

		panelx.add(addObj);
		panelx.add(delete);
		panelx.add(save);

		mainPanel.add("North", panelMenu);
		mainPanel.add("South", panelx);

		panelx.setBackground(Color.LIGHT_GRAY);

		frame.setLayout(new BorderLayout());

		frame.add("North", mainPanel);

		graf.graph(frame, addObj, delete);

		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setLocation(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}