package java0429_static_access.part08;

public class Java091_encapsulation {

	public static void main(String[] args) {
		Time time = new Time();
		//time.hour = 14; //접근 불가!!
		time.setHour(14);
		time.setMinute(49);
		time.setSecond(30);
		
		//System.out.println(time.hour); //오류! 접근불가!!
		System.out.printf("%d:%d:%d\n", time.getHour(), time.getMinute(), time.getSecond());
	} //end main()

} //end class
