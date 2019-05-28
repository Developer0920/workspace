//파일 생성하기

//package문
package java0520_stream;

//import문
import java.io.File;
import java.io.IOException;

//실행클래스
public class Java168_stream {
	//메인메소드
	public static void main(String[] args) {
		File file = new File("src/java0520_stream/text.txt");
		//파일을 다루고 싶으니 파일 객체를 생성하라.
		
		if(!file.exists()) {
			//test.txt파일이 존재하지 않으면
			
			try {
				file.createNewFile();
				//파일을 생성하라. //와.. 파일이 생성돼 버리네..
				System.out.println("파일생성");
			} catch (IOException e) {				
				e.printStackTrace();
			}			
		} else {
			//파일이 존재하면
			file.delete();
			//파일을 삭제하라.
			System.out.println("파일 삭제");
		}		
				
	} //end main()

} //end class
