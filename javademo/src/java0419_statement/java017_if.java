package java0419_statement;

/*
 * 제어문(control statement) : 문장의 흐름을 제어해 주는 기능이다.
 * 1. 종류
 * 조건문 : if~else, switch~case
 * 반복문 : for, while, do~while
 * 기타 : break, continue, (label)
 * 
 * if(조건식){
 * 		참일 때 수행할 문장;
 * }else{
 * 		거짓일 때 수행할 문장;
 * }
 * 
 * 식은 결과값의 데이터 타입은 여러 개
 * 조건식은 결과값이 논리값이어야
 */
 
public class java017_if {
		
	public static void main(String[] args) { //1
		int num=3; //2
				
		if(num%2==0) { //3
			System.out.printf("%d은(는) %s입니다.\n", num, "짝수");
		} else {
			System.out.printf("%d은(는) %s입니다.\n", num, "홀수"); //4
		}

	}// end main() //5 main의 끝이 나오므로 프로그램이 종료된다.

}// end class

