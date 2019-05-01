package java0501_abstract_interface.part07;

public class UserFinal extends FinalTest{
	public UserFinal() {
		
	}
	@Override
	void call() {		
		super.call();
	}
	
	//void process() { //상속은 되는데 오버라이딩이 안 된다. final이 선언돼 있기 때문이다. 즉, 접근은 할 수 있단 소리.
		
	//}
	

}
