package java0422;

//3의 배수만 제외하고 출력하는 프로그램
/*
 * 1
 * 2
 * 4
 * 5
 * 7
 * 8
 * 10
 */

public class Java034_for {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			/*
			 * if(i%3!=0) { System.out.println(i); }
			 */
			
			if(i%3==0) { //false이면, if문을 빠져나옴
				continue; // 반복문에서 continue를 만나면 조건식(단, for문에서는 증감식)으로 감.아래 문장을 수행하지 않음
			}
			
			System.out.println(i);
		}
		
	}//end main()

}//end class
