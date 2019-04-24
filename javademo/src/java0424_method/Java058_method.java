package java0424_method;

public class Java058_method {

	public static void main(String[] args) {
		// 조건 : data변수에는 소문자만 입력
		char data = 'e';
		char code = process(data);
		System.out.printf("%c의 대문자는 %c입니다.\n", data, code);

	}//end main()
	
	//data매개변수의 값을 대문자로 변경해서 리턴
	public static char process(char data) {
		//1 대문자 A, 소문자 a 유니코드
		//2 대문자, 소문자 차이(A : 65, a : 97)
		//3 int이하 자료형끼리 연산이 되면 결과는 int리턴		
		
		return (char)(data - 32); //형변환이 중요하다!!!!
				
		/*
		char upper = Character.toUpperCase(data);		
		return upper;
		*/
		
		/*
		char upper = (char)(data - 32);
		return upper;
		*/
	}

}//end class

