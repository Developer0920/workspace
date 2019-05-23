package java0523_inner;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Win extends Frame {
	public Win() {
		setSize(500,500);
		setVisible(true);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	} //end Win()
	
} //end Win

public class Java199_inner_win {

	public static void main(String[] args) {
		new Win();
		
		
	} //end main()

} //end class
