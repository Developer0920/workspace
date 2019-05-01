package java0501_abstract_interface.part07;

public class FinalTest {
	final int CODE = 1; //final이 선언된 필드, 변수는 초기값을 할당해야 한다.
	
	void display() {
		//상수는 새로운 값을 할당할 수 없다.
		//CODE = 5;
	}
	
	void call() {
		System.out.println("call");
	}
	
	final void process() {
		System.out.println("proccess");
	}
	
} //end class
