package java0422;

/*
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 */

//패턴찾기
//행4 열5
//행 초기값1 종료값5 증가값1
public class Java036_for {

	public static void main(String[] args) {
		
		/*int row;
		int data;
				
		for(row=1; row<=4; row++) {
			for(data=1; data<=5; data++) {
				System.out.printf("%2d", data);
				if(data%5==0) {
					System.out.printf("\n");
				}
			}
			
		}*/
		
		for(int row=1; row<=4; row++) {
			int cnt=1;
			for(int col=1; col<=5; col++) {
				System.out.printf("%4d", cnt);
				if(col>=5) {
					System.out.printf("\n");
					
				}
				cnt++;
			}
		}
		
		


	}//end main()

}//end class
