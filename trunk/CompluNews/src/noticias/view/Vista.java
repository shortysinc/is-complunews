package noticias.view;

import javax.swing.JFrame;

import noticias.controller.Controller;

public class Vista extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	
	public Vista(Controller controller) 
	{
		
	}

	public void setVisibility(boolean b) {
		if (b) this.frame.setVisible(true);
		else this.frame.setVisible(false);
		
	}

	

}
