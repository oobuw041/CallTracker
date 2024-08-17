import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

public class AppFrame  extends JFrame{
	CallPanel panel;
	
	
	
	
	
	
	
	AppFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500, 500);
		this.setLayout(new FlowLayout());
		this.setLocationRelativeTo(null);
		this.setTitle("Call Tracker Project");
		
		panel = new CallPanel();
		
		
		
		this.add(panel);
		
		this.setResizable(false);
		this.setVisible(true);
		
	}

	

}
