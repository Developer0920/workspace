package java0424_method;
/*
 * [출력결과]
 * 10는(은) 짝수입니다.
 */

public class Java059_method {

	public static void main(String[] args) {
		int data = 11;				
		process(data);
		
		/*
		if(process(data)) {
			System.out.printf("%d는(은) 짝수입니다.\n", data);
		}else {
			System.out.printf("%d는(은) 홀수입니다.\n", data);
		}
		*/
		
		//조건연산자(3항연산자) 사용
		String res = process(data) ? "짝수" : "홀수";
		System.out.printf("%d는(은) %s입니다.\n", data, res);
	
		
		/*
		char huljjack = process(data)==true ? '짝': '홀';
		if(huljjack=='짝') {
			System.out.printf("%d는(은) %c수입니다.\n", data, huljjack);
		}else {
			System.out.printf("%d는(은) %c수입니다.\n", data, huljjack);
		}
		*/
		
			
		
		/* 내 방식.. 병신..
		if(huljjack==true) {
			System.out.printf("%d는(은) 짝수입니다.", data);
		}else {
			System.out.printf("%d는(은) 홀수입니다.", data);
		}
		*/
		
		//process()호출하면서 data변수의 값을 넘겨주고
		//[출력결과]를 참조하여 구현하시오.
	}//end main()
	
	public static boolean process(int data) {
		//data매개변수의 값이 짝수이면 true,
		//홀수이면 false를 리턴하는 프로그램을 구현해 주세요.
		if(data%2==0) {
			return true;
		}else {
			return false;
		}		
	}//end process()

}//end class
