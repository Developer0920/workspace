package java0502_api;

/*
 * [출력결과]
 * aerok
 * korea
 */
public class Java115_String {

	public static void main(String[] args) {
		String sn = "korea";
		char[] data = display(sn);
		System.out.println(data);
		System.out.println(sn);

	} //end main()
	
	public static char[] display(String alpa) {
		//alpa매개변수에 저장된 문자열을 reverse한 후 반환하는 프로그램 구현하라.
		char [] chr = new char[alpa.length()];
		for(int i=0 ; i< alpa.length() ; i++) {
			chr[i] = alpa.charAt(alpa.length()-1-i);			
		}
		
		return chr;
		
	} //end display()

} //end class
