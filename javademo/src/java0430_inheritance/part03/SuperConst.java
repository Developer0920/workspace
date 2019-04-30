package java0430_inheritance.part03;

public class SuperConst {
	int x;
	int y;
	
	//생성자//
	public SuperConst(int x, int y) { //5
		this.x = x; //6
		this.y = y; //7
	} //8
} //end class

class SubConst extends SuperConst{
	
	//생성자//
	SubConst() { //3
		//SuperConst클래스에 1개의 생성자가 정의돼 있으므로
		//JVM에서 기본생성자(인자가 없는 생성자)를 제공하지 않으므로 super()로 호출할 수 없다.
				
		//super(); //상위 생성자 호출 안하면 인자값이 없는 생성자가 주어짐. 근데, 지금은 인자값이 있어야 하는 상황
		//해결방법 : 인자값이 있는 생성자를 정의해주면 된다. super(10, 40);
		super(10, 40); //상위클래스 생성자 호출 키워드  //4
	} //9
} //end class

//super()는 다른 문장보다 먼저 와야

