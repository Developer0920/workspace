/*
 * [순번 이름 평균]입력
 * 
 * 순번:10
 * 이름:홍길동
 * 평균:9.5
 */

//package문
package java0520_stream;

//import문
import java.util.Scanner;

//클래스
public class Java161_stream {
	//메인메소드
	public static void main(String[] args) {
		System.out.println("[순번 이름 평균] 입력");
		Scanner sc = new Scanner(System.in);
		//콘솔창으로부터 문자데이터를 읽어오기 위해 스캐너 객체를 생성
		
		//지역변수
		int num;
		String name;
		double avg;
		
		//공백을 기준으로 입력한 순서대로 읽어들여서 각각 변수에 저장시킴
		num = sc.nextInt();
		//다음 토큰을 읽어서 int형으로 반환. 그리고 변수num에 저장
		
		name = sc.next();
		//다음 토큰을 읽어서 String으로 반환. 그리고 변수 name에 저장
		//nextline()은 한 라인씩 다 읽어들임
		
		avg = sc.nextDouble();
		//다음 토큰을 읽어서 Double형으로 반환. 그리고 변수avg에 저장
		
		//출력
		System.out.println("순번:" + num);
		System.out.println("이름:" + name);
		System.out.println("평균:" + avg);
		
		//종료
		sc.close();
		
	} //end main()

} //end class
