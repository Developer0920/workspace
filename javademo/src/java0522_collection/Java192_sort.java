package java0522_collection;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * map 쪽 애들은 collection을 구현하지 않으므로.. put같은 걸로 데이터 입력
 * HashMap을 많이 사용. 비동기화처리 되기 때문.
 * oracle과 연계 시 사용하게 된다.
 */
public class Java192_sort {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1, 3, 5, 2, 4}; //Integer배열을 생성
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(arr));
		// import후, ArrayList 객체를 생성. 왜? 메소드를 사용하기 위해?
		// List에 대하여..
		
		//클래스 추가
		//오름차순
		aList.sort(new Ascending());
		System.out.println(aList);		
	
		//내림차순
		aList.sort(new Descending());
		System.out.println(aList);
	} //end main()

} //end class
