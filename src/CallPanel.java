
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class CallPanel extends JPanel {
  
	JCheckBox checkBox;
	
	JTextField textfield;
	JButton button;
	
	public CallPanel() {
		this.setBackground(Color.black);
		this.setPreferredSize(new Dimension(500,500));
		this.setLayout(new GridLayout(10,1));
		
		
		checkBox = new JCheckBox();
	     button = new JButton();
		
		textfield = new JTextField();
	    textfield.setPreferredSize(new Dimension(400,500));
		 textfield.setBackground(Color.white);
		
		
			
		
		 this.setBorder(BorderFactory.createEmptyBorder());
		// this.add(button);
		
		
	}

}
