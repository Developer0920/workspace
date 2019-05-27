package java0527_jdbc;

import java.util.HashMap;
import java.util.List;

public class Java204_jdbc {

	public static void main(String[] args) {
		MemberDAO dao = MemberDAO.getInstance();		
		HashMap<String, Object> map = new HashMap<String, Object>();
		//데이터가 많은 때는 dto에 담아서 넘기면 된다. 여기선 hashMap을 사용함.
		/*map.put("name",  new String("윤아"));
		map.put("num", new Integer(1));
		dao.updateMethod(map);
		*/
		
		dao.deleteMethod(2);
		
		
		List<MemDTO> aList = dao.listMethod();
		for (MemDTO dto : aList)
			System.out.printf("%d %s %d %s\n",
					dto.getNum(),
					dto.getName(),
					dto.getAge(),
					dto.getLoc());		

	}//end main()

} //end class
