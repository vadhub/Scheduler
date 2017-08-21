package com.vad.scheduler;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.view.mxEdgeStyle;
import com.mxgraph.view.mxGraph;

public class JGraf {
	static Object v;
	
	mxGraph graph = new mxGraph();

	public Component graph(JFrame frame, JButton btn, JButton btn2) {

		
		Object parent = graph.getDefaultParent();
		graph.getModel().beginUpdate();	


		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				v = graph.insertVertex(parent, null, "DoubleClic", 80, 80, 80, 30);		
			
			}
		});

		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				graph.removeCells();
			}
		});

		graph.insertEdge(parent, null, "", v, parent);

		graph.getModel().endUpdate();

		mxGraphComponent graphComponent = new mxGraphComponent(graph);

		ImageIcon icon = new ImageIcon("img/a1.jpg");
		graphComponent.setBackgroundImage(icon);

		return frame.add(graphComponent);
	}
	
	public void EdgeStyle(){
		Map<String, Object> style = graph.getStylesheet().getDefaultEdgeStyle();
		style.put(mxConstants.STYLE_EDGE, mxEdgeStyle.SideToSide);
	}

}
