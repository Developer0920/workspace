package java0527_jdbc;

import java.util.HashMap;
import java.util.List;

public class Java205_jdbc {

	public static void main(String[] args) {
	      
	      EmpDAO dao = EmpDAO.getInstance();
	      
	      HashMap<String, Integer> map = new HashMap<String, Integer>();
	      map.put("start", new Integer(31));
	      map.put("end", new Integer(35));
	      List<EmpDTO> aList = dao.rangeMethod(map);
	      
	      for(EmpDTO dto:aList) {
	         System.out.printf("%d %s %d %s\n",
	               dto.getEmployee_id(),
	               dto.getFirst_name(),
	               dto.getSalary(),
	               dto.getHire_date());
	      }
	   } //end main()

} //end class
