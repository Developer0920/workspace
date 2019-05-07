package java0507_exception;
/*
 * throws
 * 1 예외처리를 메소드를 호출한 다른 메소드에서 하도록 전달하는 기능
 * 2 사용목적 : 예외가 발생된 메소드와 이를 호출하는 메소드 양쪽에서 예외처리를 해주는 경우에 사용한다.
 * 3 java.io, java.net패키지에 많이 선언돼 있다.
 * 
 * API에서 throws 가 나오니까 이걸 배우는 거다.
 * 
 */

public class Java154_exception {

	public static void main(String[] args) {
		String data1 = "12";
		String data2 = "0";
		try {
		int x = Integer.parseInt(data1);
		int y = Integer.parseInt(data2);
		process(x, y);
		}catch(NumberFormatException ex) {
			System.out.println(ex.toString());			
		}catch(ArithmeticException ex) {
			System.out.println(ex.toString());
		}
	} //end main()
	
	public static void process(int x, int y) throws ArithmeticException { //위에 놈아, 니가 처리해라.
		int res = x/y;
		System.out.println(res);
	} //end process()

} //end class
// y=0이 올 수 없으므로 양 쪽에서 다 예외처리를 해야 하는 상황
//throw는 강제적으로 exception을 발생시키는 거다.
//직접 exception을 만들 수도 있다. .. 우리고 역시 exception class를 상속받아서 정의할 수 있다.
