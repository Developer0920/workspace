package java0528_gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import java0527_jdbc.EmpDAO;
import java0527_jdbc.EmpDTO;

class DesignTest extends JFrame implements ActionListener{
	JTextField inputTxt;
	JButton searchBtn;
	JTable table;
	DefaultTableModel model;	
	
	public DesignTest() {
		inputTxt = new JTextField(20);
		searchBtn = new JButton("검색");
		
		JPanel jp = new JPanel();
		jp.add(inputTxt);
		jp.add(searchBtn);
		
		//테이블 헤드
		Object[] obj = {"사원번호", "사원명", "급여", "입사일"};
		model = new DefaultTableModel(obj, 0);
		table = new JTable(model);	
		
		//라인의 높이
		table.setRowHeight(20);
		
		//컬럼이동 불가능
		table.getTableHeader().setReorderingAllowed(false);
			
		add(BorderLayout.NORTH, jp);
		add(BorderLayout.CENTER, new JScrollPane(table));
		
		searchBtn.addActionListener(this);
		
		setSize(500, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	} //end DesignTest() /////////////////

	@Override
	public void actionPerformed(ActionEvent e) {
		EmpDAO dao = EmpDAO.getInstance(); //싱글톤
		List<EmpDTO> aList = dao.searchMethod(inputTxt.getText());
		
		//"검색결과가 없습니다."
		if(aList.size()==0) {
	        JOptionPane.showMessageDialog(this, "검색결과가 없습니다.");
	    }
		
		//테이블 초기화
		model.setRowCount(0);
				
		for(EmpDTO dto : aList) {
			Object[] line = new Object[4];
			line[0] = dto.getClass();
			line[1] = dto.getFirst_name();
			line[2] = dto.getSalary();
			line[3] = dto.getHire_date();
			model.addRow(line); //EmpDAO 코드수정하기
		}
		
		//inputTxt.setText("");
		inputTxt.requestFocus();
		inputTxt.select(0, inputTxt.getText().length()); //영역이 선택되게 하기
		
	} // end actionPerformed()//////////////
} //end DesignTest() ///////////////




public class Java216_gui {

	public static void main(String[] args) {
		new DesignTest();

	} //end main()

} //end class
