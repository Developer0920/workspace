package java0422;

/*
 * 3행 * 4열
 * 1	2	3	4
 * 5	6	7	8
 * 9	10	11	12
 */

//1. 초기값1 종료값12 증가값1
//2. 4의 배수에서 줄바꿈

public class Java035_for {

	public static void main(String[] args) {
		/*int i;
		
		for(i=1; i<=12; i++) {
			if(i%4!=0) {
				System.out.printf("%-5d", i);
			} else {
				System.out.printf("%-5d\n", i);
		}
		}*/
		
		/* teacher's way
		 * 
		 * for(i=1; i<=12; i++) {
		 * 	System.out.printf("%-5d", i);
			if(i%4==0) {
				System.out.printf("\n");
			}
			}			
		 */
		
				
		//행과 열.. 2차원은 이중 반복문으로 처리해 줄 수 있다.
		//안에 있는 반복문은 열을 처리, 밖에 있는 반복문은 행을 처리
		int data = 1;
				
		//행처리
		for(int row=1; row<=3; row++) {
			//열처리
			for(int col=1; col<=4; col++) {
				System.out.printf("%4d", data);
				if(data%4==0) {
					System.out.printf("\n");
				}
				data++;
			}

		} // data, row, col 변수를 그리고 값을 대입해 나가면서 확인할 것!		
		
	}//end main()

}//end class //달력에 활용할 수 있을 듯;;
