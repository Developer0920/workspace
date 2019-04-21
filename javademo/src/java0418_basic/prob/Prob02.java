package java0418_basic.prob;

/*
 * data변수의 값이 대문자 이면 'A', 소문자이면 'a'을 
 * 출력하는 프로그램을 구현하시오.
 * [실행결과]
 * a
 */
public class Prob02 {

	public static void main(String[] args) {
		char data = 'B';
		
		//여기에 작성하시오.
		//'A'<= data <='Z'
		
		/*char upperLower;
		upperLower = Character.isUpperCase(data)==true ? 'A' : 'a';
		System.out.println(upperLower);
		*/
		
		char ul;
		ul = data >= 'A' && data <='Z' ? 'A' : 'a';
		System.out.println(ul);
		
		/* 사고과정
		 * 
		 */
		
     
	}// end main()

}// end class
