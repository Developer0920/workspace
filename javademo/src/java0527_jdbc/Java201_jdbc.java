package java0527_jdbc;

import java.util.List;

/*
 * MVC패턴 : 컴퓨터 소트프웨어 개발의 구조적 패턴
 * Model : 데이터에 관련된 작언(DepartmentDTO, DepartmentDAO)
 * View : 클라이언트에 보여줄 화면(Java201)_Jdbc)
 * Controller : 요청, 응답처리(Java_Jdbc)
 */
public class Java201_jdbc {

	public static void main(String[] args) {
		DepartmentDAO dao = DepartmentDAO.getInstance(); //아.. 싱글톤이구나!
		List<DepartmentDTO> aList = dao.listMethod();
		for(int i=0; i<aList.size(); i++) {
			DepartmentDTO dto = aList.get(i); //타임을 DTO로 잡아야 한다.
			System.out.printf("%d %s %d %d\n",
					dto.getDepartment_id(),
					dto.getDepartment_name(),
					dto.getManager_id(),
					dto.getLocation_id());
		}
		
	} //end main()

} //end class 지렸다....

//전체적인 흐름을 잡을 것!
