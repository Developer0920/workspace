package java0430_inheritance.prob.part05;

public class LatestImport {
	//멤버변수
	private String date;
	private String product;
	
	//생성자1
	public LatestImport() {
		
	}
	//생성자2
	public LatestImport(String date, String product) {
		this.date = date;
		this.product = product;
		
	}
	//게터 세터
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	//메소드
	public String toString() {
		String str = date + "\t" + product;
		return str;
	}
	
	
	
	
	
	
}
