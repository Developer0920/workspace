package java0503_api;

public class Java127_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		
		//StringBuffer -> String
		String sn = sb.toString();
				
		//String -> char[]
		char [] data = sn.toCharArray();
		
		display(data);
		
		//이런 식으로 변환하는 게 아주 중요하다!
		
		
	} //end main()
	public static void display(char[] data) {
		for(char cn : data)
			System.out.println(cn);		
	}//end display()
	
}//end class
