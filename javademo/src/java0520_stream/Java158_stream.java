package java0520_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Java158_stream {

	public static void main(String[] args) {
		System.out.println("데이터 입력:");
		//바이트스트림
		InputStream is = System.in;
		
		//바이트스트림과 문자스트림 연결
		InputStreamReader ir = new InputStreamReader(is);
		
		//문자스트림
		BufferedReader br = new BufferedReader(ir); //is라는 객체를 생성자에 넣어주면 애러가 뜸. 자료형이 서로 다르기 때문(?)
		
		//한 라인을 읽어올 수 있는..
		try {
			//입력데이터를 한 라인씩 읽어와서 리턱
			String data = br.readLine(); //readline()기본적으로 스트링. 따라서 계산시 형변환 시켜줘야
			System.out.println(data);
		} catch (IOException e) {			
			e.printStackTrace();
		} finally { //가장 최근에 연결한 걸 먼저 반납해야. //DB로 가게 되연 이 닫는 게 아주 중요. 연결 종료를 안 해주면 DB는 클라인트가 계속 접근하고 있다고 인식
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
