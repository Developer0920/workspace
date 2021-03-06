package java0419_statement;
/*
 * 1. data변수에 저장된 값이 영문자 대문자이면 "?는 대문자입니다",
 * 		소문자이면 "?는 소문자입니다."
 * 		그외는 "?는 기타입니다"로 출력하는 프로그램을 구현하시오.
 * 2. [출력결과]
 * 		data='D' => D는 대문자입니다.
 * 		data='d' => d는 소문자입니다.
 * 		data='1' => 1은 기타입니다.
 */
public class Java021_if {

	public static void main(String[] args) {
		char data = 'd';
		
		// 'A' <= data <= 'Z' --- 수학에서 쓰임
		// 'A' => 유니코드 65	('Z' => 90?)
		// 'a' => 유니코드 97  (대소문자 차이 32) (알파벳 갯수 : 26개)
		// '0' => 유니코드 48
		// System.out.println((int)'A');
		
		if(data>='A' && data <= 'Z') { //character(문자)는 연산자와 사용되면, 자바가 알아서 유니코드로 바꿔서 처리함.
			System.out.printf("%c는 대문자입니다.", data);
		} else if(data>='a' && data <= 'z') {
			System.out.printf("%c는 소문자입니다.", data);
		} else {
			System.out.printf("%c는 기타입니다.", data);
		}
			
	} // end main()
} // end class
