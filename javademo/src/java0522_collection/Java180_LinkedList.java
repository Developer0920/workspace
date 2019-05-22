package java0522_collection;

import java.util.ArrayList;
import java.util.LinkedList;

//연결리스트를 이용해서 데이터를 처리해 주는 컬렉션들

/*
 * 1 배열 구조로 데이터 관리 : Vector, ArrayList
 * 						ArrayList -추가- (순차적으로 처리할 때 사용)
 * 2 링크로 데이터 관리 : LinkedList
 * 					삽입, 삭제 - (비순차적으로 처리할 때 사용)
 * 3 List을 구현해 놓은 컬렉션
 * 	Vector, ArrayList, LinkedList는 add()해준 순서대로 데이터를 관리해줌.
 * 
 */
public class Java180_LinkedList {

	public static void main(String[] args) {
		//LinkedList가 어떻게 만들어 지는지 보자.
		
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("spring"));
		for(String sn : aList)
			System.out.println(sn);
		
		//위에 걸 LinkedList로 해보자.
		System.out.println("//LinkedList////////////////////////////////////");
		LinkedList<String> aNode = new LinkedList<String>();
		//데이터 추가
		aNode.add(new String("java"));
		aNode.add(new String("jsp"));
		aNode.add(new String("spring"));
		
		for(int i=0; i<aNode.size(); i++)
			System.out.println(aNode.get(i));
		
		//삽입
		aNode.add(1, new String("ajax"));
		System.out.println(aNode);
		
		//삭제
		aNode.remove(2);
		System.out.println(aNode);
		
		
	} //end main()

} //end class
