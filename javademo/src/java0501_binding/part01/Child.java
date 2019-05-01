package java0501_binding.part01;

public class Child extends Parent { //상속한다? 상속받는다?
	void call() {
		System.out.println("Child call");		
	}
	@Override
	void process() {
		System.out.println("Child process");
	}
	
}
