package com.vad.scheduler;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionList {
	public static void Action(JLabel close,JPanel panel) {

		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				panel.setVisible(false);				
			}
		});
	}
	
	public static void ActionObj(JComponent comp,JPanel panel) {

		comp.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				panel.setVisible(true);	
				panel.setBounds(34, 34, 70, 100);
			}
		});
		

	}


}
