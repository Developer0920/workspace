package java0424_method;
//메소드 정의의 위치는 아무 상관 없다.

/*
 * [출력결과]
 * 홍길동님은 회원입니다.
 * 3000포인트가 적립되었습니다.
 */
public class Java053_method {
	public static void test(int point) { //8		
		System.out.println(point+"포인트가 적립되었습니다."); //9
	}// end test() //10
	
	public static void process(String name, boolean chk) {//3
		if(chk) { //4
			System.out.println(name+"님은 회원입니다."); //5			
		}else {
			System.out.println(name+"님은 회원입니다.");
		}		
	}// end process()//6
	
	public static void main(String[] args) { //1
		//매개변수가 선언된 메소드를 호출할 때 매개변수에 정의된
		//데이터 타입과 일치하는 값을 넘겨줘야 한다.
		process("홍길동", true); //2
		test(3000); //7
		
	}// end main() //11

}// end class
