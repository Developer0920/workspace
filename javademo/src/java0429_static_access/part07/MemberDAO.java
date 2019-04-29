package java0429_static_access.part07;

public class MemberDAO {
	
	private static/*추가*/ MemberDAO dao = new MemberDAO(); // 2. 따라서 내부에서 생성
	//이것도 heap영역에 만들어지나? 응. 왜 private으로 놔야 하는가? public으로 놓으면 계속 생성한다?
	//그냥 싱글톤은 이게 일반적!	
	
	//생성자//
	private MemberDAO() { //1. 외부에서 new로 생성을 못하게 막는 것
		
	}
	
	//메소드//
	public static/*추가*/ MemberDAO getInstance() {
		return dao; // 3. new를 못쓰므로 외부에서 클래스로 직접 호출할 수 있도록 static을 붙여줌
	}
	
	public void display() {
		System.out.println("display");
	}
}
//ㅅㅂ...
//Singleton 패턴.. DB연동에서 사용됨
//처리되는 양이 적으므로 빨라짐. 메모리 사용도 효율적. 무엇보다 자원 절약!

//객체 하나만 생성해서 접근하는 방법 : singleton패턴

//굳이 private으로 두는 이유는? 외부에서 new로 접근을 못하도록 막은 것
//이게 돌아하는 메커니즘이 어떻게 되는 거지?

//결국 객체는 단 하나만 생성하게 된다.