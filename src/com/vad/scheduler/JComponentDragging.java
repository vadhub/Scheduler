package com.vad.scheduler;

import java.awt.event.MouseEvent;

import javax.swing.JComponent;

public class JComponentDragging {
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
