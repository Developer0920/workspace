package java0430_inheritance.part10;

public class Bird extends Pet {
	//멤버변수
	String type; // 새 종류
	boolean flightYN; // 날수 있는지 여부
	
	//게터
	boolean getFlight() {
		return flightYN;
	}// end getFlight()
}// end Bird
