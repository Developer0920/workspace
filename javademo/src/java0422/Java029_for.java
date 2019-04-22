package java0422;

public class Java029_for {
//누적값이 15가 되도록 -- 언제 15인지 모르므로 이런 경우 무한루프를 돌림
	public static void main(String[] args) {
		int sum = 0; //누적값을 저장할 변수
		int i;
		
		for(i=1; ; i++) {
			sum = sum + i;
			if(sum >= 15) {
				break; //for문 빠져나올 때 break! if문에는 break가 적용 안 된다. break는 switch와 for에서
						// 현재 수행중인 반복문을 빠져나옴
				
			} // if가 false면 어디로 가는 거지?
		}
		
		System.out.printf("i=%d sum=%d\n",  i, sum);

	} // end main()

}// end class
