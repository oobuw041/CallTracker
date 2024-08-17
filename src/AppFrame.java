import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class AppFrame  extends JFrame{
	CallPanel panel;
	CallTitleBar title;
	
	
	
	
	
	
	
	AppFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 700);
		this.setLayout(new BorderLayout());
		this.setLocationRelativeTo(null);
		this.setTitle("Call Tracker Project");
		this.getContentPane().setBackground(Color.black );
		
		
		title = new CallTitleBar();
		title.setBorder(BorderFactory.createEmptyBorder());
		
		panel = new CallPanel();
		panel.setBorder(BorderFactory.createEmptyBorder());
		
		
		this.add(title,BorderLayout.NORTH);
		//this.add(panel,BorderLayout.SOUTH);
		
		
		//this.setResizable(false);
		this.setVisible(true);
		
	}

	

}
