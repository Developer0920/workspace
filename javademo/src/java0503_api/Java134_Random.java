package java0503_api;

import java.util.Random;

public class Java134_Random {

	public static void main(String[] args) {
		
		Random ran = new Random();
		double r1 = ran.nextDouble();
		System.out.println(r1);
		
		int r2 = ran.nextInt(); //정수값을 가져올 수 있음
		System.out.println(r2);
		
		//0부터~10미만
		int r3 = ran.nextInt(10);
		//1부터~10까지
		System.out.println(r3+1);
		

	}

}
