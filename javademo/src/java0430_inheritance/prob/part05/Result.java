package java0430_inheritance.prob.part05;

public class Result extends LatestImport{
	//멤버변수
	String number;
	int rate;
	String ccb;
	
	//생성자1
	public Result() {
		
	}
	//생성자2
	public Result(String date, String product, String number, int rate, String ccb) {
		super(date, product);
		this.number = number;
		this.rate = rate;
		this.ccb = ccb;		
	}
	
	//메소드
	@Override
	public String toString() {
		String str = getDate() + "\t" + getProduct() + "\t" + number + "\t"+ rate + "\t"+ ccb;
		return str;
	}	
	
}
