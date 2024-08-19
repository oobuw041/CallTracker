import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

public class CallerNames extends JPanel {
	JLabel index;
	JTextField caller;
	JCheckBox done;
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
		 
		 caller = new JTextField("Add Caller");
		 caller.setBorder(BorderFactory.createEmptyBorder());
		 caller.setBackground(Color.pink);
		 
		 this.add(caller, BorderLayout.CENTER);
		 
		 done = new JCheckBox();
		 done.setPreferredSize(new Dimension(80,40));
		 caller.setBorder(BorderFactory.createEmptyBorder());
		 
		 this.add(done, BorderLayout.WEST);
		 
	}
	public JCheckBox getDone() {
		return done;
	}
	
	/*public void changeIndex(int num) {
		this.index.setText(num+"");
		this.revalidate();
	}
	*/
	
	public void moveDown() { //when you click on the done button it moves it to the bottom
		this.setBackground(Color.green);
		caller.setBackground(Color.green);
		checked = true;
	}
	

}
