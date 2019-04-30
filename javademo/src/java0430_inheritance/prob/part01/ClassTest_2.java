package java0430_inheritance.prob.part01;

public class ClassTest_2 extends ClassTest_1{
	//멤버변수
	String department;
	
	//생성자
	public ClassTest_2(String name, int salary, String department){
		super(name, salary); //수퍼클래스 생성자 호출
		this.department = department;		
		
	}
	
	//메소드
	@Override
	public void getInformation() {
		System.out.println("이름:" + getName() + " 연봉:" + getSalary() + " 부서:" + department);
	}
	@Override
	public void prn() {
		System.out.println("서브클래스");
	}
	public void callSuperThis() {
		super.prn();
		prn();
	}
}
