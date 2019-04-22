package java0422;
/*
 * for(초기식; 조건식; 증감식){
 * 	수행할 문장;
 * }
 * 
 * 1 조건식이 True일 때까지만 반복문 실행
 * 2 for문 실행순서
 *   초기식 -> 조건식(true) -> 수행할 문장 -> 증감식
 *        ->조건식(true)  -> 수행할 문장 -> 증감식
 *        ...
 *        ->조건식(false) -> for문을 빠져나옴
 * 3 초기식은 한 번만 수행
 * 4 초기식, 조건식, 증감식은 생략할 수 있지만 for(;;)세미콜론 반드시 입력
 * 5 초기식, 증감식은 생략하거나 여러 개 사용할 수도 있음
 *   조건식은 생략하건나 한 개만 사용한다.
 *   for(int a=3, b=4 ; ; sum+=a, hap+=b){}
 * 6 조건식을 생략하면 언제나 true로 인식. 즉, 무한루프가 됨.
 *   for문의 종료 시점을 정확히 파악할 수 없을 때 for문을 무한루프 설정한다.
 */
public class Java028_for {
	public static void main(String[] args) {
				
		/*
		 * System.out.println(1); System.out.println(2); System.out.println(3);
		 * System.out.println(4); System.out.println(5);
		 */
		//int i=1; -- 변수선언 위치에 따라 접근 범위가 달라짐
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		
	}// end main()
	
}// end class
