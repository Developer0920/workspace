package java0503_api;
/*
 * 난수를 이용해서 소수점 첫째자리까지 반올림해서 구하시오.
 * ex) 0.5689... => 5.7
 * 
 */

import static java.lang.Math.*;

public class Java132_Math {

	public static void main(String[] args) {
		//소수점 이동
		double ran = random();
		ran = ran * 100;
		System.out.println(ran);
		
		long ran2 = round(ran); //floor는 더블로 리턴, ceil도 더블로 리턴, round는 double일 경우 long으로 리턴
		System.out.println(ran2);
		
		double ran3 = (double)ran2/10;		
		System.out.println(ran3);
		
		System.out.println("///////////////////////////////////////////////");
		
		//한번에
		double res = Math.random();
		System.out.println((double)Math.round(res*100)/10);
		
	} //end main()

} //end class
