package java0419_statement;

//키워드(예약어) : 프로그램에서 어떤 의미를 부여해서 정의해 놓은 단어
//return : 현재 수행 중인 메소드(main)을 완전히 빠져나올 때 사용되는 키워드

public class Java022_if {

	public static void main(String[] args) {
		//char check = 'y';
		char check = 'n';
		
		if(check=='n') {
			System.out.println("main 종료");
			return;
		}
		
		System.out.println(check);
		System.out.println("program end");
		
		
	} // end main()

} // end class
