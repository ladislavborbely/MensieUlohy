package swing.uprava_app_z_webinara;

import javax.swing.JFrame;

public class HelloFrame extends JFrame {

	private static final long serialVersionUID = -4259530147137698520L;

	public HelloFrame() {
		add(new HelloWorldComponent());
		pack();
	}

}
