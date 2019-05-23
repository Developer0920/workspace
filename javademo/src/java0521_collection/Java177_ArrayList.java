package java0521_collection;

import java.util.ArrayList;

public class Java177_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		prnDisplay(aList);		

	}//end main()
	
	public static void prnDisplay(ArrayList<String> aList) {
		//aList매개변수의 요소에서 'j'가 포함되어 있는 요소만 출력하는 프로그램 구현
		
		for(String sn : aList) {
			if(sn.contains("j")) { //이런 메소드를 어떻게 다 기억하냐????.....
				System.out.println(sn);
			}				
		}
		
	}//end prnDisplay()

} //end class