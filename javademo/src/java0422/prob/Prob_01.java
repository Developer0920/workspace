package java0422.prob;

/*
for문을 이용해서 12의 약수를 구하시오
약수 : 어떤 수를 나누어서 0으로 떨어진 수
[출력결과]
1
2 
3 
4 
6 
12
*/

public class Prob_01 {

	public static void main(String[] args) {
		int num = 12;
		int div;
		
		for(div=1; div<=12; div++) {
			if(12%div==0) {
			System.out.println(div);
			}
		}
		
		
		/*사고과정
		 * 약수란... 나눠서 떨어지는 수 
		 * 1부터 키워가면서...
		 */

	}//end main()

}//end class













