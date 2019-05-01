package java0501_abstract_interface.prob.part03;

//어류
abstract public class Fish {
	//멤버변수
	String name;
	//생성자1
	public Fish() {

	}
	//생성자2
	public Fish(String name) {
		this.name = name;
	}
	//메소드
	void swim() {
		System.out.println("물고기는 헤엄치며 움직입니다.");
	}

}
