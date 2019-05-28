//그동안은 순차적으로 접근. 이젠 임의로 접근해보자.

//package문
package java0520_stream;

//impot문
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

//실행클래스
public class Java165_stream {
	//메인메소드
	public static void main(String[] args) {
		File file = new File("src/java0520_stream/score.txt");
		//파일을 다루기 위해 file객체를 생성
		
		RandomAccessFile raf = null;
		//RandomAccessFile객체를 담을 변수를 만들어라.
		
		try {
						
			raf = new RandomAccessFile(file, "r");
			//RondomAccessFile객체를 생성하여 raf변수에 담아라.
			// "r" : 읽기(read)만 가능
			// "rw" : 읽기(read), 쓰기(write) 둘 다  가능
			
				System.out.println(raf.getFilePointer()); //결과값:0
				//getFilePointer()메소드는 현재 포인터(커서) 위치를 반환
				System.out.println((char)raf.read()); //결과값:k				
				System.out.println(raf.getFilePointer()); //결과값:1
				System.out.println(raf.readLine()); //결과값:im:56/78/12
				System.out.println(raf.getFilePointer()); //결과값:14. 왜냐하면 줄바꿈이 \r\n 이기 때문
				String line = raf.readLine(); //다음 한 줄을 읽어 옴
				System.out.printf("%s %d\n", line, line.length()); //결과값:hong:46/100/97 14
				System.out.println(raf.getFilePointer()); //결과값:30
				
				//포인터의 위치를 뒤로 보내는 방법
				raf.seek(4);
				//포인터의 위치를 4로 설정한다.(파일 처음부터 계산함. 0부터 시작.)				
				
				System.out.println(raf.readLine()); //결과값:56/78/12
				//4지점부터 한 라인 읽어옴
				
				//현재 위치에서 건너뛰는 방법
				
				raf.skipBytes(2);
				//현재 포인터가 있는 위치를 기준으로 지정된 수 만큼 byte을 건너뛴다.
				//현재위치를 기준으로 2byte 이동해라.
				//왼쪽으로는 이동할 수없음. 따라서 -값을 주면 그냥 아무것도 안 함.
				System.out.println(raf.readLine()); //결과값:ng:46/100/97				
				
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} finally {
			try {
				raf.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}

	} //end main()

} //end class
