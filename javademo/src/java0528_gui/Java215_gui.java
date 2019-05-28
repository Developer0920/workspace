package java0528_gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class MessageTest extends JFrame implements ActionListener{
	JButton btn;
	public MessageTest() {
		btn=new JButton("run");
		add(btn);
				
		
		setSize(300, 300);
		setVisible(true);
		
		btn.addActionListener(this);
		
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료버튼을 작동시킴. awt보다 간편
		//setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //현재 창을 메모리에서 제거
		//setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); //아무 것도 설정하지 않았을 때와 동일.
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); //awt와 동일한 설정. 아무 것도 안 함.
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				close();
			}
		});
		
	} //end MessageTest() //////////////
	
	public void close() {
		//알림창을 띄우기 위해서 JOptionPane을 사용한다.
		//YES:0, NO:1
		int chk = JOptionPane.showConfirmDialog(this, "종료하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
		if(chk==JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	} //end close;
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		message("안녕하세요!");
		
	} //end actionPerformed
	
	public void message(String msg) {
		JOptionPane.showMessageDialog(this, msg);
		
		
		
		
	} //end message()//////
	
} //end MessageTest


public class Java215_gui {

	public static void main(String[] args) {		
		new MessageTest();
	} //end main()

} //end class
