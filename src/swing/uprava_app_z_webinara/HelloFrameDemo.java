package swing.uprava_app_z_webinara;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class HelloFrameDemo {
	public static void main(String[] args) {

		EventQueue.invokeLater(() -> {
			JFrame frame = new HelloFrame();
			frame.setTitle("Hello world in Swing");
			frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}
