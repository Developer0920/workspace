package java0501_abstract_interface.part02;

abstract public class Shape {
	//멤버변수
	private int width;
	private int height;
	
	//생성자1
	public Shape() {
		
	}
	
	//생성자2
	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	//게터
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	//추상메소드
	abstract double getArea();
	//삼각형, 사각형 넓이 구하는 공식이 다르다. 이런 경우 추상메소드를 사용. 그리고 이 추상클래스를 상속하고 이 추상메소드를 오버라이딩 하게 만든다.
} //end class
