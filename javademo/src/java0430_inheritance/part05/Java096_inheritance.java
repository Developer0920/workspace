package java0430_inheritance.part05;
//overriding에 대해서 알아보자.
//오버로딩은 단일 클래서의 이슈, 오버라이딩은 상속에서의 이슈

public class Java096_inheritance {

	public static void main(String[] args) {		
		Second sd = new Second();
		//sd.prn(); //오...		
		
		sd.superThisMethod(); // 두 개가 출력!
		
		
	} //end main()

} //end class
