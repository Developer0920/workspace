package java0418_basic;

public class java007_operator {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		System.out.println(a+b); //산술연산자
		System.out.println(a + "는(은) 삼입니다.");//문자열 연결의 의미
		System.out.println("a=" + a); //문자열 연결로 사용
		
		//'결과값:7' 을 출력하고 싶을 때 --- '컴퓨터는 나의 노예다.'
		System.out.println("결과:"+a+b); // 결과:34
		System.out.println("결과:"+(a+b)); // 결과:7
				
	} //end main()
} // end class
