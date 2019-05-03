package java0503_api;
/*
 * 클래스에서 static키워드가 선언된 멤버변수, 메소드를 호출할 때
 * import static을 선언하면 클래스명 없이 바로 멤버변수,
 * 메소드를 호출할 수 있다.
 */

import static java.lang.Math.E; //이렇게 하면 클래스없이 바로 호출할 수 있다.
import static java.lang.Math.sqrt; //특정메소드 하나만
import static java.lang.Math.*;

public class Java130_Math {

	public static void main(String[] args) {
		//수학관련 클래스 java.lang.Math
		System.out.println(Math.PI); //원주율
		System.out.println(Math.max(10, 20));//최대값
		System.out.println(Math.min(10, 20)); //최소값
		System.out.println(E); //상수e. 이렇게 하면 클래스없이 바로 호출할 수 있다.
		System.out.println(sqrt(25));
		System.out.println(pow(2,3));
				
	} //end main()

} //end class
