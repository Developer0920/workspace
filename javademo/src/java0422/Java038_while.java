package java0422;
/*
 * while(조건식){
 * 	수행할 문장;
 * }
 * 
 * while문에서는 조건식 생략 불가. 따라서 무한루프를 돌리려면 true라고 써야 함.
 * 
 */
public class Java038_while {

	public static void main(String[] args) {
		/*for(int i=1; i<=5; i++) {
			System.out.println(i);
		}*/
		
		/*int i=1; //while 문은 사용전 변수과 초기값을 설정해 주어야.
		while(i<=5) {
			System.out.println(i);
			i++;
		}*/
		
		int i=0;
		while(i++<5) {
			System.out.println(i);			
		}
		
	} // end main()

} //end class
