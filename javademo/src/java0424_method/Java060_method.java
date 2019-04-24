package java0424_method;
/*[출력결과]
 * 문자열의 길이 : 4
 * 2인텍스의 요소값 가져오기:v
 */

public class Java060_method {

	public static void main(String[] args) {
		char[] data = new char[] {'j', 'A', 'v', 'a'};
		int index = 2;		
		
		System.out.printf("문자열의 길이 : %d\n", length(data));
		System.out.printf("%d인텍스의 요소값 가져오기 : %c", index, charAt(data, index));

	}//end main()
	public static int length(char[] data) {
		// data 배열의 크기를 리턴하는 프로그램을 구현하시오.				
		return data.length;
	}//end length()
	public static char charAt(char[] data, int index) {
		//data 배열에서 index에 해당하는 문자를 리턴하는 프로그램을 구현하시오.		
		return data[index];
	}//end charAt

}//end class

//main에서 정의된 지역변수 또는 매개변수는 main내에서만 사용 가능. 
//다른 메소드에서 사용하게 하려면, 매개변수를 사용하면 된다.

//따라서 매개변수를 전해줌으로써 타 메소드에서 변수를 사용할 수 있게 한다.
