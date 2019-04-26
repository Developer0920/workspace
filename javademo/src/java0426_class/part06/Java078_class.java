package java0426_class.part06;
/*
 * [출력결과]
 * 기업은행 42523-52325 100000
 * 하나은행 52253-22623 153000
 * 신한은행 16239-95235 256000
 * 총납입액:509000
 * 
 */
public class Java078_class {

	public static void main(String[] args) {
	//여기 구현
	
	//일단 클래스 배열 세팅
	CreditCard[] cc = new CreditCard[3];
	cc[0] = new CreditCard("기업은행", "42523-52325", 100000);
	cc[1] = new CreditCard("하나은행", "52253-22623", 153000);
	cc[2] = new CreditCard("신한은행", "16239-95235", 256000);
	/*
	account[0].prn();
	account[1].prn();
	account[2].prn();
	*/
	
	int sum = 0;
	for(int i=0; i<cc.length; i++) {
		cc[i].prn();
		sum = sum +cc[i].pay;
	}
	System.out.println("총납입금액:" + sum);
	
	/*
	System.out.println("총납입금액:" + total(cc));		
	*/
	
	}//end main()
	
	/*
	//총납입액을 구하는 메소드	
	public static int total(CreditCard[] cc) {
		int sum = 0;
		for(int i=0; i<cc.length; i++) {
			sum = sum + cc[i].pay;			
		}
		return sum;
	}//end total()
	*/	
	
	


}//end class
