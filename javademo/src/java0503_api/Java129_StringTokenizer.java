package java0503_api;

import java.util.StringTokenizer;

public class Java129_StringTokenizer {

	public static void main(String[] args) {
		//구분자가 연속적으로 입력되어 있으면 두 번째 구분자부터는 무시한다.
		StringTokenizer st = new StringTokenizer("java,,jsp/spring", ",/"); //두 번째 쉼표를 무시함.
		
		System.out.println(st.countTokens());
		while(st.hasMoreElements())
			System.out.println(st.nextToken());
		
		System.out.println("////////////////////////////////");
		
		String[] data = "java,,jsp/spring".split("[,/]"); //또는 을 표현하려면 [ ]를 써야
		System.out.println(data.length);
		for(String ss : data)
			System.out.println(ss);
		// 위 둘의 차이는 구분자 무시 여부. 상황에 따라 선택하면 됨
		
		//math라는 클래스. 수학관련 멤버면수와 메소드를 모아 놓음
		
	} //end main()

} //end class
