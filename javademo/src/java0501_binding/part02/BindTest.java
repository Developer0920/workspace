package java0501_binding.part02;
//모든 클래스 중에 조상이 클래스가 이다. 그게 바로 Object클래스
//import. java.lang.Object. 하지만 다 안 써도 된다. Java가상신에 이미 ..
//java.lang. ..핵심인 클래스 인터페이스만 저장. 자바가산머신에 이미 탑재. 별도의 import 필요X

//import.jave.lang.object --이미 자바가상머신에 있음
// 여기서 제공되는 것을은 별로의 import 필요 X

public class BindTest extends Object{
	String stn;
	
	public BindTest() {
		
	}
	public BindTest(String stn) {
		this.stn=stn;
	}
	public String toString() {
		return stn;
	}
} //end class

	
