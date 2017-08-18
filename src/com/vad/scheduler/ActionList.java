package com.vad.scheduler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class ActionList {
	public static void Action(JLabel close, JPanel panel) {

		close.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				panel.setVisible(false);
			}
		});
	}

	public static void ActionObj(JMenuItem item, JPanel panel) {

		item.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				panel.setVisible(true);
				panel.setBounds(34, 34, 70, 100);

			}
		});

	}

}
