package java0501_abstract_interface.part04;

public interface CarRun {
	int carCount=5; //초기값을 할당하지 않으면 오류가 뜸. 기본값이 제공되지 않음. // 'public static final' int carCount = 5
	//public CarRun() {} //인터페이스는 생성자를 갖지 않음
	//static {System.out.println("test");} //초기화블록을 가질 수 없음
	void prn(); //자바에서 제공하는 인터페이스의 모든 접근자는 public. 접근제어자가 없다고 해서 default가 아니다. //public abstract
	//void display() {} //구현부를 가질 수 없음. 중괄호만 있어도 구현부로 취급
	//멤버변수를 필드라고 함.
	//초기화 블록이 static블록임
	class sun{} //인터페이스는 내부클래스를 가질 수 있음 //접.제 없으면 public임
	
	
} //end class
