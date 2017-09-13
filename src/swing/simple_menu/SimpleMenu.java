package swing.simple_menu;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SimpleMenu extends JFrame {
	private static final long serialVersionUID = 9131573823137833322L;

	public SimpleMenu() {
		initGUI();
	}

	private void initGUI() {
		createSimpleMenuBar();
		setTitle("Simple menu");
		setSize(250, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void createSimpleMenuBar() {

		JMenuBar simpleMenuBar = new JMenuBar();
		JMenu topLevelItem = new JMenu("Moje menu");

		JMenuItem smallItem = new JMenuItem("Exit");

		smallItem.setToolTipText("Ukoncit aplikaciu");
		smallItem.addActionListener((ActionEvent event) -> {
			System.exit(0);
		});

		topLevelItem.add(smallItem);
		simpleMenuBar.add(topLevelItem);
		setJMenuBar(simpleMenuBar);
	}

}
