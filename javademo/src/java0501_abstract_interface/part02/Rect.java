package java0501_abstract_interface.part02;

public class Rect extends Shape {
	//생성자1
	public Rect() {
		
	}
	//생성자2
	public Rect(int width, int height) {
		super(width, height);
	}
	
	@Override
	double getArea() {
		return getWidth()*getHeight();
	}
	
} //end class
