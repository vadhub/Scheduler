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

	static mxGraph graph = new mxGraph();
	static boolean c = false;

	public Component graph(JFrame frame, JButton btn, JButton btn2) {

		Object parent = graph.getDefaultParent();
		graph.getModel().beginUpdate();
		if(c==true){		
		JGraf.EdgeStyle();
		}else{
			System.out.println("It's ok");
		}

		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				v = graph.insertVertex(parent, null, "DoubleClic", 80, 80, 80,
						30);

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

	static public Map<String, Object> EdgeStyle() {

		Map<String, Object> style = graph.getStylesheet().getDefaultEdgeStyle();
		style.put(mxConstants.STYLE_EDGE, mxEdgeStyle.SideToSide);
		
		return style;

	}

}
