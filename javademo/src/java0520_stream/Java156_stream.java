package java0520_stream;

import java.io.IOException;
import java.io.InputStream;

/*
입출력 스트림 (입출력을 하기 위한 클래스)
1 java.io.*; 패키지에서 제공한다.
   줄줄흐르다, 줄을지어 이어지다, 줄기, 개울, 시내
2 스트림 : 한 쪽에서 보내준 입력 데이터를 다른 한쪽으로
   출력하는 데이터의 흐름(순서가 있는 데이터의 흐름)

3 자바에서 스트림은 순서 있는 데이터의 일방적인 흐름
4 스트림 종류
   1) 입력/출력
      입력 스트림 : InputStream, Reader
      출력 스트림 : OutputStream, Writer
      
   2)처리 단위로 구분
     바이트 스트림 : 바이트 , 배열바이트, 정수바이트 -- InputStream, OutputStream
     문자 스트림 : 문자, 배열문자, 문자열 -- Reader, Writer

   3)기능에 따라
    데이터 싱크 스트림(데이터 전달 기능)-목적지에 직접연결        
     FileInput(Output)Stream, ByteArrayInput(Output)Stream
     데이터 처리 스트림(데이터의 조작 기능)-목적지에 간접연결
     BufferedInput(Output)Stream    -- 예를 쓰려면.. 데이터 싱크 스트림으로 먼저 연결하고나서 쓰면 된다.
 */

//A는 byte ---------- B는 char.
//두 클래스 간 차이를 조정하여 연결해주는 클래스가 따로 있음
//보내는 건 출력.



public class Java156_stream {

	public static void main(String[] args) {
		System.out.println("데이터입력:");
		
		InputStream is = System.in;
		//콘솔창 목적지에 InputStream으로 연결 //콘솔창을 읽어오기 위한 목적으로 스트림 연결
		
		//int line = is.read(); // 오류발생
		//why? read()에는 throws 되어 있음. 그리고 checked exception이므로 반드시 컴파일 단계에서 예외처리 해줘야.
		//unchecked exception에서는 할 필요 없음.
		
		
		try {			
			int line = is.read();
			//한 바이트를 읽어와 유니코드로 리턴한다. A이면 65로. AB나 한글입력하면 쓰레기값 나옴
			System.out.println(line); //65출력
			System.out.println((char)line); //그대로 A출력
		} catch (IOException e) {			
			e.printStackTrace();
		}		
		
	}//end main()

}// end class
