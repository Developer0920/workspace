//package문
package java0521_collection;

//클래스
public class Sawon {
	//멤버변수
	private String name;
	private int one;
	private int two;
	private int three;
	
	//생성자1
	public Sawon() {

	}
	
	//생성자2
	public Sawon(String name, int one, int two, int three) {
		super();
		this.name = name;
		this.one = one;
		this.two = two;
		this.three = three;
	}
	
	//메소드
	private int jumsuTotal() {
		return one+two+three;
	}
	
	//메소드
	//Object클래스의 toString()메소드를 오버라이드
	@Override
	public String toString() {
	  return name+" "+one+" "+two+" "+three+" "+jumsuTotal();
	}
	
}// end class Sawon






