package java0419_statement;

/*
 * 조건식을 만족할 때만 수행할 문장이 있는 경우
 * if(조건식){
 * 	수행할 문장;
 * }
 */
public class Java018_if {

	public static void main(String[] args) { //1 (1)
		//int num = 10; //2
		int num = -4; //(2)
		
		if(num>0) { //3 (3)
			System.out.printf("%d는(은) 자연수입니다.\n" ,num); //4
		}

		System.out.println("program end"); //5 //(4)
		
	} //end main() //6 (5)

}// end class
