//package문
package java0520_stream;

//import문
import java.util.Scanner;

//클래스
public class Java160_stream {
	//메인메소드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//앞에 세 문장을 이렇게 한방에 처리
		//콘솔창으로부터 문자데이터를 읽어오기 위해 스캐너 객체를 생성
		
		int x, y;
		System.out.print("x:");
		x = sc.nextInt();
		//다음 토큰을 읽어서 int형으로 반환. 그리고 변수x에 저장
		
		System.out.print("y:");
		y = sc.nextInt();
		
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		
		sc.close(); //연결 종료
		//이렇게 Java159_stream이 깔끔해짐. 크.. 오진다.
	} // end main()
} // end class
