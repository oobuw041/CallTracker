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
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		this.setTitle("Call Tracker Project");
		
		title = new CallTitleBar();
		
		panel = new CallPanel();
		
		
		this.add(title,BorderLayout.NORTH);
		//this.add(panel,BorderLayout.SOUTH);
		
		
		//this.setResizable(false);
		this.setVisible(true);
		
	}

	

}
