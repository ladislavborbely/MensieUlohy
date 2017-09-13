package swing.rbg_window;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class RbgFrameDemo {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			JFrame frame = new RbgFrame();
			frame.setVisible(true);
		});
	}

}
