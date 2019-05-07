package java0503_api;
/*
 * 원래 값만 저장할 수 있지만.. 일반 클래스처럼 값도 저장하고 메모리에 저장된 값을 가지고 어떤 기능을 처리해 주는 메소드까지 추가되서 제공되는게 있으면 좋겠다 하여 생긴 것
 * 
 * 1 기본자료형을 클래스로 정의해놓은 것을 Wrapper라한다. 
 *   char -> Character
 *   byte	-> Byte
 *   short	-> Short
 *   int	-> Integer
 *   long	-> Long
 *   float	-> Float
 *   double	-> Double
 *   boolean -> Boolean
 *
 * 2 메모리에 저장된 값을 다른 자료형으로 변환해주는 메소드를 제공하기 위해서
 *   Wrapper클래스를 제공한다.
 * 
 * 3 auto boxing과 auto unboxing은 jdk5.0에서 추가된 기능이다.
 *   auto boxing => 스택 -> 힙영역에 복사 //원래는 일일이 작업을 해줘야 했음
 *   auto unboxing => 힙 -> 스택영역에 복사
 */
public class Java139_Wrapper {

	public static void main(String[] args) {
		
		//String을 Int로 가져와 보자.
		String data = "123";
		
		//String -> Integer
		Integer it = new Integer(data); //숫자관련  wapper class는 사용법이 거의 비슷
		
		//Integer -> int
		int num = it.intValue(); //it.byteValue(), it.floatValue() ...
		System.out.println("num=" + num);
				
		double pro = it.doubleValue();
		System.out.println("pro=" + pro);
		
		long ro = it.longValue();
		System.out.println("ro=" +ro);		
		
		
		
		// String -> Float
		Float ft = new Float(data); //바로 가져올 수 있도록 제공되는 메소드
		
		// Float -> int
		int fx = ft.intValue();
		System.out.println("fx="+ fx);
		
		// Float -> double
		double de = ft.doubleValue();
		System.out.println("de=" + de);
		
		
		
		//String -> int
		int num1 = Integer.parseInt(data);
		System.out.println("num1=" + num1);
		
		//String -> byte
		byte numByte = Byte.parseByte(data);
		System.out.println("numByte=" + numByte); //이쪽 부분들..시험에 나옴
		
		// String -> boolean
		//파싱불가(true or false문자열만 파싱할 수 있음)
		boolean numBoolean = Boolean.parseBoolean(data);
		System.out.println("numBoolean=" + numBoolean);
				
		String chk = "true";
		numBoolean = Boolean.parseBoolean(chk);
		System.out.println("numBoolean=" + numBoolean);
		
		char c = data.charAt(0); //파싱하지 못하고 문자1개만 분리해냄
		System.out.println("c=" +c);
		
		/////////////////////////////////////////////////////// 여기서 부터!!
		int x=10; //stack
		//Integer ig = new Integer(x);
		Integer ie = x; // new 할 필요 없다. //auto boxing (stack -> heap)
		
		//int k = ie.intValue();
		int y = ie; //auto unboxing(heap -> stack) -- 래퍼클래스일 때 이게 가능
		System.out.println("y="+y);
		
		
	}//end main()

}//end class
