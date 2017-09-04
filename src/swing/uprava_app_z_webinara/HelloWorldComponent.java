package swing.uprava_app_z_webinara;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

public class HelloWorldComponent extends JComponent {
	private static final long serialVersionUID = -8961369611388080169L;

	private static final int DEFAULT_WIDTH = 100;
	private static final int DEFAULT_HEIGHT = 50;


	@Override
	public void paintComponent(Graphics g) {
		//int x = (int) frame.getContentPane().getSize().getWidth() / 2 - (DEFAULT_WIDTH / 2);
		//int y = (int) frame.getContentPane().getSize().getHeight() / 2 + 3;
		g.drawString("Hello, world!", getWidth() / 2 - (DEFAULT_WIDTH / 2), getHeight() / 2 + 3);
	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}


}
