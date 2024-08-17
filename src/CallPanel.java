
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class CallPanel extends JPanel {
  
	JCheckBox checkBox;
	JLabel label;
	JTextField textfield;
	JButton button;
	
	public CallPanel() {
		this.setBackground(Color.black);
		this.setPreferredSize(new Dimension(500,500));
		this.setLayout(new GridLayout(10,1));
		
		label = new JLabel("Call Tracker");
		label.setFont(new Font("serif", Font.PLAIN, 35));
		label.setForeground(Color.pink);
		label.setBackground(Color.black);
		label.setPreferredSize(new Dimension(500,80));
		label.setOpaque(true);
		checkBox = new JCheckBox();
		
		textfield = new JTextField();
		//textfield.setPreferredSize(new Dimension(400,500));
		 textfield.setBackground(Color.black);
		
		
		button = new JButton();
		button.add(textfield);
		button.add(checkBox);
		textfield.add(checkBox);
		checkBox.setBackground(Color.pink);
		
		this.add(label);
		this.add(button);
		//this.add(checkBox);
		
	}

}
