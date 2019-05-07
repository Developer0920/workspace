package java0507_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//checked exception
public class Java153_exception {

	public static void main(String[] args) {
		File file = new File("sample.txt");
		/*
		try {
		//FileNotFoundException은 checked exception이다.
		//반드시 try~catch~finally(예외처리)를 해야 한다.
		//throws는 예외처리를 할 메소드는 떠넘기는 것?
			FileReader fr = new FileReader(file); //checked exception 이므로 반드시 사용하는 곳에서 예외처리를 해줘야 함.			
		} catch(FileNotFoundException e) {
			System.out.println(e); //e랑 e.toString()과 같음
		}
		*/
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//보통 떠넘기기(throws)를 하는 이유는.. 양쪽에서 다 해야 하는 경우. 호출하는 쪽에서 하도록 떠넘기고 있음.
		
	} //end main()

} //end class
