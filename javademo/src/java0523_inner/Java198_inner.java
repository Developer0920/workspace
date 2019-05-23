package java0523_inner;
//익명클래스
//딱 한 번 사용코자 하는 경우 익명클래스를 정의해서 사용할 수 있다.
//추상클래스와 인터페이스는 객체를 생성할 수 없으나, 메모리 참조는 가능

abstract class InnerAnonymous {
	abstract void prn();
} //end InnerAnonymous

//위 추상클래스의 자원을 사용하기 위해...
class Test extends InnerAnonymous {
	@Override
	void prn() {
		System.out.println(10);
	}
} //end Test

class OuterAnonymous {
	private int x;
	public void call() {
		/*
		InnerAnonymous tt = new InnerAnonymous() { //여기서 딱 한 번 사용할 목적으로 정의를 한 것. 별도의 클래스명이 없다. prn()을 사용하기 위해.
			//이렇게 참조하는 건, 추상클래스, 인터페이스도 올 수 있음.
			@Override
			void prn() {				
				System.out.println("prn");
			}
			
		};
		tt.prn();
		*/
		
		//위에 걸 한 번에 하는 방법
		new InnerAnonymous() { 
			@Override
			void prn() {				
				System.out.println("prn");
			}
			
		}.prn();
		
		
	} //end call() /////////////////
} //end OuterAnonymous //////////////////

public class Java198_inner {

	public static void main(String[] args) {
	OuterAnonymous oa = new OuterAnonymous();
	oa.call();

	} //end main()

} //end class
