package java0507_exception;
//개발자를 위해서 나온 것
public class Java149_exception {

	public static void main(String[] args) {
		int[] num = new int[3];
		
		try { //예외가 발생할 가능성이 있는 문장
			num[7] = 10;
			System.out.println(num[7]); //여기서 예외발생여부 확인. 예외발생 시 catch -> finally 로, 안 발생 시 finally로
			return; //리턴이 있어도 finally로 수행함.
		} catch (ArrayIndexOutOfBoundsException ex){
			System.out.println(ex.getMessage());
		} finally {
			System.out.println("program end");
		}
	} //end main(0

} //end class
