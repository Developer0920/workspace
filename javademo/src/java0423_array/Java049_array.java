package java0423_array;
/*
 * [데이타]
 * 홍길동 90	85	40
 * 갑동이 100	35	75
 * 
 * [출력결과]
 * 홍길동 90	85	40	215	71.7
 * 갑동이	100	35	75	210	70.0
 */

public class Java049_array {

	public static void main(String[] args) {
		/*
		String[] nm = new String[] {"홍길동", "갑동이"};
		int[][] pt = new int[][] {{90,85,40}, {100,35,75}};
		int[] sum = new int[] {pt[0][0]+pt[0][1]+pt[0][2], pt[1][0]+pt[1][1]+pt[1][2]};
		double[] avr = new double[] {sum[0]/3, sum[1]/3};
				
		for(int i=0; i<2; i++) {			
			System.out.printf("%4s", nm[i]);			
			for(int row=0; row<3; row++) {				
				System.out.printf("%4d", pt[i][row]);
			}
			System.out.printf("%4d %4.1f\n",  sum[i], avr[i]);			
		}	
		*/
		String[] name = new String[] {"홍길동", "갑동이"};
		int[][] jumsu = new int[][] {{90,85,40}, {100,35,75}};
		
		int total;
		for(int i=0; i<jumsu.length; i++) {
			total=0;
			System.out.printf("%8s",  name[i]);
					
			/*
			System.out.printf("%4d",  jumsu[i][0]);
			total=total+jumsu[i][0];
			System.out.printf("%4d",  jumsu[i][1]);
			total=total+jumsu[i][1];
			System.out.printf("%4d",  jumsu[i][2]);
			total=total+jumsu[i][2];
			*/
			
			for(int j=0; j<jumsu[i].length; j++) {
				System.out.printf("%4d",  jumsu[i][j]);
				total=total+jumsu[i][j];
			}
			
			System.out.printf("%4d %.1f\n",  total, (double)total/jumsu[i].length);
			
			
			
		}
		
	}// end main()
	

}// end class
