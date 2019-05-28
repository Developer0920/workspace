package java0528_gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class UserLayout extends Frame {
	Button northBtn, centerBtn, southBtn, eastBtn, westBtn;
	
	public UserLayout() {
		
		northBtn = new Button("North");
		centerBtn = new Button("Center");
		southBtn = new Button("South");
		eastBtn = new Button("East");
		westBtn = new Button("West");
		
		setLayout(new GridLayout(2,3)); //2행, 3열
		this.add(northBtn);
		this.add(centerBtn);
		this.add(southBtn);
		this.add(eastBtn);
		this.add(westBtn);
		
		
		setSize(500, 400);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	} //end UserLayout()//////////
	
} //end class

public class Java212_gui {

	public static void main(String[] args) {
		new UserLayout();

	} //end main()

} //end class
