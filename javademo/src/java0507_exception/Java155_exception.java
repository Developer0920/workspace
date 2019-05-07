package java0507_exception;
//사용자 정의 예외처리
class UserException extends Exception{
	public UserException(String message) {
		super(message);
	}
	
	
} //end class


public class Java155_exception {

	public static void main(String[] args) {
		int data = 9; //근데.. 데이터 값을 9이상만 받고자 함.
		try {
			if(data<10) {
				throw new UserException("10이상만 입력하세요."); //강제 exception
			}
			System.out.println(data);
		} catch (UserException ex) {
			//System.out.println(ex.toString());
			ex.printStackTrace();
		}

	} //end main()

} //end class
