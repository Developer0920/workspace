//package문
package java0520_stream;

//import문
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//class
public class Java158_stream {
	
	//목적은 한 라인씩 읽어오는 것이다.

	public static void main(String[] args) {
		System.out.println("데이터 입력:");
		
		InputStream is = System.in;
		//콘솔창을 읽어오기 위한 목적으로, 바이트기반 스트림 InputStream과 콘솔창을 연결		
		
		InputStreamReader ir = new InputStreamReader(is);
		//InputStreamReader는 바이트기반 스트림과 문자기반 스트림을 연결시켜주는 역할
		
		BufferedReader br = new BufferedReader(ir);
		//BufferedReader는 문자기반 보조스트림
		//여기서 is를 생성자에 넣어주면 에러가 뜸.
		//BufferedReader는 목적지(콘솔창)에 직접연결할 수 없으므로 이런 식으로 간접연결하는 것
		
		try {
			String data = br.readLine();
			//입력데이터를 한 라인씩 읽어와서 리턴
			//바로 readLine()메소드를 쓰기 위해 위에서 작업을 했던 것
			//readline()메소드는 스트링으로 리턴. 따라서 계산시 형변환 시켜줘야.
			
			System.out.println(data);
		} catch (IOException e) {			
			e.printStackTrace();
		} finally {
			//가장 최근에 연결한 걸 먼저 반납해야.
			//DB로 가게 되연 이 닫는 게 아주 중요. 연결 종료를 안 해주면 DB는 클라인트가 계속 접근하고 있다고 인식
			try {
				br.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}			
			try {
				ir.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
			try {
				is.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}
		}
		
	}// end main()
}// end class
