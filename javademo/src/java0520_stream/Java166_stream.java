//임의의 위치로 가서 쓰기

//package문
package java0520_stream;

//import문
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

//실행클래스
public class Java166_stream {
	//메인메소드
	public static void main(String[] args) {
		File file = new File("src/java0520_stream/song.txt");
		//파일을 다루고 싶으니 file객체를 생성하고, file 변수에 그 주소값을 저장해라.
		
		RandomAccessFile raf = null;
		//RandomAccessFile 객체를 저장할 변수raf를 만들어라.
		String stn = new String("\r\nMarron 5 - Daylight, Sunday Morning\r\n");		
		//String 객체를 생성하라.
		try {
			raf = new RandomAccessFile(file, "rw");
			//RandomAccessFile객체를 생성하고, 해당 주소값을 raf변수에 저장하라.
			//쓰기까지 할 것이므로 rw로 만들어라.
			
			
			//파일의 끝 부분에 stn에 저장된 String형식의 데이터를 쓰기 위한 작업			
			//1.
			long size = raf.length();
			//song.txt파일의 총 길이를 리턴하고, size 변수에 저장하라.	
			
			//2.
			raf.seek(size);
			//파일의 끝으로 포인터를 이동시켜라.
			
			//3.
			raf.writeBytes(stn); //지렸다...
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} 
		
	} //end main()

} //end class
