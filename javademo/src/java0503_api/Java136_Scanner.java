package java0503_api;

import java.util.Scanner;

//이제 드디어 값을 받아보자.
public class Java136_Scanner {

	public static void main(String[] args) {
		//콘솔창으로 데이터를 읽어보기 위해서 콘솔창과 연결
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름:");
		
		//nextLine()메소드를 만나면 대기상태가 되며
		//사용자가 데이터를 입력하고 Enter를 하면
		//nextLine()메소드에서 읽는다.
		
		String name = sc.nextLine();

		System.out.println(name);
	} //end main()

} //end class
