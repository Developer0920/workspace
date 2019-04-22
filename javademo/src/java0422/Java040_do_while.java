package java0422;

/*
 * do{
 * 	수행할 문장;
 * }while(조건식);
 * 
 * 수행할 문장 적어도 한 번은 수행된다.
 */

public class Java040_do_while {

	public static void main(String[] args) {
		char chk = 'y';
		
		do {
			System.out.println("주문하시겠습니까?(y/n");
		}while(chk=='n');
		

	}// end mail()

}// end class
