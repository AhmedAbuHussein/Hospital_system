package patient;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel {
	
	private ImageIcon img;
	
	public void paintComponent(Graphics g){
		img = new ImageIcon(getClass().getResource("/images/9.jpg"));
		img.paintIcon(this, g, 0, 0);
	}

}
