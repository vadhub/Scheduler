package com.vad.scheduler;


import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

public class JGraf {
	public Component graph(JPanel panelx) {
		mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();
		
		graph.getModel().beginUpdate();
		
		Object v1 = graph.insertVertex(parent, null, "Hello", 20, 20, 80, 30);
		Object v2 = graph.insertVertex(parent, null, "World!", 240, 150, 80, 30);

		graph.insertEdge(parent, null, "", v1, v2);
		
		graph.getModel().endUpdate();

		mxGraphComponent graphComponent = new mxGraphComponent(graph);
		ImageIcon icon = new ImageIcon("img/a1.jpg");
		graphComponent.setBackgroundImage(icon);
		
		
		
		
		
		return panelx.add(graphComponent);
		}	  

}
