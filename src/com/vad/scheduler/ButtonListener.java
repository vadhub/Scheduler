package com.vad.scheduler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

import com.mxgraph.view.mxGraph;

public class ButtonListener implements ActionListener{
	
	ArrayList<Object> objects = new ArrayList<Object>();	
	mxGraph graph = new mxGraph();
	Object parent = graph.getDefaultParent();
	
	JButton btn = new JButton();
	
	public ButtonListener(JButton btn){
		this.btn = btn;
	}

	@Override
	public void actionPerformed(ActionEvent e) {		
		if(e.getSource() == btn){
			objects.add(graph.insertVertex(parent, null, "DoubleClic", 20, 20, 80, 30));
			graph.insertEdge(parent, null, "", objects, parent);
		}
	}
	
}
