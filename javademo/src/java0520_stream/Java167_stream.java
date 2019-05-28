//디렉토리 생성하기

//package문
package java0520_stream;

//import문
import java.io.File;

//실행클래스
public class Java167_stream {
	//메인메소드
	public static void main(String[] args) {
		File file = new File("src/java0520_stream/temp");
		//파일을 다루고 싶으니, 파일 객체를 생성하라.		
		
		if(!file.isDirectory()) {
			//디렉토리인지 확인해라.(디렉토리가 없으면 false를 반환함)
			//exists()메소드를 쓸 수도 있음
			
			file.mkdir();
			//디렉토리가 없으면, 폴더를 생성하라.
			//와.. 폴더가 생성돼 버리네..		
			
			System.out.println("폴더생성"); 
			
		} else {
			System.out.println("폴더 존재");
		}
		
	} // end main()

} // end class
