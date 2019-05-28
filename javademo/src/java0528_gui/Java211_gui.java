//임의의 위치에 배치하고 싶은 경우

package java0528_gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class UserSize extends Frame {
	Button btn;
	public UserSize() {
		
		//초기화
		//Frame컨테이너의 Layout을 null로 초기화한다.
		//layout은 layoutManager에서 관리. 기본 layout을 사용 안 할 거니까 이걸 null로 준다.
		setLayout(null);
		
		btn = new Button("Button");
		
		//add(BorderLayout.NORTH, btn); //안 나옴. 이렇게 하면 안 된다.
		
		
		//btn.setBounds(50, 50, 200, 150);
		
		//다른 방법
		btn.setSize(200, 150);
		btn.setLocation(50,50);
		add(btn);
				
		setSize(300, 300);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	} //end UserSize() ///////////////////
} //end class



public class Java211_gui {

	public static void main(String[] args) {
		new UserSize();
		
	} //end main()

} //end class
