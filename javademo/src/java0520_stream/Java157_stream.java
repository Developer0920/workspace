//package문
package java0520_stream;

//import문
import java.io.IOException;
import java.io.InputStream;

//class
public class Java157_stream {
	
	//carriage return : 줄의 처음으로 이동(13)
	//line feed : 다음 줄로 이동(10)

	
	//메인메소드
	public static void main(String[] args) {
		System.out.println("데이터입력:");
		InputStream is = System.in; 
		int data;
		
		//다 읽어오려면 반복문을 이용해야
		
		/*
		try {
			while(is.read()!=13) { //개행문자는 13
				System.out.println((char)is.read());
				//b만 나옴. a는 13이 아니므로, 아래 문장 수행. 근데 아래 is.read()에서 b를 읽음. 즉, 비교하는 것과  출력하는 것이 다르다.
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		*/
		
		try {
			while((data = is.read())!=13) { 
				System.out.println((char)data); //이렇게 해야 나온다.
			}
		} catch (IOException e) {		
			e.printStackTrace();
		} finally {
			try {
				//stream 연결 종료(자원 반납)
				is.close();
				/*콘솔과 스트림의 연결을 시킨 상태에서.. 다양한 자원들을 사용했을 것임. 다 끝났으면 이 자원들을 원상복구시켜놔야. 자원반납절차.*/
			} catch (IOException e) {				
				e.printStackTrace();
			} 
		}		
	}//end main()
}// end class

/* 하지만.. 한 바이트씩 갖고 오면 속도가 느리다. 한 번에 읽어오는 게 빠르다. */
