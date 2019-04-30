package java0501_abstract_interface;

abstract public class CarAbs { //0개 이상의 추상메소드를 갖고 있는 클래스를 추상클래스라고 한다. //추상메소드가 없어도 abstract를 붙이면 추상클래스
	int speed;
	String color;
	
	abstract public void work(); //추상메소드(abstract) --- 제어자 부분은 순서 바뀌어도 상관없다.
	
	public void display() {
		System.out.printf("%d %s\n", speed, color);
		
	}
}//end class
//하는 일은 있는데 그 하는 일이 반드시 달라야 한다면 오버라이딩을 쓸 수 있다.
//강제적으로 상속을 받을 클래스에서 오버라이딩 하도록 강제하는 게 추상클래스
//개발자의 실수를 줄이기 위함 -- 어노테이션 오버라이딩 같은 것