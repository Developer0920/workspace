package java0419_statement.prob;

/*
 * switch~case문을 이용해서 차량5부제 프로그램을 구현하시오.
 * 
 * 1. 차량의 끝번호가 아래에 해당하면 해당 요일은 차량운행을 제한한다.
 * 
 *    1,6 = 월요일
 *    2,7 = 화요일
 *    3,8 = 수요일
 *    4,9 = 목요일
 *    5,0 = 금요일
 *    
 * 2. 출력결과
 * 	   차량번호의 끝자리가 5인 차량은 금요일 운행을 제한합니다.
 * 
 */

public class Prob05 {

	public static void main(String[] args) {
		int car_num = 5; //차량 끝자리
		String day = ""; //제한요일

		// 여기에서 구현하세요////////////////////////////////		
		switch (car_num%5) {
		case 1 :
			day = "월요일"; break;
		case 2 :
			day = "화요일"; break;
		case 3 :
			day = "수요일"; break;
		case 4 :
			day = "목요일"; break;
		case 0 :
			day = "금요일";
		}
		
		
		/*사고과정
		 * 
		 */
		
		///////////////////////////////////////////////
		System.out.printf("차량번호의 끝자리가 %d인 차량은 %s 운행을 제한합니다.", car_num, day);

	}// end main()

}// end class
