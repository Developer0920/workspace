package java0503_api;

import static java.lang.Math.*;

public class Java131_Math {

	public static void main(String[] args) {
		//0.0부터 1.0미만 사이의 난수 발생
		double ran = random();
		//0.0~10.0미만 사이의 난수 발생
		ran = ran *10;
		System.out.println(ran);
		//소수 이하는 버리고 1~10미만을 리턴
		int num=(int)floor(ran); //반올림은 round(ran), 올림은 ceil(ran)
		System.out.println(num);

	} //end main(0

} //end class