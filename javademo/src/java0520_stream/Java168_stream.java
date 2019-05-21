package java0520_stream;
//파일을 생성해보자.
import java.io.File;
import java.io.IOException;

public class Java168_stream {

	public static void main(String[] args) {
		File file = new File("src/java0520_stream/text.txt");
		//test.txt파일이 존재하지 않으면
		if(!file.exists()) {			
			try {
				file.createNewFile(); //와.. 파일이 생성돼 버리네
				System.out.println("파일생성");
			} catch (IOException e) {				
				e.printStackTrace();
			}			
		} else {
			//파일이 존재하면 삭제해보자.
			file.delete();
			System.out.println("파일 삭제");
		}		
		//글 삭제 전에 반드시 첨부파일을 삭제해야 한다. 안 그러면 불필요한 파일이 저장공간에 쌓이게 됨.
		
	} //end main()

} //end class
