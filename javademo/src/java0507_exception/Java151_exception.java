package java0507_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

//다중 catch 사용법
public class Java151_exception {

	public static void main(String[] args) {
		//String data1 = "ab"; // ..
		//String data2 = "0"; //분모는 0이 될수 없다. 
		
		Scanner sc = new Scanner(System.in); //콘솔창과 연결시키는 작업
		
		
		
		try {
		//int x = Integer.parseInt(data1);
		//int y = Integer.parseInt(data2);
			int x = sc.nextInt(); //개행문자 앞까지만 읽어옴 \r\n
			int y = sc.nextInt();
			int res = x/y;
		System.out.println(res);
		} catch (ArithmeticException ex) { //상속관계가 아니므로 순서 상관 X
			System.out.println("분모는 0이 될 수 없다.");
		} catch (NumberFormatException ex) {
			System.out.println("숫자를 입력하라."); 
		} catch (InputMismatchException ex) {
			System.out.println(ex.toString());
		} catch (RuntimeException ex) {
			System.out.println(ex.toString()); //할배는 밑에 있어야 한다. //업캐스팅 발생
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	} //end main()

} //end class
