package com.vad.scheduler;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
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

		ButtonListener btnListener = new ButtonListener();

		addObj.addActionListener(btnListener);

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

		Run.belegeFlaechenMitListener(panelx);

	}

	protected static boolean d_mouseIsPressed; // Phlegm of the pressed mouse
												// button

	protected static int d_ClickImagePosX = 0; // The left coordinate of the
												// component at the
												// moment of activation of the
												// fleg

	protected static int d_ClickImagePosY = 0; // Upper coordinate

	// I register a component to respond to events

	static public void belegeFlaechenMitListener(final JComponent j)

	{

		j.addMouseListener(new java.awt.event.MouseAdapter()

		{

			public void mouseReleased(MouseEvent e)

			{

				// It works if the mouse click was activated

				if (d_mouseIsPressed)

				{

					setComponentPosTo(j, d_ClickImagePosX + e.getX(),
							d_ClickImagePosY + e.getY());

					d_ClickImagePosX = 0;

					d_ClickImagePosY = 0;

					d_mouseIsPressed = false;

				}

			}

			public void mousePressed(MouseEvent e)

			{

				// We put the phlegm and the coordinates

				d_mouseIsPressed = true;

				d_ClickImagePosX = j.getX() - e.getX();

				d_ClickImagePosY = j.getY() - e.getY();

			}

		});

	}

	// Exposes the component to the position

	public static void setComponentPosTo(JComponent j, int x, int y)

	{

		j.setBounds(x, y, j.getWidth(), j.getHeight());

	}

}
