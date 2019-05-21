package java0521_collection;

import java.util.ArrayList;

/*
 * Vector와 ArrayList 사용법이 비슷
 * 1 Vector는 동기화 처리가 되어 있고, ArrayList는 비동기화 처리한다.
 * 2 Vector와 ArrayList는 메모리에 요소를 처리할 때 배열의 구조를 따른다.
 * 3 Vector와 ArrayList의 클래스는 처리방법이 비슷한다.
 * 4 Vector와 ArrayList로 수시로 요소의 삽입, 삭제를 처리하는 것은 좋은 방법이 아니다. 왜냐하면.. 삽입 시 다 하나씩 뒤로 밀어야 하고, 삭제를 당겨야 한다.
 */

//차이점은 동기화냐 비동기화냐.

public class Java176_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(new Integer(10));
		aList.add(new Integer(20));
		aList.add(new Integer(30));
		for (int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}
	} //end main()

} //end class
