package java0425_class.part01;

//import java0425_class.part01.Person; //Person 뒤에 커서를 두고  Ctrl + Space

public class Java065_class {
	
	
	
	public static void main(String[] args) {
		Person ps; //객체선언 - 메모리 생성이 안됨(stack 영영게 4byte는 잡힘)
		ps = new Person(); //객체생성 - 메모리 생성이 됨  ?이 상황에서 method도 method영역에서 메모리를 잡나?  ?메소드의 메모리 크기를 어떻게 시스템이 가늠하지?
		
		System.out.println(ps); //
		System.out.println(ps.name); //초기화가 안 됐으므로 default값이 주어짐. String은 클래스, 클래스는 참조 데이터 타입, 모든 참조 데이터 타입의 기본값은 null
		System.out.println(ps.age);
		
		
		//객체참조변수.멤버변수
		ps.name = "홍길동";
		ps.age = 30;
		ps.gen = 'M';
		System.out.printf("%s %d %c\n", ps.name, ps.age, ps.gen);
		//객체참조변수.메소드
		ps.eat();
		ps.run();
		
		
		//객체 선언 및 생성
		Person pn = new Person();
		pn.name = "이영희";
		pn.age = 25;
		pn.gen = 'F';
		System.out.printf("%s %d %c\n", pn.name, pn.age, pn.gen);
		
		//객체참조변수.메소드
		pn.eat();
		pn.run();
		
	}

}
//클래스의 메소드는 heap영역에 생성이 안 되고, method영역에 생성이 됨.
//실행클래스와 라이브러리 클래스가 있음
//실행클래스는 메인메소드를 포함하는 것
//원래 이 둘을 나눠서 파일을 생성해야 함