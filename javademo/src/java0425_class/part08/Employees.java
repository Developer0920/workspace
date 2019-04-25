package java0425_class.part08;

public class Employees {
	String name;
	String dept;
	int salary;
	
	public Employees() {
		this("홍길동","보류",3000); //this가 생성자를 호출하는 거다.
	}
	
	public Employees(String name, String dept, int salary) {
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		
		//시스템에 정해 놓은 거 말고 우리가 지정한 기본값을 할당하고 싶을 때		
	
	}
	public void prn() {
		System.out.printf("%s %s %d\n", name, dept, salary);
	}
}//end class
//클래스 내에서 정의할 수 있는 것  : 멤버변수, 생성자, 메소드 + 2개 더
