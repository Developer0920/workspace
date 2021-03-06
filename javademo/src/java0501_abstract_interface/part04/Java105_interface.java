package java0501_abstract_interface.part04;

/*
 * 인터페이스(interface)
 * 1 추상메소드와 상수를 가지고 있는 형태이다.
 * 2 클래스 작성에 도움을 주기 위한 목적으로 제공이 되는 표준명세서이다.
 * 3 implements : 클래스에 인터페이스를 상속할 때 사용되는 키워드이다.
 * 4 인터페이스는 접근제어자로 public만 제공한다.
 * 5 인터페이스의 추상메소드에 abstract키워드를 명시하지 않아도 된다.
 *   자바가상머신에서 자동으로 처리하기 때문에...
 * 6 (시험)모든 인터페이스의 메소드는 묵시적으로 'public abstract' 이다.
 * 7 (시험)필드는 묵시적으로 'public static final' 이다.
 * 8 (시험)객체 생성은 하지 못하지만, 참조형 타입으로서는 사용 가능하다.(뒤에서 바인딩할 때)
 * 
 * 인터페이스의 메소드는 전부 추상메소드. 따라서 abstract를 따로 안 붙임
 * 인터페이스에서는 멤버변수로서 상수만 제공된다. 그리고 'public static final'
 *
 *			class			interface
 *멤버변수		O				상수(무조건 초기화시켜야)
 *메소드		선언부+구현부		선언부(추.메.)
 *생성자		O				X
 *초기화블록	O				X
 *내부클래스	O				O
 *
 *extends : 클래스에 클래스를 상속(단일상속), 인터페이스에 인터페이스 상속(다중상속 but 구현이라고 봐야)
 *implements : 클래스에 인터페이스 상속(다중상속)
 *
 *추상클래스는 구현부까지 있는 완전한 메소드를 가질 수 있음.
 *
 *추상클래스와 인터페이스 차이점(시험)
 *1 추상클래스는 단일 상속만 가능하지만 인터페이스는 다중 상속이 가능하다.
 *2 추상클래스는 구현 시에는 extends 키워드를 사용하지만, 인터페이스 구현 시에는 implements 키워드를 상ㅇ
 *3 추상클래스는 abstract메소드가 0개 이상 존재하지만, 인터페이스는 모든 메소드가 abstract이다.
 *4 추상클래스는 명시적으로 abstract를 사용해야 하지만, 인터페이스는 묵시적으로 abstract이다.
 *5 추상클래스는 일반 필드를 가질 수 있지만, 인터페이스는 상수필드만 가질 수 있다.
 *
 *
 *
 */

public class Java105_interface {

	public static void main(String[] args) {
		//CarRun cn = new CarRun; //인터페이스틑 객체생성 불가능
		System.out.println(CarRun.carCount); //static이므로 클래스로 바로 접근가능
		
		TruckRun tr = new TruckRun();
		tr.prn();		
		
	} //end main()

} //end class

//서로 성질이 다른 객체를 연결할 때 인터페이스를 활용
//클래스에 인터페이스를 여러 개 상속할 수 있음(다중상속이 가능)
