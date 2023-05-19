package simpleController17.widget.swing.builder.util;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

import simpleController17.core.view.DefaultViewContainer;
import simpleController17.swing.swing.builder.SwingBuilder;
import simpleController17.swing.swing.builder.layout.GridBagConstraintsBuilder;

//https://github.com/mariogarcia/viewa/blob/c39f7f46dc39908bd23cd4ded0b60c5f555617b8/widget/src/test/java/org/viewaframework/widget/swing/builder/util/SwingBuilderView.java
public class SwingBuilderView extends DefaultViewContainer{
	public SwingBuilderView(){
		super("SwingBuilderViewId",
			new SwingBuilder().layout(new BorderLayout()).component(
					new SwingBuilder().
					layout(new GridBagLayout()).
					 /* (1) label-component */
						label(new GridBagConstraintsBuilder().row(0).col(0).gridWidth(2).build()).
							setName("fromLabel").setText("From").swingBuilder().getTarget()
							,JPanel.class,BorderLayout.NORTH).
						swingBuilder().setPreferredSize(new Dimension(400,0)).getTarget());
	}
}