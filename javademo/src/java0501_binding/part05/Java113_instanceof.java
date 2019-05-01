package java0501_binding.part05;




/*
 * instanceof : 객체를 비교하기 위한 비교연산자이다.
 * a instanceof A
 * 	: a객체가 A타입이면 true, 아니면 false 리턴한다.
 */

class ExamA {
	void prn() {
		
	}
} //end ExamA

class ExamB extends ExamA {
	void prn() {
		
	}
} //end ExamB

class ExamC extends ExamB {
	
} //end ExamC

public class Java113_instanceof {

	public static void main(String[] args) {
		// 객체 instanceof 비교 데이터타입과 같거나 조상 데이터타입
		ExamB bb = new ExamB();
		System.out.println(bb instanceof ExamA); //true
		
		ExamA aa = new ExamA();
		System.out.println(aa instanceof ExamB); //false
		
		ExamA ea/*home TV에 해당*/ = new ExamB();
		System.out.println(ea instanceof ExamA); //true
		System.out.println(ea instanceof ExamB); //true
		System.out.println(ea instanceof ExamC); //false
		
		/*
		 * ExamA aa = new ExamA();
		 * ExamB bb = new ExamB();
		 * ExamC cc = new ExamC();
		 * aa=bb; //업캐스팅
		 * aa=cc; //업캐스팅
		 * aa 다형성
		 * aa.prn(); //동적바인딩
		 * ExamB ba=(ExamB)aa; //다운캐스팅
		 * ExamC ca=(ExamC)aa; //다운캐스팅
		 * 
		 */
		
		
	} //end main()
} //end class

