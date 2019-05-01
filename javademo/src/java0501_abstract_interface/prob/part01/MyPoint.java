package java0501_abstract_interface.prob.part01;

abstract public class MyPoint { //추상클래스
	int x;
	int y;
	public MyPoint(int x, int y)  {
		this.x = x; this.y = y; 	
	}
	protected abstract void move(int x, int y); // 매개변수의 값을 멤버변수(필드)에 각각 저장 //새로운 x, y 위치로 이동
	protected abstract void reverse(); // (x, y)에서 (y, x)로 위치 변경
	protected void show() {
		System.out.println(x + "," + y);
	}
}//end class MyPoint
