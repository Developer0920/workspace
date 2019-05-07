package java0507_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Java152_exception {

	public static void main(String[] args) {
		int[] data = new int[2];
		for(int i=0; i<data.length; i++) {
			data[i] = inputData(i);
			
		}
		System.out.printf("두 수의 합은 : %d\n", data[0] + data[1]);
	} //end main()
	
	//sc.nextInt(); 메소드는 정수를 입력하면 개행문자 앞까지만 읽어오지만
	//에러가 발생하여 개행문자가 버퍼에 남아있어
	//다시 정수를 입력할 때 개행문자가 자동으로 입력되지 때문에 무한반복이 된다.	
	//\r carriage return 개행문자 (13)
	//\n new line 줄바꿈 (10)
	
	public static int inputData(int index) {
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) { //while문은 그냥 보여주기 위한 용도
			try {
			System.out.printf("%d번째 정수를 입력하세요:\n", index+1);
			num = sc.nextInt(); //여기서 num에 값이 할당됨. //exception 발생 시 버퍼에 있는 게 남아있게 됨.
			break;
			}catch(InputMismatchException ex) {
				System.out.println("정수만 입력해라.");
				System.out.println(sc.nextLine()); //버퍼를 비우기 위한 용도. 하지만 굳이 이렇게 안 하고, 밑에 처럼만 하면 됨.
				//sc.nextLine(); //그냥 버퍼의 한 줄을 읽어와서 버림 //버러를 비우기 위한 용도
			}
			
		}
		return num;
	} //end inputData()
	
} //end class
