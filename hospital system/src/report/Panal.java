package report;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panal extends JPanel {
ImageIcon img;
	
	public void paintComponent(Graphics g){
		try{
			img = new ImageIcon(getClass().getResource("/Images/11.jpg"));
			img.paintIcon(this, g, 0, 0);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
