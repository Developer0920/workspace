package java0423_array.prob;
/*
 * 4행 4열 data배열에 가로 세로 합계를 구하는 프로그램을 구현하시오.
 *  
 * [출력결과]
 *  1   2   3   6
 *  4   5   6  15
 *  7   8   9  24
 * 12  15  18  45
 */

public class Prob_02 {

	public static void main(String[] args) {
		int[][] data = new int[4][4];
		int cnt = 1;		
		
		// 여기를 구현하시오.
		int rTotal = 0;
		int cTotal = 0;
		
		for (int row=0; row<data.length-1; row++) {
			rTotal = 0;
			for (int col=0; col< data[row].length; col++) {
				if(col==3) {
					System.out.printf("%4d", rTotal);
				} else {	
					data[row][col] = cnt;
					rTotal = rTotal + cnt;
					cnt++;
					
					System.out.printf("%4d", data[row][col]);					
				} 
			}
			System.out.printf("\n");
			
		}
		/*
		data[3][0] = data[0][0] + data[1][0] + data[2][0];
		data[3][1] = data[0][] + 
		*/
		
		
		//data[i][j] {
			
		
		for (int i=0; i< 4; i++) {
			cTotal = 0;
			int j;
			for (j= 0; j<3; j++) {
				cTotal = cTotal + data[j][i];				
			}
			data[j][i] = cTotal;
			System.out.printf("%4d", cTotal);
		}
		
		
	}// end main()
	/*사고과정
	 * 4행이나 4열이 아닌 경우, 하나씩 증가
	 * 4열인 경우, 왼쪽꺼 합계
	 * 4행인 경우, 위쪽꺼 합계
	 */
	
}// end class


