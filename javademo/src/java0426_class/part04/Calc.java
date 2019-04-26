package java0426_class.part04;

public class Calc {
	//멤버변수//
	
	int first;
	int second;	
	char ope; //연산자는 +, -, *, /만 저장함
	
	//생성자1//
	public Calc() {
		
	}

	//생성자2//
	public Calc(int first, int second, char ope) {
		super();
		this.first = first;
		this.second = second;
		this.ope = ope;
	}	
	
	public int process() {
		//여기 구현
		/* 내방식
		int a= 0;
		if(ope=='+') {
			a= first+second;			
		} else if(ope=='-') {
			a = first-second;			
		} else if(ope=='*') {
			a = first*second;
		} else if(ope=='/') {
			a = first/second;
		}
		return a;
		*/
		
		switch(ope) {
		case '+' : return first + second;
		case '-' : return first - second;
		case '*' : return first * second;
		/* case '/' : return first / second; */
		default : return first / second;
		
		}
	}// end process()
	
	public void prn() {
		System.out.printf("%2d %c %2d = %d\n", first, ope, second, process());		
	}//end prn()
}

