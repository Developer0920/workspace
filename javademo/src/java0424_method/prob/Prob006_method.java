package java0424_method.prob;

public class Prob006_method {

	public static void main(String[] args) {
		System.out.println("<< 15 까지의 소수 >>");
		primeNumber(15);
		System.out.println("<< 32 까지의 소수 >>");
		primeNumber(32);
	}//end main( )

	private static void primeNumber(int num) {
		// 구현하세요.
		
		int sosu = 0;
		for(int i=1; i<=num; i++) {
			int cnt = 0;
			
			
			for(int j=1; j<=i; j++) {//i%j==0이면 1을 증가
				if(i%j==0) {
					cnt++;
				}
			}
			if(cnt==2) {
				sosu++;				
			}
			
		}
		System.out.println(sosu);	
	}// end primeNumber( )
}//end class