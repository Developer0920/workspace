package java0423_array;

/*
 * num배열에 저장된 요소의 합계를 구하는 프로그램을 구현하시요.
 * 
 * [출력결과]
 * 합계 : 45
 */

public class Java043_array {

	public static void main(String[] args) {
		int[] num = new int[] {22, 3, 8, 12};
		int sum = 0;
		
		for(int index=0; index<num.length; index++) {
			sum = sum + num[index];
		} 		
		System.out.printf("합계 : %d",  sum);

	}// end main()

}// end class
