package java0430_inheritance.part08;

public class FireEngine extends Car{
	private long water; //private은 상속 X
	//세터
	public void setWater(long water) {
		this.water = water;
	}
	//메소드
	void waterSpread() {
		System.out.println(water + "량의 물을 뿌린다.");;
	}
} // end class
