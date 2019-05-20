package java0520_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

//임의의 위치로 가서 쓰기
public class Java166_stream {

	public static void main(String[] args) {
		File file = new File("src/java0520_stream/song.txt");
		RandomAccessFile raf = null;
		String stn = new String("\r\nMarron 5 - Daylight, Sunday Morning\r\n");
		try {
			raf = new RandomAccessFile(file, "rw"); //쓰기까지 할 것이므로 rw로
			//song.txt파일의 총 길이를 리턴한다.			
			long size = raf.length();
			//파일의 끝으로 포인터를 이동
			raf.seek(size);
			raf.writeBytes(stn); //지렸다...
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} 
		
	} //end main()

} //end class
