package java0522_collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class Java181_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> aNode = new LinkedList<String>();
		//추가
		aNode.add(new String("java"));
		aNode.add(new String("jsp"));
		aNode.add(new String("spring"));
		
		ListIterator<String> ite=aNode.listIterator(); //Iterator는 앞에 있는 요소를 가져오는 건 안됨. 다음 다음 .. 만 가져올 수 있음. previous는 안 된다.
		System.out.println("앞->뒤");
		while(ite.hasNext()) //있니? 그러면 가지고 와라. //커서의 개념으로 접근해야 하나?
				System.out.println(ite.next());
		//이전 껄 갖고와 보자.
		System.out.println("뒤->앞");
		while(ite.hasPrevious())
			System.out.println(ite.previous()); //next를 먼저 사용해야만 previous 사용 가능
		
	} //end main()

} //end class
