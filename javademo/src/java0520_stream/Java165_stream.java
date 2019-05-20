package java0520_stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

//그동안은 순차적으로 접근. 이젠 임의로.
public class Java165_stream {

	public static void main(String[] args) {
		File file = new File("src/java0520_stream/score.txt");
		RandomAccessFile raf = null;
		
		try {
			// "r" : 읽기(read)만 가능
			// "rw" : 읽기(read) 쓰기(write)가 가능하다.
			
			raf = new RandomAccessFile(file, "r");
			
				System.out.println(raf.getFilePointer()); //0 //현재 위치를 포인터라고 함. DB에서는 커서
				System.out.println((char)raf.read()); //k
				System.out.println(raf.getFilePointer()); //1
				System.out.println(raf.readLine()); //im:56/78/12
				System.out.println(raf.getFilePointer()); // 14 --- 줄바꿈이 \r\n 이기 때문
				String line = raf.readLine(); //다음 한 줄을 읽어 옴
				System.out.printf("%s &d\n", line, line.length());
				System.out.println(raf.getFilePointer());
				
				//뒤로 빠꾸하는 걸 알아보자.
				//포인터의 위치를 변경한다.(파일 처음부터 포인터를 찾는다)
				raf.seek(4); // seek는 무조건 처음으로 가서 찾음.
				System.out.println(raf.readLine()); //56/78/12 --- 4지점부터 한 라인 읽어봐라.
				//현재 위치를 기준으로 읽어보는 방법
				//지정된 수 만큼 byte을 건너뛴다.(현재 포인터가 있는 위치를 기준으로 건너뛴다)
				raf.skipBytes(2); //현재위치를 기준으로 두 칸 이동 //왼쪽으로는 이동할 수없음. 따라서 -값을 주면 그냥 아무것도 안 함.
				System.out.println(raf.readLine()); //ng:46/100/97
				
				
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
