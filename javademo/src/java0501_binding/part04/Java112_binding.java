package java0501_binding.part04;

public class Java112_binding {
	public static void process(HomeTv tv) {
		tv.turnOn();
		if(tv instanceof LgTv) {
			//객체에서만 instead of
			LgTv lg = (LgTv)tv; //다운캐스팅
			lg.call();
		} else if (tv instanceof SamsungTv) {
			SamsungTv ss = (SamsungTv) tv;
			ss.loc();
		}
		
		
		//tv.call(); //이걸 호출 못하는 문제점
		//tv.loc(); //이걸 호출 못하는 문제점.. 그래서 제공되는 게 다운캐스팅
	}
	
	public static void main(String[] args) {				
			LgTv lg=new LgTv("LG");
			process(lg);		    
		    SamsungTv ss=new SamsungTv("SAMSUNG");
		    process(ss);
	}

}

//instanceof는 객체 비교 연산자. 따라서 결과값이 논리값.
// 현재 객체의 타입을 알기 위해서.
// 참조변수를 가지고 뭔가 장난을 치는 거 같은데... 해당 참조변수의 참조영역에 대하여 분석해 볼 것.

