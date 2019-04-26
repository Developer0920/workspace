package java0426_class.part06;

public class CreditCard {
	String cardName;
	String cardNum;
	int pay;
	
	public CreditCard() {
		
	}

	public CreditCard(String cardName, String cardNum, int pay) {		
		this.cardName = cardName;
		this.cardNum = cardNum;
		this.pay = pay;
	}
	
	public void prn() {
		System.out.printf("%s %s %d\n", cardName, cardNum, pay);
	}
	
}
