package java0520_stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Java159_stream {

	public static void main(String[] args) {
	
		InputStream is = System.in;
		//바이트기반 스트림
		
		InputStreamReader ir = new InputStreamReader(is);
		//바이트기반 스트림과 문자기반 스트림을 연결해 주는 역할
		
		
		BufferedReader br = new BufferedReader(ir);
		//문자기반 보조스트림
		//위에 세 줄이 계속 반복. 이걸 한 번에 하는게 scanner. 그리고 형변환을 한방에 할 수 있는 메소드도 제공됨.
		
		int x, y;
		try {
			System.out.println("x:");
			x = Integer.parseInt(br.readLine());
			System.out.println("y:");
			y = Integer.parseInt(br.readLine());
			System.out.printf("%d + %d = %d\n", x, y, x+y);
		} catch (NumberFormatException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} finally {
			try {
				br.close(); //이렇게 한 번에 할 수도 있음
				ir.close();
				is.close();
			} catch (IOException e) {				
				e.printStackTrace();
			}	
			
		}
		
	}// end main()

}// end class
