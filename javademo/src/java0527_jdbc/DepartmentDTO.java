package java0527_jdbc;

//VO(Variable Object) : 초창기 명칭
//DTO(Data Transfer Object) : 데이터 관리 객체
//테이블에 데이터를 입력해야 하고 가져와야 함. 그 데이터를 넣어주는 게 DTO. 특정 테이블에 대한 값을 변수로 선언해 주면 된다. 뭐.. 해보면 안다.

public class DepartmentDTO {
	//멤버변수
	private int department_id; //테이블의 컬럼명와 변수를 같게 해야 한다. 반드시. 그래야 프레임워크에서 오토매핑을 할 수 있음.
								//그렇더라도.. 오바해서 대문자까지로 하진 마라. 자바 규칙에 따를 것!
	private String department_name;
	private int manager_id;
	private int location_id;
	//캡슐화 규칙에 따라서 private으로 접근제어자 설멍
	
	//생성자
	public DepartmentDTO() {
		
	}

	//게터, 세터
	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public int getManager_id() {
		return manager_id;
	}

	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	

} //end class