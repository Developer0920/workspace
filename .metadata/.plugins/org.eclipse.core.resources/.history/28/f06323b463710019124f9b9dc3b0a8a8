package java0507_api;

import java.text.SimpleDateFormat;

//오늘 한 거는 시험에 나오진 않음
public class Java144_System {

	public static void main(String[] args) {
		//currentTimeMillis() : 1970.1.1부터 초단위로
		//누적한 값을 밀리세컨드로 리턴
		//하루는 86400초이다. 1초는 1000밀리세컨드이다.
		
		long curr = System.currentTimeMillis();
		System.out.println(curr); //우리가 원하지 않는 타임
		
		String pattern="yyyy-MM-dd HH:mm:ss a EEEE";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern); //형식을 처리해 주는 클래스
		//		auto boxing 발생			upcasting
		//long(stack) -> Long(heap) -> Object
		String date = sdf.format(curr); //object 매개변수 존나 많음. 모든 객체를 인자값으로 전달해 줄 수 있다는 것.
		System.out.println(date);
		
		

	} //end main()

}// end class
