//package문
package java0520_stream;

//import문
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

//클래스
public class Java159_stream {
	//메인메소드
	public static void main(String[] args) {
	
		InputStream is = System.in;
		//콘솔창을 읽어오기 위한 목적으로, 바이트기반 스트림과 콘솔창을 연결
		
		InputStreamReader ir = new InputStreamReader(is);
		//InputStreamReader는 바이트기반 스트림과 문자기반 스트림을 연결해 주는 역할		
		
		BufferedReader br = new BufferedReader(ir);
		//BufferedReader는 문자기반 보조스트림
		//위에 세 줄이 계속 반복. 이걸 한 번에 하는게 scanner. 그리고 형변환을 한방에 할 수 있는 메소드도 제공됨.
		
		int x, y;
		try {
			System.out.println("x:");
			x = Integer.parseInt(br.readLine());
			//콘솔창에 입력된 한 줄을 읽어와서 Integer로 형변환(?)
			//parseInt가 static이므로 '클래스명.메소드()' 방식으로 사용
			System.out.println("y:");
			y = Integer.parseInt(br.readLine());
			System.out.printf("%d + %d = %d\n", x, y, x+y);
		} catch (NumberFormatException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		//반납	
		} finally {
			try {
				br.close();
				ir.close();
				is.close();
				//이렇게 한 번에 할 수도 있음
			} catch (IOException e) {				
				e.printStackTrace();
			}				
		}		
	}// end main()
}// end class
