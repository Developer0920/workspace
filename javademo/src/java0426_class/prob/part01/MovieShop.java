package java0426_class.prob.part01;

public class MovieShop {
	//멤버변수//
	String name;
	int price;
	int person;
	
	//생성자1//
	public MovieShop() {

	}
	
	//생성자2//
	public MovieShop(String name, int price, int person) {
		this.name = name;
		this.price = price;
		this.person = person;
	}
	
	//메소드//
	public int countMoney() {
		return price * person;
	}
	
	//메소드_츨력//
	public void prn() {
		System.out.printf("%s %d\n", name, countMoney());
	}
	
}//end class
