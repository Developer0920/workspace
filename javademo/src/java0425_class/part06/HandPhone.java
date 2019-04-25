package java0425_class.part06;

public class HandPhone {
	// 멤버변수
	String name;
	String number;
	
	
	
	//생성자1	
	HandPhone() { //기본 제공자는 class와 동일하게 접근제어자 public
	
	}	
	
	//생성자2
	HandPhone(String ne, String nb){ //직접 정의 시 접근제어자 내맘대로 
		name=ne;
		number=nb;
	}
	//생성자가 정의가 돼 있으면 기본 생성자 제공 안 한다.		
	
	
	//메소드
	
	void prn() {
		System.out.printf("%s %s\n",  name, number);
	}
	
}
//생성자의 목적은 멤버변수에 초기값을 할당하기 위한 것
//단, 인자값이 없는 생성자의 경우, 기본값이 멤버변수에 할당됨.

//생성자는 두 개 이상 정의 가능
//기본 생성자 제공될 때는 클래스의 접근제어자로 설정을 JVM이 해줌
//직접 생성자 정의 시 접근제어자 설정 여부는 개발자 마음
//자바가 알아서 적당한 생성자를 찾는다!!!

//생성자도 엄연히 하나의 메소드. 멤버변수의 값을 초기화 하기 위한.

//클래스의 멤버변수의 구분을 위해 this.