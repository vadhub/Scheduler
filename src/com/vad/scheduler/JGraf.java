package com.vad.scheduler;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

public class JGraf{
	static Object v;
	
	public Component graph(JFrame frame, JButton btn,JButton btn2) {		

		mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();
		graph.getModel().beginUpdate();

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				v = graph.insertVertex(parent, null, "DoubleClic", 20, 20, 80, 30);
			}
		});	
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 graph.removeCells(new Object[]{v});				
			}
		});

		Object v1 = graph.insertVertex(parent, null, "Hello", 20, 20, 80, 30);
		Object v2 = graph.insertVertex(parent, null, "World!", 240, 150, 80, 30);

		graph.insertEdge(parent, null, "", v1, v2);

		graph.getModel().endUpdate();

		mxGraphComponent graphComponent = new mxGraphComponent(graph);

		ImageIcon icon = new ImageIcon("img/a1.jpg");
		graphComponent.setBackgroundImage(icon);

		return frame.add(graphComponent);
	}

}
