package java0425_class.part07;
//this 키워드 : 메모리에 생성돼 있는 자신을 호출할 때 사용


/*
 * this : 객체 자신을 의미
 * this.멤버변수;
 * this.메소드();
 * this(); 생성자
 */
public class Product {
	//멤버변수
	String code;
	String pname;
	int cnt;
	
	//생성자 Ctrl + space
	public Product() {
			
	}
	
	 public Product(String code, String pname, int cnt) {
		 //생성자를 확실히 나타내 주기 위해 멤버변수와 매게변수의 변수명을 같게 함.
		//멤버변수와 매개변수 이름이 같을 때 멤버변수에 this키워드를 명시한다.
		 this.code=code; //내 code는 code
		 this.pname=pname; //
		 this.cnt=cnt;
	 }
	
	public void prn() {
		System.out.printf("%s %s %d\n", code, pname, cnt);
	}
}
//기본 생성자라도를 만들도록 권유하고 있음. 스프링 프레임워크에서.
//static에서는 this를 사용할 수 없음.