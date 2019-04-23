package java0423_array;
/*
 * 1	2	3	4	5
 * ...
 * 16	17	18	19	20
 * 
 * num배열에서 아래와 같이 출력이 되도록 프로그램을 구현하시오.
 * [출력결과]
 * 1	2	*	4	5
 * 6	7	8	*	10
 * 11	*	13	14	*
 * 16	17	*	19	20
 */
public class Java050_array {

	public static void main(String[] args) {
		int[][] num = new int[][] {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}};
		/*int[][] num = new int[4][5];
		int cnt = 1;
		for (int row = 0; row <num.length; row++) {
			for (int col = 0; col< num[row].length; col++) {
			num[row][col] = cnt++;
			}		
		}
		*/
				
		for(int row=0; row<num.length; row++) {
			for(int col=0; col<num[row].length; col++) { //그냥 쓰면 행의 갯수, num[row]를 쓰면 그 행의 열의 갯수
				if(num[row][col]%3==0) {
					System.out.printf("%4c", '*');					
				}else {
					System.out.printf("%4d", num[row][col]);
				}
			}				
			System.out.printf("\n");
		}
		
	}// end main()

}// end class

//자바에서는 가변배열을 지원. 행마다 열의 크기를 따로따로 지정할 수 있음.
