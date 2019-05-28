package java0528_gui;

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//JButton -> click -> ActionEvent -> ActionListener -> addActionListener()
//JTxetField -> enter -> ActionEvent -> ActionListener -> addActionListener()

class TextInput2 extends JFrame implements ActionListener{
	//멤버변수
	JTextField inputTxt;
	JButton clickBtn;
	JTextArea multiTra;
	JPanel pn;
	
	
	//생성자
	public TextInput2() {
		inputTxt = new JTextField(10);
		clickBtn = new JButton("input");
		
		pn = new JPanel();
		pn.add(inputTxt);
		pn.add(clickBtn);
		
		multiTra = new JTextArea(10, 10);
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



public class Java214_gui {

	public static void main(String[] args) {
		new TextInput2();

	} //end main()

} //end class
