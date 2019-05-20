package java0520_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//파일 다루는 거 중요하다. 첨부파일을 다룰 때 입출력 스트림을 써야 함.
public class Java163_stream {

	public static void main(String[] args) {
		File file = new File("sample.txt");
		FileReader fr = null;
		int data;
		
		try {
			fr = new FileReader("sample.txt"); 			
			while((data=fr.read())!=-1) { //FileReader 메소드는 더이상 읽어올 내용이 없을 때 -1값을 리턴한다.
				System.out.print((char)data); //이미 예외처리가 돼 있으므로 catch만 쓰면 됨. 다중 catch				
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
