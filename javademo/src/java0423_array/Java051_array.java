package java0423_array;

public class Java051_array {

	public static void main(String[] args) {
		//가변배열을 생성할 때는 제일 마지막의 배열크기는 지정하지 않는다.
		
		int[][] num= new int[3][]; //행의 크기는 반드시 지정해야 함
		num[0] = new int[2]; //0행 2열
		num[1] = new int[3]; //1행 3열
		num[2] = new int[4]; //2행 4열
		
		
		//int[][] num= new int[][] {{1,2},{3,4,5},{6,7,8,9}};
		
		for(int row=0; row<num.length; row++) {
			for(int col=0; col<num[row].length; col++) {
				System.out.printf("%4d", num[row][col]);
			}
			System.out.printf("\n");			
		}
		

	}

}
//가변배열은 2차원 배열부터 가능