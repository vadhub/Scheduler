package com.vad.scheduler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

public class ButtonListener implements ActionListener {

	Object objects;
	mxGraph graph = new mxGraph();
	Object parent = graph.getDefaultParent();
	mxGraphComponent graphComponent;	
	ImageIcon icon = new ImageIcon("img/a1.jpg");	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Run.addObj) {
			
			graph.getModel().beginUpdate();			
			objects = graph.insertVertex(parent, null, "DoubleClic", 20, 20,80, 30);
			graph.insertEdge(parent, null, "", objects, null);		
			
			System.out.println("f");

			graph.getModel().endUpdate();
			graphComponent = new mxGraphComponent(graph);
			graphComponent.setBackgroundImage(icon);
		}
	}	
}
