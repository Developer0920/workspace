package java0426_class.part04;
/* 출력결과를 참조하여 process()메소드 구현하시오.
 * 
 * [출력결과]
 * 10 + 5 = 15
 * 3 * 2 = 6
 * 
 * 
 */
public class Java076_class {

	public static void main(String[] args) {
	//여기 구현
	/*
	Calc[] calc = new Calc[2];
	calc[0] = new Calc(10, 5, '+');
	calc[1] = new Calc(3, 2, '*');
		
	display(calc);	
	*/
		
	Calc[] nfo = null;
	nfo = new Calc[2];
	nfo[0]=new Calc(10, 5, '+');
	nfo[1]=new Calc(3, 2, '*');
	
	display(nfo);
	
	}// end main	
	
	public static void display(Calc[] nfo) {
		for (int i=0; i<nfo.length; i++) {
			nfo[i].prn();
		}
		
	}// end display
	
}// end class