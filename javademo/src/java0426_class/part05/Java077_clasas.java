package java0426_class.part05;

//납입 금액 구해서 총합을 더함
/*
 * [데이터]
 * a001 생명보험 자동차보험 3000
 * 
 * 
 * [출력결과]
 * 손해보험 총납입액은 40000원 입니다.
 * 
 */

public class Java077_clasas {

	public static void main(String[] args) {
		String search = "손해보험";
		Insurance[] is = new Insurance[4];
		is[0] = new Insurance("a001", "생명보험", "자동차보험", 30000);
		is[1] = new Insurance("a002", "생명보험", "운전자보험", 20000);
		is[2] = new Insurance("b001", "손해보험", "화재보험", 15000);
		is[3] = new Insurance("b002", "손해보험", "해상보험", 25000);
		int sum = process(is, search);
		totalPrice(sum, search);
		
	}// end main()
	
	//총금액을 반환하는 메소드
	private static int process(Insurance[] is, String name) {
		int sum = 0;
		for(int i=0; i<is.length; i++) {
			if(is[i].name==name) {
				sum = sum + is[i].payment;
			}
		}
		return sum;
	}//end process
	
	public static void totalPrice(int sum, String name) {
		System.out.printf("%s 총납입액은 %d원입니다.\n", name, sum);
	}//end totalPrice
}// end class
