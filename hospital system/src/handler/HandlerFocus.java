package handler;

import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class HandlerFocus implements FocusListener {

	public void focusGained(FocusEvent e) {
		
		e.getComponent().setBackground(Color.LIGHT_GRAY);
	}

	public void focusLost(FocusEvent e) {
		
		e.getComponent().setBackground(Color.WHITE);
	}

}
