package java0528_gui;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class WinTest extends Frame {
	public WinTest() {
		//윈도우창의 크기를 가로 300, 세로 400 픽셀단위
		setSize(300, 400);
		
		//윈도우창을 화면에 보이기
		setVisible(true);
		
		//Exit exit = new Exit();
		//this.addWindowListener(exit);
		
		//익명클래스를 사용하는 방법
		this.addWindowListener(new WindowAdapter() {		
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}// end winTest()////////////
	
	class Exit extends WindowAdapter {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	} //end exit/////////////////////
} //end WinTest//////////////

public class Java208_gui {

	public static void main(String[] args) {
		new Win();

	} //end main()

} //end class
