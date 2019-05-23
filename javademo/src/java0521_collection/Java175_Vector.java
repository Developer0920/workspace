package java0521_collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

/* [프로그램 출력결과]
kim    56  78   12  146
hong   46  100  97  243
park   96  56   88  240
*/

public class Java175_Vector {

	public static void main(String[] args) {
		String sn = "./src/java0521_collection/score.txt";
		Vector<Sawon> vt = lines(sn); //백터라는 컬렉션
		prnDisplay(vt);
	}// end main()
	
	
	///메소드
	private static Vector<Sawon> lines(String fileName) {
		// strName 매개변수의 값을 이용해서 Vector에 데이터를 저장한후
		// 리턴하는 프로그램을 구현하시오.
		
		Vector<Sawon> vt = new Vector<Sawon>();
		Scanner sc;
		try {
			sc = new Scanner(new File(fileName));
			//한 라인씩 읽어봐서 작업해야
			while(sc.hasNextLine()) { //읽어올 데이터가 있느냐?
				String stn = sc.nextLine(); // next는 공백이 있으면 그걸 구분자로 하여 하나를 가져옴. 지금 같은 경우 둘 다 상관없다. 공백이 없으므로
				//kim:56/78/12
				//hong:46/100/97
				//park:96/56/88
				String[] data = stn.split("[:/]");
				Sawon sn = new Sawon(data[0],
						Integer.parseInt(data[1]),
						Integer.parseInt(data[2]),
						Integer.parseInt(data[3]));
				vt.add(sn);
			}
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}			
		return vt;
	}//end lines()
	
	///메소드
	private static void prnDisplay(Vector<Sawon> vt) {
		// vt에 저장된 객체들을 출력결과와 같이 프로그램을 구현하시오.
		for(Sawon s : vt) {
			System.out.println(s.toString());
		}
	}//end prnDisplay()
	
}// end class