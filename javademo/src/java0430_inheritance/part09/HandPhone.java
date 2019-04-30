package java0430_inheritance.part09;

public class HandPhone {
	//멤버변수
	private String maker; // samsung, iphone, lg, saomi
	private String model;
	private int price;
	//생성자
	public HandPhone(String maker, String model, int price) {
		this.maker = maker;
		this.model = model;
		this.price = price;
	}
	//메소드
	public String getModel() {
		return model;
	}
	//게터, 세터
	public void setModel(String model) {
		this.model = model;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	//메소드
	public void display() {
		System.out.printf("%-4s %-10s %6d\n", maker, model, price);
	}
}
