import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class CallerNames extends JPanel {
	JLabel index;
	JTextField caller;
	JButton done;
	boolean checked ;
	
	public CallerNames() {
		this.setPreferredSize(new Dimension(40,20));
		this.setBackground(Color.pink);
		
		this.setLayout(new BorderLayout());
		
		
	    checked = false;
		
		index = new JLabel("");
		index.setPreferredSize(new Dimension(20,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		 this.add(index, BorderLayout.WEST);
		 
		 caller = new JTextField("Your task here");
		 caller.setBorder(BorderFactory.createEmptyBorder());
		 caller.setBackground(Color.pink);
		 
		 this.add(caller, BorderLayout.CENTER);
		 
		 done = new JButton("done");
		 done.setPreferredSize(new Dimension(80,40));
		 caller.setBorder(BorderFactory.createEmptyBorder());
		 
		 this.add(done, BorderLayout.EAST);
		 
	}
	public JButton getDone() {
		return done;
	}
	public void changeIndex(int num) {
		this.index.setText(num+"");
		this.revalidate();
	}
	
	
	public void changeState() { //when you click on the done button
		this.setBackground(Color.green);
		caller.setBackground(Color.green);
		checked = true;
	}
	

}
