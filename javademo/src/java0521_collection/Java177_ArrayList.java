//package문
package java0521_collection;

//import문
import java.util.ArrayList;

//실행 클래스
public class Java177_ArrayList {
	//메인 메소드
	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		prnDisplay(aList);		

	}//end main()
	
	
	//aList매개변수의 요소에서 'j'가 포함되어 있는 요소만 출력하는 프로그램 구현
	//메소드
	public static void prnDisplay(ArrayList<String> aList) {
	//static 선언을 하지 않으면, 메인 메소드에서 이 메소드를 바로 호출할 수 없다.
		
		for(String sn : aList) {
		//aList의 각각의 요소에 대하여 다음을 실행하라.
			if(sn.contains("j")) {
			//ArrayList클래스의 contains()메소드 : aList의 요소가 "j"를 포함하고 있으면 true를 없으면 false를 반환
				System.out.println(sn);
			}				
		}
		
	}//end prnDisplay()

} //end class
