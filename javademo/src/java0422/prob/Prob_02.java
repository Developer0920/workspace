package java0422.prob;
/*
 * 
 * 2001부터 2012년사이에서 윤년을 구하시오 
 * [출력결과]
    2004
    2008
    2012
 */

public class Prob_02 {

	public static void main(String[] args) {
		
		for(int yr=2001; yr<=2012; yr++) {
			if(yr%4==0 && yr%100 != 0 || yr%400 == 0) {
				System.out.println(yr);
			}
		}
      
       
	}//end main()

}//end class













