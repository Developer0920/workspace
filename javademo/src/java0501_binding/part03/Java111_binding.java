package java0501_binding.part03;
//결합도가 놓은 케이스. 정적바인딩이 되므로.

//객체에서의 형변환을 이용해서.. 동적바인딩...결합도는 낮춘다..
//하나의 리모콘으로 컨트롤하겠다는 것. 이게 112번

public class Java111_binding {

	public static void display(double x, double y) {
		System.out.println(x + y);
		
	} //end display()	
	
	public static void processLg(LgTv lg) {
		lg.turnOn();
	} //end processLg()
	
	public static void processSamsung(SamsungTv ss) {
		ss.turnOn();
	}
	
	
	public static void main (String[] arge) {
		display(4.5, 6.3);
		display(10, 20);
		
		LgTv lg = new LgTv("LG");
		processLg(lg);
		
		SamsungTv ss = new SamsungTv("SAMSUNG");
		processSamsung(ss);
		
	}// end main()

} //end class

//결합도가 높다... 의존성이 높다.. 프로그래밍에서 최악. 유지보수 비용이 많이 듬.
//객체들 간의 결합도를 낮춰야 한다. 이걸 가능하게 해주는 게 동적 바인딩.
//동적바인딩을 사용하는 이유는 객체들 간의 결합도를 낮추기 위함이다.
//ㅅㅂ 뭔 말이냐....
