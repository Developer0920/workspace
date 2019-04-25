package java0425_class.prob;
/*
 * draw()메소드를   [실행결과]를 참조하여 구현하세요.
 * 
 * [실행결과]
 * &&&&&&&&&&
 * %%%%%%%%%%%%%%%%%%%%
 * %%%%%%%%%%%%%%%%%%%%
 * %%%%%%%%%%%%%%%%%%%%
 */

class Box { //라이브러리 클래스
	private int width, height; // 박스의 너비와 높이
	private char fillChar; // 박스를 그리는 데 사용하는 문자
	
	//생성자1
	public Box() { // 매개 변수 없는 생성자
		this(10, 1); // this() 이용
	}
	
	//생성자2
	public Box(int width, int height) { // 너비외 높이의 2 매개 변수를 가진 생성자
		this.width = width;
		this.height = height;
	}
	
	
	//메소드1
	public void draw() { // 박스 그리는 메소드
		///////////// 여기에서 구현하세요.
		for(int i=0; i<height; i++) {
			for(int j=0; j<width; j++) {
				System.out.printf("%c",  fillChar);
			}
			System.out.printf("\n");
		}

	}// end draw()	

	//메소드2
	public void fill(char c) { 
		// 박스를 그리는데 사용하는 문자 설정
		this.fillChar = c;
		
	}//end fill( )
}//end class


public class Prob03_class { //실행클래스

	public static void main(String[] args) {
		//여기를  구현하세요.
		
		//첫번째 박스 그리기
		Box first = new Box();
		first.fill('&');
		first.draw();
		
		//두번째 박스 그리기
		Box second = new Box(20,3);
		second.fill('%');
		second.draw();
		
		
		

	}//end main()

}//end class
