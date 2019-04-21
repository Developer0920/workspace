package java0419_statement;
/*각 월의 마지막일
 * 1 3 5 7 8 10 12 => 31
 * 4 6 9 11 => 30
 * 2 => 28
 * 
 * [출력결과]
 * 4월의 마지막 일은 30입니다.
 */

public class Java026_switch {

	public static void main(String[] args) {
		int month = 12; //월
		//지역변수는 기본값을 제공하지 않는다.
		int lastDay = -1 ; //마지막 일
		
		if(month<1 || month>12) {
			System.out.println("월은 1~12까지만 가능하다. 멍충아.");
			return;
		}
		
		switch(month) {
		case 2 :
			lastDay = 28; break;
		case 4 :
		case 6 :			
		case 9 :			
		case 11 :
			lastDay = 30; break;
		default :
			lastDay = 31;
		}
		System.out.printf("%d원의 마지막 일은 %d입니다.\n", month, lastDay);
	} // end main()

} // end class
