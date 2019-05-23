package java0523_inner;

class OuterLocal {
	private int x;
	static int y;
	final private int z=10;
	
	public void call(int a) { 
		final int b=20;
		int c=30;
		//a=300; //매개변수 int a를 final로 처리해서 InnerLocal에서 처리할 수 있다.
		System.out.println(a);
		
		//Outer클래스의 call()메소드 안에 클래스를 또 정의할 수 있다. 지역클래스라고 함.
		//inner class
		class InnerLocal {
			void prn() {
				x=5;
				y=150;
				//Outer클래스의 메소드에 있는 매개변수, 지역변수를 지역내부클래스에서 새로운 값을 할당할 수 없다.
				//a=200; //오류가 뜸 //지역클래스에서 메소드의 매개변수를 사용하려면 final 선언을 해줘야 한다. 그래야 호출해서 사용할 수 있음.
				System.out.println("x=" + x);
				System.out.println("y=" + y);
				System.out.println("a=" + a);
				System.out.println("b=" + b);
				System.out.println("c=" + c);
				
			}// end prn()//////////			
		} //end innerLocal/////////////////	
		
		InnerLocal inner = new InnerLocal();
		inner.prn();		
		
	} // end call()
} //end OuterLocal


public class Java197_inner {

	public static void main(String[] args) {
		OuterLocal outer = new OuterLocal();
		outer.call(100);

	} //end main()

} //end class
