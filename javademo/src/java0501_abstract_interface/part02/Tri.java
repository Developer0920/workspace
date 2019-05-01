package java0501_abstract_interface.part02;

public class Tri extends Shape{
	public Tri() {
		
	}
	
	public Tri(int width, int height) {
		super(width, height);
	}
	
	@Override
	double getArea() { //같은 패키지이므로 default 가능
		return getWidth() * getHeight() /2;
	}
	
} //end class

//상속이 먼저 이루어져야 오버라이딩 할 수 있다.
//접근이 가능해야 상속이 된다. Shape클래스가 private이면 상속받을 수 없음