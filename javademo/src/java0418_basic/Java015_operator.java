package java0418_basic;

/*
 * 연산자 우선순위
 * 단항연산자(++, --, !)(단, 전위일 때로 한정) > 산술 > 비교 > 논리> 삼항 > 대입
 */

public class Java015_operator {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 3;
		int c = 5;
		
		int res = a>b && a==b ? a+b : a-b;
		
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("res=" + res);
		
		
		
	}// end main()

}// end class
