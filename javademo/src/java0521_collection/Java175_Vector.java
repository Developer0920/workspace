/*
[프로그램 출력결과]
kim    56  78   12  146
hong   46  100  97  243
park   96  56   88  240
*/

//package문
package java0521_collection;

//import문
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

//실행 클래스
public class Java175_Vector {
	//메인메소드
	public static void main(String[] args) {
		String sn = "./src/java0521_collection/score.txt";
		
		Vector<Sawon> vt = lines(sn);
		//lines()메소드를 이용하여 Vector객체를 생성한다.
		
		prnDisplay(vt);
		
	}// end main()
	
	
	//메소드 : Vector객체를 만드는 메소드
	private static Vector<Sawon> lines(String fileName) {
		// strName 매개변수의 값을 이용해서 Vector에 데이터를 저장한후
		// 리턴하는 프로그램을 구현하시오.
		
		Vector<Sawon> vt = new Vector<Sawon>();
		//Vector객체를 생성하여 참조변수 vt에 주소값을 저장하라.
		//Sawon 자료형만 다룰 것이므로 Sawon으로 지네릭스 선언
				
		try {
			Scanner sc = new Scanner(new File(fileName));
			//1.파일을 다루기 위해 파일 객체를 생성한다.
			//2.파일로부터 문자데이터를 읽어오기 위해 스캐터 객체를 생성
			
			//한 라인씩 읽어어서 작업할 것이다.
			while(sc.hasNextLine()) {
				//읽어올 데이터가 있느냐?
				
				String stn = sc.nextLine();
				//nextLine()메소드로 한 줄을 읽어서, stn변수에 넣어라.
				//next는 공백이 있으면 그걸 구분자로 하여 하나를 가져옴. 지금 같은 경우 공백이 없으므로 둘 다 상관없다.
				//kim:56/78/12
				//hong:46/100/97
				//park:96/56/88
				
				String[] data = stn.split("[:/]");
				//읽어온 데이터를 :또는 /를 구분자로 하여 쪼갠 후, String 배열 data에 저장하라.
				
				Sawon sn = new Sawon(data[0],
						Integer.parseInt(data[1]),
						Integer.parseInt(data[2]),
						Integer.parseInt(data[3]));
				//String 배열 data의 각 요소를 인자로 하여, Sawon 객체를 생성하라.
				
				vt.add(sn);
				//Sawon 자료형을 다루는, vt가 참조하는 Vector객체에, 위에서 생성한 Sawon 객체를 추가한다.
			}
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}			
		return vt;
	}//end lines()
	
	//메소드 : 출력
	private static void prnDisplay(Vector<Sawon> vt) {
		// vt에 저장된 객체들을 출력결과와 같이 프로그램을 구현하시오.
		
		for(Sawon s : vt) {
		// vt가 참조하는 Vector객체의, Sawon요소의 처음부터 끝까지 다음을 수행하라.
			System.out.println(s.toString());
		}
	}//end prnDisplay()
	
}// end class
