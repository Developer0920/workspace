//직접적으로 목적지에 연결할 수 없는 것

//package문
package java0520_stream;

//import문
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

//실행클래스
public class Java164_stream {
	//메인메소드
	public static void main(String[] args) {
		FileReader fr = null;
		//파일의 내용을 읽기 위한 FileReader객체를 담을 변수 선언
		
		LineNumberReader nr = null;
		//라인번호를 출력할 수 있는 메소드를 제공하는 스트림이다.
		
		try {
			fr = new FileReader("src/java0520_stream/score.txt");
			//FileReader객체 생성 및 파일 연결
			nr = new LineNumberReader(fr);
			//LineNumberReader는 파일과 직접적으로 연결할 수 없으므로 이렇게 간접적으로 연결
			
			String line="";
			//String형의 line 변수 선언			
			
			while((line=nr.readLine())!=null) {
			//nr.readLine() 반환하는 문자열을 line변수에 대입
			//line변수의 문자열과 null을 비교
			//readLine()은 파일의 끝에서 null을 리턴함
				System.out.printf("%d: %s\n", nr.getLineNumber(), line);			
			}
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} finally {
			try {
				//연결끊기
				nr.close();
				fr.close();
			} catch (IOException e) {			
				e.printStackTrace();
			}			
		}
		
	} //end main()

} //end class
