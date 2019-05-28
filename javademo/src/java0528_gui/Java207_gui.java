package java0528_gui;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/*
 * 컴퓨터와 사용자 인터페이스
 * 1 CUI(Character User Interface) : 문자대화방식 - DOS, Linux
 * 2 GUI(Graphics User Interface) : 그림대화방식 - WINDOW
 * 
 * 자바에서 GUI를 구현할 수 있도록 AWT, Swing을 제공한다.
 * 
 * Component(컴포넌트) : 화면 디자인해주는 것들
 * 1 비주얼 컴포넌트 : 자기 자신 위에 다른 컴포넌트를 연결할 수 없는 컴포넌트이다.
 * 2 컨테이너 : 자기 자신 위에 다른 컴포넌트를 연결할 수 있는 컴포넌트이다.
 * 3 메뉴 컴포넌트 : 메뉴에 관련된 컴포넌트이다.
 * 
 * Event(이벤트) : 컴포넌트에서 키보드로 입력하고, 클릭하고 하는 행동을 컴포넌트에 사건이 발생된 것인데 이를 이벤트라 한다.
 * 
 * eventListener(이벤트리스너) : ex. 미리 연결을 시켜놓고 버튼에서 이벤트가 발생하기를 기다리고 있음.
 *  컴포넌트에서 이벤트가 발생되면 이를 해결해야 하는데, 해결할 메소드를 정의해놓은 인터페이스다.
 *  
 *  컴포넌트	이벤트		리스너(인터페이스)	메소드(컴포넌트에서 이벤트가 발생하면 리스너에서 해결할 수 있도록 연결해줌)
 *  Frame	WindowEvent	WindowListener	addWindowListener()
 *  Button	ActionEvent	ActionListener	addWindowListener()
 *  Checkbox	ItemEvent	ItemLister	addItemListener()
 *  
 *  
 *  
 */
//실제 작업 시에는 클래스는 나눠서 만들 것

//창을 띄우는 클래스
class Win extends Frame { //일단 , awt에서 구현
	//생성자
	public Win() {
		//윈도우창의 크기를 가로 300, 세로 400 픽셀단위
		setSize(300, 400);
		
		//윈도우창을 화면에 보이기
		setVisible(true); //default값이 false임.
		
		Exit exit = new Exit();
		
		//컴포넌트.연결메소드(이벤트리스너);
		this.addWindowListener(exit); //컴포넌트와 이벤트를 연결해주는 메소드
		
	} //end Win()///////
	
	//frame이 window를 상속함
	
	//내부클래스
	class Exit implements WindowListener {
		
		//메소드 오버라이드
		//굳이 오버라이드를 다 해줘야 하는데.. API에서는 WindowListener를 상속받아서 구현해놓은 놓은 Adopter를 제공하고 있다. -> 다음 파일
		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0); //시스템종료
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	} //end Exit class
	
} //end win class

//실행 클래스
public class Java207_gui {

	public static void main(String[] args) {
		new Win();

	} //end main()

} //end class
