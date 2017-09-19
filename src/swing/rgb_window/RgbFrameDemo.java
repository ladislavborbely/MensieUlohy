package swing.rgb_window;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class RgbFrameDemo {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			JFrame frame = new RgbFrame();
			frame.setVisible(true);
		});
	}

}
