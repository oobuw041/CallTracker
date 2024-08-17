import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class CallTitleBar extends JPanel{
	JLabel label;
	public CallTitleBar() {
		label = new JLabel("Call Tracker");
		label.setFont(new Font("serif", Font.PLAIN, 35));
		label.setForeground(Color.pink);
		label.setBackground(Color.black);
		label.setPreferredSize(new Dimension(500,80));
		label.setOpaque(true);
		
		this.add(label);
	}

}
