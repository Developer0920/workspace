package java0503_api;

import java.util.Scanner;

public class Java137_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.print("부서:");
		System.out.println("부서 연봉 평가");
		String dept = sc.next();
		
		//System.out.print("연봉:");
		int salary = sc.nextInt(); //String을 알아서 int로 바꿈. nextInt()의 기본은 String. String으로 다 넘어감.
									//공백으로 구분에서 각각 읽어들임.
		//System.out.print("평가:");
		double avg = sc.nextDouble();
		
		System.out.printf("%s %d %.1f\n", dept, salary, avg);
		
		sc.close(); //연결종료
	}

}
