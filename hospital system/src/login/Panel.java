package login;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel {

	
	private ImageIcon icon;
	
	public void paintComponent(Graphics g){
		
		icon = new ImageIcon(getClass().getResource("/Images/log.png"));
		icon.paintIcon(this, g, 0, 0);
		
		
	}
	
	

}
