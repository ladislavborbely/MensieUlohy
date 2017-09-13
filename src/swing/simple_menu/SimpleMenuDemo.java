package swing.simple_menu;

import java.awt.EventQueue;

import javax.swing.JFrame;


public class SimpleMenuDemo {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			JFrame frame = new SimpleMenu();
			frame.setVisible(true);
		});
	}

}
