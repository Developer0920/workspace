package java0502_api;

class StringTest extends Object{
	private char[] arr;
	//생성자1
	public StringTest() {
		
	}
	//생성자2
	public StringTest(char[] arr) {
		this.arr = arr;
	}
	//메소드
	public int length() {
		return arr.length;
	}
	//메소드
	public char charAt(int index) {
		return arr[index];		
	}
	//메소드
	public boolean isUpperCase(int index) {
		if(arr[index] >= 'A' && arr[index] <= 'Z')
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() { //Object 클래스의 toString()를 수정한 것
		String sn="";
		for(int i=0; i<arr.length; i++)
			sn += arr[i];
		return sn;
	}
} //end class

public class Java111_string {

	public static void main(String[] args) {
		char[] data = new char[] {'j', 'a', 'v', 'a'};
		StringTest st = new StringTest(data);
		System.out.println(st.length());
		System.out.println(st.charAt(2));
		System.out.println(st.isUpperCase(2));
		System.out.println(st.toString());
		
		char[] sub = new char[] {'k', 'o', 'R', 'e', 'A'};
		StringTest ss = new StringTest(sub);
		System.out.println(ss.length());
		
	}

}


