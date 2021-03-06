package java0418_basic;

/*
 * 연산자(operator)
 *  : 어떠한 기능을 수행하는 기호(+, -, *, /, %, >, <, ==(같다), !=(다르다)...)
 * 
 * 피연산자(operand)
 *  : 연산자의 작업 대상(변수, 상수, 리터럴, 수식)
 *  
 *  연산자 종류
 *  1 산술연산자 : +, -, *, /, %
 *  2 비교연산자 : >, <, >=, <=, ==, !=
 *  3 논리연산자 : &&(and), ||(or), !(not)
 *  4 삼항연산자(조건연산자) : 조건식 ? 참 : 거짓
 *  5 대입연산자 : =, +=, -=, *=, /=...
 *  6 단항연산자 : ++(1씩 증가), --(1씩 감소)
 *  
 *  쉬프트연산자, 비트연사자도 있으나 임베디드나 암호처리에서 사용
 */
public class Java005_operator {

	public static void main(String[] args) {

		int numX = 10; // numX변수에 값10을 저장(할당)한다.
		int numY = 5; // numY변수에 값5를 저장한다.

		int res = numX + numY; // int = int + int 이므로.. 연산의 결과값의 타입은..

		System.out.println(res);

		double avg = 4.5;
		double ko = numX + avg;

		System.out.println(ko);

		/*
		 * float = int + float
		 * int = byte + int
		 * float = long + float
		 */

		// 예외 : int데이터 타입 이하끼리 연산이 되면 결과값의 데이터 타입은 무조건 int이다.
		short a = 3;
		short b = 4;
		/*
		 * int=byte+short
		 * int=char+short
		 * int=byte+int
		 * int=byte+byte
		 * int=short+short
		 */
		int c = a + b;

		System.out.println(c);

	}// end main()
}// end class
