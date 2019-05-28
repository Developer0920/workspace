//package문
package java0520_stream;

//import문
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//실행클래스
public class Java163_stream {
	//메인메소드
	public static void main(String[] args) {
		File file = new File("sample.txt");
		//파일과 디렉토리를 다루기 위해 File객체를 생성
		FileReader fr = null;
		//파일의 내용을 읽기 위한 FileReader 객체를 담을 변수 선언
		
		int data;
		
		try {
			fr = new FileReader("sample.txt");
			//파일의 내용을 읽기위한 FileReader객체를 생성
			
			while((data=fr.read())!=-1) {
			//FileReader의 read 메소드는 더 이상 읽어올 내용이 없을 때 -1값을 리턴한다.
				System.out.print((char)data);
				//read()메소드는 int를 반환하므로 char로 형변환
				//이미 예외처리가 돼 있으므로 catch만 쓰면 됨. 다중 catch.			
			}			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}		

	} //end main()

} //end class
