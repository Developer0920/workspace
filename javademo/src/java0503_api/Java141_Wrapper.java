package java0503_api;

public class Java141_Wrapper {

	public static void main(String[] args) {
		char data = 'a';
		
		//대문자
		System.out.println(Character.toUpperCase(data));
		
		//소문자
		System.out.println(Character.toLowerCase(data));
		
		//대문자?
		System.out.println(Character.isUpperCase(data));
		
		//소문자?
		System.out.println(Character.isLowerCase(data));
		
		//알파벳
		System.out.println(Character.isAlphabetic(data));
		
	} //end main()

} //end class
