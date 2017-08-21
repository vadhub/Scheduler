package com.vad.scheduler;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
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

	static public void ChnageStyleEdge(JMenuItem item) {

		item.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JGraf.c = true;
				System.out.println("j");
			}
		});
	}

	// button screenshot frame image
	public static void ScreenShot(JButton btn, JFrame f) {

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				BufferedImage img = screenShot(f.getContentPane());
				try {
					// write the image as a PNG
					ImageIO.write(img, "png", new File("screenshot.png"));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	// method for screenshots
	private static BufferedImage screenShot(Component component) {

		BufferedImage image = new BufferedImage(component.getWidth(),
				component.getHeight(), BufferedImage.TYPE_3BYTE_BGR);

		component.paint(image.getGraphics());

		return image;
	}

}
