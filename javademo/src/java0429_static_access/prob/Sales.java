package java0429_static_access.prob;
//-(private)    + (public)    #(protected)     X : default

/*   클래스명 : Sales
*   -item:String  private String item;
*   -qty:int
*   -cost:int
*   
*   +setItem(item String):void
*   +setQty(qty int):void
*   +setCost(cost int):void
*   +getItem():String
*   +getQty():int
*   +getCost():int
*   +toString():String         ==> 출력
*   +getPrice():int             ==> 수량 * 단가를 리턴
*/

public class Sales {
	
	//멤버변수//
	private String item;
	private int qty;
	private int cost;
	
	//개터 메소드, 세터 메소드
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	//메소드//
	public String toString() {
		String str = "픔목 : " + item + " 수량 : " + qty + " 단가 : " + cost + " 금액 : " + getPrice(); 
		return str;
	}
	public int getPrice() {
		int price = qty*cost;
		return price;
	}
}
