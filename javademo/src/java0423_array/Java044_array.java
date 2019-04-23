package java0423_array;
/*
 * [출력결과]
 * 짝수 : 42
 * 홀수 :3
 */

public class Java044_array {

	public static void main(String[] args) {
		int[] num = new int[] {22, 3, 8, 12};
		int even = 0; //짝수
		int odd = 0; //홀수
		
		for(int index=0; index<num.length; index++) {
			if(num[index]%2==0) {
				
				even = even + num[index];				
			} else {
				odd = odd + num[index]; //odd += num[i];
			}
		}		
		
		System.out.printf("짝수: %d\n", even);
		System.out.printf("홀수: %d\n", odd);

	}// end main()

}// end class
