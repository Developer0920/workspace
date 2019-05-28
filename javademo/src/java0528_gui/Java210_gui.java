package java0528_gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FlowLayoutTest extends Frame {
	Button oneBtn, twoBtn, threeBtn;
	Panel pn;
	TextArea ta;
	
	
	public FlowLayoutTest() {
		
		oneBtn = new Button("one");
		twoBtn = new Button("two");
		threeBtn = new Button("three");
		
		//버튼을 하나만 넣을 수 있음. 따라서 패널이란 컴포넌트를 생성해서 세 개를 그룹으로 만들어서 넣으면 된다.
		//패널은 여러 컴포넌트를 그룹화할 때 사용.
		
		// Panel의 기본 레이아웃은 FlowLayout이다.
		// FlowLayout에 컴포넌트를 연결할 때는 add해준 순서대로 왼쪽에서 오른쪽으로 연결된다.
				
		pn = new Panel();
		pn.add(oneBtn);
		pn.add(twoBtn);
		pn.add(threeBtn);
		
		ta = new TextArea(10, 20);		
		
		add(BorderLayout.NORTH, pn);
		add(BorderLayout.CENTER, ta);
		
		setSize(500, 400);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	} //end FlowLayoutTest() ////////////////
	
} //end class //////////////////




public class Java210_gui {

	public static void main(String[] args) {
		
		new FlowLayoutTest();

	} //end main()

} //end class
