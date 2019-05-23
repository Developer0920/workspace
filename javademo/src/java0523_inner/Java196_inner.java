package java0523_inner;


class OuterStatic {
	private int x;
	static private int y;
	
	static void call() {
		//x = 30; static이 아니라 바로 쓸 수 없다. 메모리에 생성이 아직 아 돼 있음.
		y=9;
		System.out.println(y);
	}
	
	static class InnerStatic { //new해서 생성하기 전에 메모리 생성이 됨.
		int z;
		void prn() {
			//비 static외부 자원을 static내부클래스에서 참조할 수 없다.
			//x = 50; 역시 오류가 뜸.
			y=20;
			z=40;
			System.out.println(y+z);
		 
			
		}
	}
} //end OuterStatic

public class Java196_inner {

	public static void main(String[] args) {
		OuterStatic.call(); //객체를 생성할 필요 없다. static이니까
		
		//inner class의 호출
		OuterStatic.InnerStatic inner = new OuterStatic.InnerStatic(); //OuterStatic 객체생성 없이 바로 InnerStatic객체를 생성
		inner.prn();
		
	} //end main

} //end class