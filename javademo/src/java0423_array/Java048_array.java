package java0423_array;

public class Java048_array {

	public static void main(String[] args) {
		//3행 2열
		int[][] num = new int[][] {{1,2}, {3,4}, {5,6}}; //중괄호 안에 있는 중괄호의 갯수가 행의 갯수를 의미함
		
		for(int row=0; row<num.length; row++) {
			for(int col=0; col<num[row].length; col++) {
				System.out.printf("%4d", num[row][col]);
			}
			System.out.printf("\n");
		}
			
		
		

	}//end main()

}//end class
