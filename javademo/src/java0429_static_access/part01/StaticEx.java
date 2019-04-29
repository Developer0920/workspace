package java0429_static_access.part01;

public class StaticEx {
	int x = 5; //바로 이렇게 하는 경우 거의 없음. static을 보여주기 위함.
	static int y = 10;
	
	public  StaticEx() {
		
	}
	
	public void prn() {
		System.out.printf("%2d %2d\n", x, y);
		
	}
} //end class
