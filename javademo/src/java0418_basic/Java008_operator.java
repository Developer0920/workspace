package java0418_basic;

public class Java008_operator {
	public static void main(String[] args) {
		
		//증감연산자
		
		int x=3;
		//증가연산자 : 변수의 값을 1증가시켜라.
		++x; //x=x+1 이런 의미 but, 내부에서 처리방식은 다르다. 앞뒤순서 상관없음(하나의 문장에서 항이 하나인 경우)
		System.out.println("x=" + x);
		
		
		int y=5;
		//감소연산자 : 변수의 값을 1감소
		--y;
		System.out.println("y=" + y);
		
		
		/* ※증감연산자 주의사항
		 * 리터럴에 쓸 수 없음
		 * 상수에 쓸 수 없음
		 */
		
		final int NUM = 4; //상수 만들기 : 상수명은 대문자로!
		System.out.println("NUM=" + NUM);
		
		//++NUM;
		//상수는 값을 변경할 수 없다. 따라서 증감연산자를 사용할 수 없다.
		//상수 : 한 번만 기억(저장)할 수 있는 메모리 공간
				
	}// end main()	
} // end class
