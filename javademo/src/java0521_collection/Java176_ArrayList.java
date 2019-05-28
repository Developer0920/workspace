/*
 * Vector와 ArrayList 사용법이 비슷
 * 1 Vector는 동기화 처리가 되어 있고, ArrayList는 비동기화 처리한다.(차이점)
 * 2 Vector와 ArrayList는 메모리에 요소를 처리할 때 배열의 구조를 따른다.
 * 3 Vector와 ArrayList의 클래스는 처리방법이 비슷한다.
 * 4 Vector와 ArrayList로 수시로 요소의 삽입, 삭제를 처리하는 것은 좋은 방법이 아니다. 왜냐하면.. 삽입 시 다 하나씩 뒤로 밀어야 하고, 삭제를 당겨야 한다.
 */

//package문
package java0521_collection;

//import문
import java.util.ArrayList;

//실행 클래스
public class Java176_ArrayList {
	//메인 메소드
	public static void main(String[] args) {
		ArrayList<Integer> aList = new ArrayList<Integer>();
		//ArrayList 객체를 생성하고, 참조변수 aList에 해당 주소값을 저장하라.
		//Integer 자료형만 다룰 것이다(지네릭스로 Integer를 선언).
		
		aList.add(new Integer(10)); //add()메소드로 요소 추가
		aList.add(new Integer(20));
		aList.add(new Integer(30));
		
		for (int i = 0; i < aList.size(); i++) {
			System.out.println(aList.get(i));
		}
	} //end main()

} //end class
