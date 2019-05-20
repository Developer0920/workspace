package java0520_stream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//입출력 대상 : 파일
public class Java162_stream {

	public static void main(String[] args) {
		File file = new File("sample.txt"); //안에 있는 내용을 읽어보는 게 아니라 기본적인 파일의 정보를 가져온다. //파일 찾는 위치는 어디일까? javademo임
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.length()); //파일의 길이
		
		//내용을 읽어오거나 쓰고 싶을 때
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("sample.txt", true); //파일과 스트림 연결함 //언제 생성이 된 거지? //writer일 때는 파일이 없는 경우 자동적으로 파일을 만들어 준다.
			//mode의 값이 true이면 append이고
			//mode의 값이 false이면 update이다.
			//mode의 값을 생갹하면 기본값이 false이다.
			
			fw.write("java\n"); //근데 안 써진다. 왜냐하면.. 일단 버퍼에 저장되고(써지고), 이걸 flush를 시켜줘야 한다.
								//버퍼를 flush 시켜준다는 건 버퍼의 내용을 다른 대상에 써주고 버퍼에 있는 내용을 깨끗이 해주는 것
			fw.flush(); //오.. 겁나 신기하다!!
			fw.write("jsp\n");
			fw.flush(); //나중에 한꺼번에 해도 괜찮음
			fw.write(97+"\n"); //97은 유니코드로 인식함. "\n"을 붙이면 문자로 인식함. 자동 형변환.
			fw.flush();
			fw.close();
			
			//fw.write("spring"); // 안 써짐. 이미 연결이 끊어졌기 때문이다. 다시 쓸려면, new해서 객체 생성해야.			
			//fw.flush();
			//file write는 기본이 update다. true이면 append로 인식
			
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		
	} //end main()

} // end class