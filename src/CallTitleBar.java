import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CallTitleBar extends JPanel{
	JLabel label;
	public CallTitleBar() {
		this.setPreferredSize(new Dimension(400,80));
		this.setBackground(Color.black);
		
		label = new JLabel("Call Tracker");
		label.setFont(new Font("serif", Font.PLAIN, 35));
		label.setForeground(Color.pink);

		label.setPreferredSize(new Dimension(200,80));
		//label.setHorizontalAlignment(JLabel.CENTER);
		
		//label.setOpaque(true);
		
		//this.setBorder(BorderFactory.createEmptyBorder());
		this.add(label);
	}

}
