package java0424_method;
/*
 * [출력결과]
 * java test
 * tset avaj
 * java test
 * 
 * call by reference를 잘 처리해야 하는 문제다.
 */
public class Java063_method {

	public static void main(String[] args) {		
		char[] arr = {'j', 'a', 'v', 'a', ' ', 't', 'e', 's', 't'};
		
		System.out.println(arr);
		System.out.println(reverse(arr));
		System.out.println(arr);
	}//end main()
	
	public static char[] reverse(char[] data) { //배열 반환도 가능하구나...
		//data의 요소 앞뒤를 바꿔서 리턴하는 프로그램을 구현하세요.
		char[] rvs = new char[data.length];
		for(int i = 0; i<data.length; i++) {			
			rvs[rvs.length-1-i] = data[i];
		}				
		return rvs;
	}
}//end class
