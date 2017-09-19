package swing.uprava_app_z_webinara;

import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JComponent;

public class HelloWorldComponent extends JComponent {
	private static final long serialVersionUID = -8961369611388080169L;

	private static final int DEFAULT_WIDTH = 100;
	private static final int DEFAULT_HEIGHT = 100;


	@Override
	public void paintComponent(Graphics g) {
		String text = "Hello, world!";
		FontMetrics fntm = g.getFontMetrics(g.getFont());
		int textWidht = fntm.stringWidth(text);
		int textHeight = fntm.getHeight();
		g.drawString(text, ((getWidth() / 2 - textWidht / 2)), ((getHeight() / 2 + textHeight / 2)));

	}

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}


}
