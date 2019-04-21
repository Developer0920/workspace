package java0418_basic.prob;
/*
 * ko, en, jp 평균을 구해서 60점 이상이면 "합격", 60점 미만이면 "불합격"을 
 * 출력하는 프로그램을 구현하세요.
 * 
 * [출력결과]
 * 1) 합격일때
 * 평균  65.0점, 합격입니다
 * 
 * 2)불합격일때
 * 평균  34.5점, 불합격입니다
 */

public class Prob07 {

	public static void main(String[] args) {
		int ko = 90;
		int en = 45;
		int jp = 60;
		int hap = ko + en + jp;
		String chk = "";

		// 여기에 구현하세요.
		
		double avr = hap/3;
		
		chk = avr >= 60 ? "합격입니다" : "불합격입니다";
		
		//System.out.println("평균 " + avr + "점, " + chk);
		System.out.printf("평균 %.1f점, %s", avr, chk);
		
		/* 사고과정
		 * 
		 */
		
	}// end main()

}// end class








