package java0528_gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class TextInput extends Frame implements ActionListener{
	//멤버변수
	TextField inputTxt;
	Button clickBtn;
	TextArea multiTra;
	Panel pn;
	
	
	//생성자
	public TextInput() {
		inputTxt = new TextField(20);
		clickBtn = new Button("input");
		
		pn = new Panel();
		pn.add(inputTxt);
		pn.add(clickBtn);
		
		multiTra = new TextArea(10, 10);
		multiTra.setEditable(false);
		//TextArea에서 편집 불가능
		
		add(pn, BorderLayout.NORTH);
		add(multiTra, BorderLayout.CENTER);
		
		//clickBtn에 ActionListener를 연결
		clickBtn.addActionListener(this);
		inputTxt.addActionListener(this); //엔터키 적용
		
		setSize(300, 200);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});		
		
	} // end TextInput


	@Override
	public void actionPerformed(ActionEvent e) {
		String line = inputTxt.getText();
		//TextArea에 TextField에 입력된 문자열을 추가한다.
		multiTra.append(line + "\n");
		
		//초기화작업 //TextField를 초기화한다.
		inputTxt.setText("");
		
		//TextField로 포커스를 이동한다.
		inputTxt.requestFocus();
		
		
	} //end actionPereformed()
} //end class


public class Java213_gui {

	public static void main(String[] args) {		
		new TextInput();
	} //end main()

} //end class
