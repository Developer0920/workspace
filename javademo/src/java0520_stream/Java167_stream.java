package java0520_stream;

import java.io.File;

//디렉토리를 검색해야 하는 경우가 있다..
public class Java167_stream {

	public static void main(String[] args) {
		File file = new File("src/java0520_stream/temp");
		if(!file.isDirectory()) {
			//temp폴더를 생성
			file.mkdir();
			System.out.println("폴더생성"); //와.. 폴더가 생성돼 버리네..
		} else {
			System.out.println("폴더 존재");
		}

	} // end main()

} // end class