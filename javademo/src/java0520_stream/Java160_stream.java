package java0520_stream;

import java.util.Scanner;

public class Java160_stream {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 이렇게 한방에 처리
		int x, y;
		System.out.print("x:");
		x = sc.nextInt();
		System.out.print("y:");
		y = sc.nextInt();
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		sc.close(); //이렇게 159가 깔끔해짐. 크.. 오진다.
	} // end main()

} // end class
