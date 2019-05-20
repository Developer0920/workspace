package java0520_stream;
//직접적으로 목적지에 연결할 수 없는 것

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class Java164_stream {

	public static void main(String[] args) {
		FileReader fr = null;
		//라인번호를 출력할 수 있는 메소드를 제공하는 스트림이다.
		LineNumberReader nr = null;
		try {
			fr = new FileReader("src/java0520_stream/score.txt"); //파일 연결
			nr = new LineNumberReader(fr); //직접적으로  파일과 LineNumberReader()를 연결할 수 없으므로 이렇게 간접적으로 연결
			String line="";
			//1. nr.readLine()가 리턴문자열을 line 변수에 대입
			//2. line변수의 문자열과 null을 비교
			while((line=nr.readLine())!=null) { //readLine()은 파일의 끝에서 null을 리턴함
				System.out.printf("%d: %s\n", nr.getLineNumber(), line);			
			}
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} finally {
			try {
				nr.close();
				fr.close();
			} catch (IOException e) {			
				e.printStackTrace();
			}			
		}
		
	} //end main()

} //end class
