package java0501_abstract_interface.prob.part01;

public class MyColorPoint extends MyPoint{
	//멤버변수
	String col;
	
	//생성자
	public MyColorPoint(int x, int y, String col) {
		super(x, y);
		this.col = col;
		
	}

	@Override
	protected void move(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	@Override
	protected void reverse() {
		int t;
		t = x;
		x = y;
		y = t;		
	}
	
	@Override //추상메소드가 아니어도 오버라이드 가능
	protected void show() {
		System.out.println(x+ "," + y + "," + col);
	}
	
	
}
