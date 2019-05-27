package java0527_jdbc;

import java.util.List;

public class Java203_jdbc {

	public static void main(String[] args) {
		MemDAO dao = MemDAO.getInstance();
		MemDTO md = new MemDTO("야옹이", 40, "북경");
		int cnt = dao.insertMethod(md);
		System.out.printf("%d개 삽입\n", cnt);
		
		
		List<MemDTO> aList = dao.listMethod();
		for (MemDTO dto : aList)
			System.out.printf("%d %s %d %s\n",
					dto.getNum(),
					dto.getName(),
					dto.getAge(),
					dto.getLoc());		
			
	} //end main()

} //end class
