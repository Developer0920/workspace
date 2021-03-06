package java0426_class.part08;
//5.0부터 추가됨
/* variable argument(가변매개변수)
 * 1 5.0이전 버전에서는 특정 메소드를 정의할 때 인자의 타입과 수를 정해놓고 호출할때 일치하지 않으면 오류가 발생했음
 * 2 이를 유연하게 처리할 수 있도록 variable argument 기능을 제공해주고 있다.
 * 3 리턴타입 메소드명(데이터타입...매개변수){ }
 * 
 * 인자  = 매개변수 = parameter = argument
 * 
 * 
 * 
 * 
 */

public class Java080_varg {

	public static void main(String[] args) {
		CountVarg cv=new CountVarg();
		cv.addValue(4, 8);
		cv.addValue(2,3,9);
		cv.addValue(1,5,2,4,6);
		cv.sumValue("홍길동", 70, 80, 65);
		cv.sumValue("길동무", 90, 70);
		
	} //end main()

} //end class
