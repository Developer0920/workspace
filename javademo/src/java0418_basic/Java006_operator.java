package java0418_basic;

public class Java006_operator {
	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		System.out.println(a/b); // int/int => 3
		
		//결과값을 double형으로 가지고 오고 싶은 경우
		System.out.println((double)(a/b));
		
		System.out.println((double)a/b); // 결과값 : 3.333...
		
	}// end main()
}// end class
