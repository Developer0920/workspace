package java0527_jdbc;

import java.util.List;
import java.util.Scanner;

/*
 * 검색 부서명을 입력 : der
 */

/*
 * 데이터를 받아온다. : 스캐너 이용
 * 
 */
public class Java202_jdbc {

	public static void main(String[] args) {
		DepartmentDAO dao = DepartmentDAO.getInstance();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색 부서명을 입력: ");
		String data = sc.nextLine();
		List<DepartmentDTO> aList = dao.searchMethod(data);
		for(DepartmentDTO dto : aList)
			System.out.printf("%d %s %d %d\n",
				dto.getDepartment_id(),
				dto.getDepartment_name(),
				dto.getManager_id(),
				dto.getLocation_id());
		
	} //end main()

} //end class
