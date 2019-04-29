package java0429_static_access.part02;
/*
 * claass 클래스명 {
 * 	멤버변수;
 * 	static {}
 *  생성자(){}
 *  메소드(){}
 *  내부클래스
 * } 
 */
public class OrderStatic {
	static { //static블록
		System.out.println("static");
	}
	
	public OrderStatic() {
		System.out.println("constructor");
	}
	public void prn() {
		System.out.println("prn");
		
	}
} //end class
