package java0503_api;

import java.util.Scanner;

//구구단..
//

public class Java138_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("단입력: ");
			int dan = sc.nextInt();
			for (int i = 1; i<10; i++) {
				System.out.printf("%d X %d = %d\n",  dan, i, dan *1);
			}
			System.out.print("계속하시게습니까?(종료:n,계속:아무키)");
			String chk = sc.next();
			if (chk.equals("n")) {
				System.out.println("프로그램종료");
				break;
			}
		}
		sc.close();	
		
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("단입력:");
		int step = sc.nextInt();
		move:
		switch(step) {
		case 2:
			System.out.println("구구단2단");
			break;
		case 3:
			System.out.println("구구단3단");
			break;			
		case 4:
			System.out.println("구구단4단");
			break;
		case 5:
			System.out.println("구구단5단");
			break;			
		case 6:
			System.out.println("구구단6단");
			break;
		case 7:
			System.out.println("구구단7단");
			break;
		case 8:
			System.out.println("구구단8단");
			break;
		default :	
			System.out.println("구구단9단");				
		}
		Scanner sc2 = new Scanner(System.in);
		System.out.print("계속하시겠습니까?(종료:n,계속:아무키");
		String yn = sc.next();
		
		if(yn.equals("n")){
			return;
		} else {
			continue move;
		}
		*/
		
		
	} //end main()	

} //end class
