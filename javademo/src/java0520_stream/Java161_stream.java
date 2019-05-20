package java0520_stream;

import java.util.Scanner;

/*
 * [순번 이름 평균]입력
 * 
 * 순번:10
 * 이름:홍길동
 * 평균:9.5
 */
public class Java161_stream {

	public static void main(String[] args) {
		System.out.println("[순번 이름 평균] 입력");
		Scanner sc = new Scanner(System.in);
		
		int num;
		String name;
		double avg;
		
		num = sc.nextInt(); //nextInt는 공백 다음을 읽어들임?
		name = sc.next(); //nextline()을 쓰면 그냥 한 라인씩 다 읽어들인다.
		avg = sc.nextDouble(); //공백을 기준으로 입력한 순서대로 읽어들여서 각각 변수에 저장시킴
		
		System.out.println("순번:" + num);
		System.out.println("이름:" + name);
		System.out.println("평균:" + avg);
		
		sc.close();
		
	} //end main()

} //end class