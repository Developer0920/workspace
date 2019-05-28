//입출력 대상 : 파일

//package문
package java0520_stream;

//import문
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//클래스
public class Java162_stream {
	//메인메소드
	public static void main(String[] args) {
		File file = new File("sample.txt");
		//파일과 디렉토리를 다루기 위해 File객체를 생성
		//안에 있는 내용을 읽어보는 게 아니라 기본적인 파일의 정보를 가져온다.
		//파일을 찾는 위치는 여기선 javademo
				
		System.out.println(file.exists()); //파일이 존재하는지 검사
		System.out.println(file.isFile()); //파일인지 검사
		System.out.println(file.length()); //파일의 길이를 반환
				
		//파일에 내용 쓰기
		FileWriter fw = null;
		//파일에 내용을 쓰기 위한 FileWriter 객체를 담을 변수 선언
		
		try {
			fw = new FileWriter("sample.txt", true);
			//파일에 내용을 쓰기 위해 FileWriter객체를 생성하여 fw 변수에 담아라.
			//이때, 파일이 없는 경우 자동적으로 파일을 만들어 준다.
			//mode의 값이 true이면 append이고, false이면 update이다.
			//mode의 값을 생략하면 기본값이 false이다.
			
			fw.write("java\n");
			//파일에 "java\n" 을 써라.
			//근데 안 써진다. 왜냐하면 일단 버퍼에 저장되고(써지고), 이걸 flush를 시켜줘야 한다.
			//버퍼를 flush 시켜준다는 건 버퍼의 내용을 다른 대상에 써주고 버퍼에 있는 내용을 깨끗이 해주는 것
			fw.flush(); //오.. 지린다!
			fw.write("jsp\n");
			fw.flush(); //나중에 한꺼번에 해도 괜찮음
			fw.write(97+"\n"); //97은 유니코드로 인식함. "\n"을 붙이면 문자로 인식함. 자동 형변환.
			fw.flush();
			fw.close();
						
			//fw.write("spring");		
			//fw.flush();
			//안 써짐. 이미 연결이 끊어졌기 때문이다. 다시 쓸려면, new해서 FileWriter객체를 생성해야.	
			//file write는 기본이 update다. true이면 append로 인식.
			
		} catch (IOException e) {			
			e.printStackTrace();
		}		
		
	} //end main()

} // end class
