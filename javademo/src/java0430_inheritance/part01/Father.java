package java0430_inheritance.part01;

public class Father {
	int a = 3;
	void prn() {
		System.out.println("a=" + a);
	}
} //end class

//child는 Father을 상속받는다(Child는 Father이다)
class Child extends Father{ //하나의 소스파일에는 public 클래스는 하나만 있어야 한다.
	int b=5;
	
}