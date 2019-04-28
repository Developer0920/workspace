package java0422;
/*
 * 반복문에서 특정 위치로 이동(continue)을 하거나 빠져나올 때(break)
 * 반복문은 label을 선언하고 호출하면 된다.
 */
public class Java037_for {

	public static void main(String[] args) {
		
		/*move :
		for(;;) {
			for(;;) {
				for(;;) {
					break move; //break만 쓰면 현재 수행 중인 반복문을 빠져나옴. 만약, for문 전체를 다 빠져나오고 싶다면, move를 쓰면된다. 
				}
				System.out.println("for1");
			}
			System.out.println("for2");
		}
		System.out.println("for3");
		*/ //?레이블 명이 move인 건가?
		
		
		move : //label선언 (라벨명은 임의로 설정가능) // p.u.(  )
		for (int i=1; i<=3; i++) {
			for (int j=1; j<=2; j++) {
				//break move; // -- 젤 앞에 있는 것도 뚫고 나옴
				continue move; // -- move label로 이동함
			}
			System.out.printf("i=%d\n", i); 
		}
		System.out.println("program end");
		
		
		
		/*int i=0;
		while(++i<=5) { //생략불가능이지만, 1증가 1감소는 ++, --로 처리할 수 있다.
			System.out.println(i);
			
		}*/
		
		/*
		int i=0;
		while(i++<5) { //후위에 있으면 비교연산자가 먼저 처리됨
			System.out.println(i);
		}
		*/
	}//end main()

}//end class
