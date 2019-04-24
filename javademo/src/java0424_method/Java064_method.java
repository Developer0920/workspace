package java0424_method;

public class Java064_method {

	public static void main(String[] args) {
		char[] data=new char[] {'a', 'b', 'c'};
		System.out.println(data); //캐릭터 배열인 경우에만  요소가 출력됨
		System.out.printf("%s\n",  data); //메모리 내 주소값 출력
		System.out.println("data="+ data); //메모리 내 주소값 출력
		
		int[] num = new int[] {1,2,3};
		System.out.println(num);  //메모리 내 주소값 출력			
	}

}
