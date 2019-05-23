package java0523_inner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

/*
 * GUI에서 이벤트처리할 때 사용했었음. 이젠 별로 중요하지 않았는데.. 안드로이드가 나오면서.. 안드로이드에서 많이 사용함.
 * 
 * class 클래스명{
 *   멤버변수;
 *   static{ }
 *   생성자
 *   메소드;
 *   내부클래스;
 * }
 * 
 * 내부클래스
 * 1 클래스 안에 정의된 클래스이다.
 * 2 특정 클래스 내에서만 주로 사용되는 클래스이다.
 * 3 외부클래스의 private으로 선언된 멤버변수를 직접적으로 접근해서 처리할 수 있다.
 * 
 * 내부클래스 종류
 * 1 인스턴스 클래스 :외부클래스의 멤버변수 선언위치에 선언하며, 외부클래스의
 *    인스턴스 멤버처럼 다루어진다. 주로 외부 클래스의 인스턴스 멤버들과
 *    관련된 작업에 사용될 목적으로 선언된다.
 * 2 스태틱 클래스 : 외부클래스의 멤버변수 선언위치에 선언하며, 외부클래스의
 *   static멤버처럼 다루어진다.
 *   주로 외부클래스의 static멤버, 특히 static메서드에서 사용될
 *   목적으로 선언된다.
 * 3 지역클래스 : 외부 클래스의 메서드나 초기화블럭 안에 선언하며,
 *   선언된 영역 내부에서만 사용될 수 있다.
 * 4 익명클래스 : 클래스의 선언과 객체의 생성을 동시에 하는 이름없는 클래스이다.
 *   
 */ 

class OuterInstance {
	//멤버변수
	private int num;
	private int data;
	
	//메소드
	public void display() {
		System.out.println("display");		
	} //end display()
	
	//내부클래스
	class InnerInstance{
		public void run() {
			num=10;
			System.out.println(num);			
		}
	} //end InnerInstance	
} //end OuterInstance


public class Java195_inner {

	public static void main(String[] args) {
		//inner class 사용방법
		OuterInstance outer = new OuterInstance(); //OuterInstance 객체를 생성
		outer.display();
		
		OuterInstance.InnerInstance inner = outer.new InnerInstance(); //생성자 호출
		//inner 클래스도 클래스이기 때문에 new해서 객체생성을 해야 한다.
		
		inner.run();
		
		
	} //end main()

} //end class

//이너클래스를 사용하는 이유는.. private 멤버변수를 사용하기 위함이다.