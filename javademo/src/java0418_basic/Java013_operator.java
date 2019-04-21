package java0418_basic;

/*
 * 삼항연산자(조건연산자) : 식의 결과에 따라서 리턴해주는 값이 여러 개일 떄 사용한다.
 * 식 ? 참 : 거짓
 * int res = true ? 1 : 0;
 * char res = false ? 'a' : 'A';
 * 
 */
public class Java013_operator {

	public static void main(String[] args) {
		int total = 22;
		int record = 5;
		
		// total%record==0결과가 true이면 total/record값을 리턴한다.
		// total%record==0결과가 false이면 total/record+1값을 리턴한다.
		
		int res = total%record==0 ? total/record : total/record+1;
		
		System.out.println(res);
		

	}// end main()

}// end class
