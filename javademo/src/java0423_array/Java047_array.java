package java0423_array;
//대괄호 개수에 따라 1차원, 2차원이 됨. 3차원은 게임 쪽
public class Java047_array {

	public static void main(String[] args) {
		//3행 2열의 2차원배열
		int[][] num=new int[3][2]; //항상 행, 열 순
		
		System.out.printf("%4d", num[0][0]);
		System.out.printf("%4d\n", num[0][1]);
		System.out.printf("%4d", num[1][0]);
		System.out.printf("%4d\n", num[1][1]);
		System.out.printf("%4d", num[2][0]);
		System.out.printf("%4d\n", num[2][1]);
		
		num[0][0]=1;
		num[0][1]=2;
		num[1][0]=3;
		num[1][1]=4;
		num[2][0]=5;
		num[2][1]=6;
		
		System.out.println("=================================");
		
		
		//num.length : 2차원배열에서 행의 크기를 리턴
		//배열은 기본적으로 크기 고정. but, 2차원부터는 가변배열 가능
		for(int row=0; row<num.length; row++) {
			for(int col=0; col<=1; col++) {//2차원 배열에서 length는 행을 나타냄
			//for(int col=0; col<=num[row].length; col++) {	//가변배열에서도 정확하게 출력이 가능케 함. ?가변배열 세팅은 어떻게 하지?
				System.out.printf("%4d", num[row][col]);
								
			}
			System.out.println(""); //지나는 길목을 확인할 해야 한다!
		}	
		
		/*
		System.out.printf("%4d", num[i][j]);
		
		
		System.out.printf("%4d", num[0][0]);
		System.out.printf("%4d\n", num[0][1]);
		System.out.printf("%4d", num[1][0]);
		System.out.printf("%4d\n", num[1][1]);
		System.out.printf("%4d", num[2][0]);
		System.out.printf("%4d\n", num[2][1]);
		*/
		System.out.println("////////////////////////////////");
		/*
		 * 1 3 5
		 * 2 4 6
		 */
		for(int col=0; col<2; col++) {
			for(int row=0; row<=2; row++) {//2차원 배열에서 length는 행을 나타냄
			//for(int col=0; col<=num[row].length; col++) {	//가변배열에서도 정확하게 출력이 가능케 함. ?가변배열 세팅은 어떻게 하지?
				System.out.printf("%4d", num[row][col]);
								
			}
			System.out.println(""); //지나는 길목을 확인할 해야 한다!
		}	
		
	}//end main()

}//end class
