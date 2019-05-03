package java0503_api;

import java.util.StringTokenizer;

public class Java128_StringTokenizer {

	public static void main(String[] args) {
		//StringTokenizer(문자열, 구분자)
		//문자열의 구분자가 공벡일때는 2번째 인자값을 생략할 수 있다.
		
		
		StringTokenizer st = new StringTokenizer("java,jsp", ","); //나눠진 문자열 하나하나를 토큰이라고 한다.
		System.out.println(st.countTokens());
		
		/*
		for(int i=0; i<st.countTokens(); i++) {
			System.out.println(st.nextToken()); //가져오기는 둘로 구분. 복사와 꺼내오기. (메모리에 있는 거 제거 여부를 꼭 확인할 것)
		*/										//nextToken은 메모리에 있는 걸 가지고 오고 메모리에 있는 건 아예 없어진다. 그래서 다음 loop에서 countTokens가 1이 돼버림.
				
		//다음에 가져올 토큰이 있니 없니?
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	} //end main()

} //end class
