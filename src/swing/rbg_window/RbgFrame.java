package swing.rbg_window;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;

public class RbgFrame extends JFrame {

	private static final long serialVersionUID = -7576211584524781823L;
	private int red;
	private int blue;
	private int green;
	private JFrame main = this;

	public RbgFrame() {
		red = green = blue = 0;
		initUI();
		addInnerMoseMotionListener();
		addMouseWheelListener();
	}

	private void initUI() {
		setTitle("Rbg Colors");
		setSize(510, 510);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void updateTitle() {
		String title = "Rbg Colors | r:" + red + " g:" + green + " b:" + blue;
		this.setTitle(title);
	}

	/**
	 * @see addInnerMouseMotionListener()
	 */
	@SuppressWarnings("unused")
	@Deprecated
	private void addMouseMotionListener() {
		this.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseDragged(MouseEvent e) {
			}

			//
			@Override
			public void mouseMoved(MouseEvent e) {
				double widthStep = main.getSize().getWidth() / 255;
				red = (int) (e.getX() / widthStep);
				double heightStep = main.getSize().getHeight() / 255;
				green = (int) (e.getY() / heightStep);
				main.getContentPane().setBackground(new Color(red, green, blue));
				updateTitle();
			}
		});
	}

	/**
	 * Berie vnutornu velkost kde povodny addMoseMotionListener() 
	 * bral velkost JFrame-u (teda JFrame - border za ktory sa nedalo ist) tak sa nedostalo na vacsie cisla
	 */
	//TODO dalsi krok by bolo  - prerobnenie na JPanel
	private void addInnerMouseMotionListener() {
		this.getContentPane().addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseDragged(MouseEvent e) {
			}

			//
			@Override
			public void mouseMoved(MouseEvent e) {
				double widthStep = main.getContentPane().getSize().getWidth() / 255;
				red = (int) (e.getX() / widthStep);
				double heightStep = main.getContentPane().getSize().getHeight() / 255;
				green = (int) (e.getY() / heightStep);
				main.getContentPane().setBackground(new Color(red, green, blue));
				updateTitle();
			}
		});
	}

	private void addMouseWheelListener() {
		this.addMouseWheelListener(new MouseWheelListener() {

			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				if (e.getWheelRotation() < 0 && blue < 255) {
					if (blue < 230)
						blue += 10;
					else
						blue++;//pre mensie schody
				}

				else if (e.getWheelRotation() > 0 && blue > 0)
					if (blue > 20)
						blue -= 10;
					else
						blue--;//pre mensie schody
				main.getContentPane().setBackground(new Color(red, green, blue));
				updateTitle();
			}
		});
	}

}
