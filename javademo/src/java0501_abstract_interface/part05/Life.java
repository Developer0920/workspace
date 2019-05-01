package java0501_abstract_interface.part05;
//클래스를 먼저 상속하고, 인터페이스를 상속해야
//extends ~~~ implements
public class Life extends Animal implements SampleA, SampleB{
	
	@Override
	public void call() {
		System.out.println("call");		
	}

	@Override
	public void prn() {
		System.out.println("prn");		
	}
	
} //end class

//지금 인터페이스의 추상메소드를 오버라이드 한 건데.. 추상클래스를 활용하는 것과 근본적으로 어떤 차이가 있는 건가?


