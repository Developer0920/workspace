package java0507_api;

import java.util.GregorianCalendar;

public class Java147_GregorianCalendar {

	public static void main(String[] args) {
		int year = 2016; //윤년 여부를 구하는 건 GregorianCalendar에서 제공
		GregorianCalendar gre = new GregorianCalendar();
		if(gre.isLeapYear(year)) {
			System.out.println(year + "년도는 윤년입니다.");
		} else {
			System.out.println(year + "년도는 평년입니다.");
		}
	} //end main()

} //end class
