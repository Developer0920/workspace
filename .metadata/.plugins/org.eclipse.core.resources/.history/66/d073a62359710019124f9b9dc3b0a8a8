package java0503_api;
/*
 * 메모리에 한 번 저장되면 변경할 수 없음
 * java.lang.String : 불편
 * java.lang.StringBuffer : 가변, 동기화 -- 동기화 비동기화는 쓰레드에서// 비동기화 0 요청을 해서 응답을 하든 안 하든 계속 요청이 됨. 모바일에서 많이 사용. 다운은 다운대로 받고 우리는 또 다른 작업을 할 수 있다.
 * java.lnag.StringBuilder : 가변, 비동기화
 * 
 * StringBuffer 특징
 * 1. 문자열 값을 수정할 수 있는 mutable(가변)이다.
 * 2. 기본 16문자 크기로 지정된 버퍼를 이용하여, 크기를 증가시킬 수 있다.
 * 
 * insert, delete, append와 같은 메소드를 제공함. 반면 Sring class는 이런 것들을 지원 X
 * 
 * 
 * 
 */
public class Java125_StringBuffer {

	public static void main(String[] args) {
		String sg = new String("java test");
		String ss = sg.replace("java",  "jsp"); //불변
		System.out.println("ss:" + ss);
		System.out.println("sg:" + sg); //얘는 안 바뀌고 그냥 나옴.
		System.out.println("////////////////////");
		
		//반면.. StringBuffer에서는..
		StringBuffer sb = new StringBuffer("spring test");
		//0부터 6미만 사이의 문자열을 "framework"로 변경하라
		
		sb.replace(0,  6,  "framework");
		System.out.println("sb:" + sb); //메모리에 저장된 것 변경됨. 가변.
		
		
		
	} //end main()

} //end class
