package java0426_class.part05;

public class Insurance {
	//멤버변수//
	String code; //상품코드
	String name; //상품명
	String type; //상품종류
	int payment; //납입보험료
	
	//생성자1//	
	public Insurance() {
		
	}
	
	//생성자2//
	public Insurance(String code, String name, String type, int payment) {
		super();
		this.code = code;
		this.name = name;
		this.type = type;
		this.payment = payment;
	}	
	
	//메소드//
	public void prn() {
		System.out.printf("%s %s %s %d\n", code, name, type, payment);
		
	} //end prn()
	
} // end class
