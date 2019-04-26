package java0426_class.part02;

public class Goods {
	String name; //상품명
	int price; //상품 가격
	int numberOfStock; //상품 재고
	int sold; //팔린 수량
	
	public Goods() {
		
	}

	public Goods(String name, int price, int numberOfStock, int sold) {
		super();
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	
	public void prn() {
		System.out.printf("%-14s %8d %5d %5d\n", name, price, numberOfStock, sold);
	}// end prn()
	
}
