package java0522_collection;

import java.util.Iterator;
import java.util.TreeSet;

// tree가 들어가면 정렬을 해준다는 것
// set이 들어가면 중복된 값이 들어갈 수 없음.
// TreeSet : 오름차순 정렬, 중복 안됨

public class Java184_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> tree = new TreeSet<Integer>();
		tree.add(new Integer(10));
		tree.add(new Integer(40));
		tree.add(new Integer(20));
		tree.add(new Integer(30));
		tree.add(new Integer(30));
		
		System.out.println("==오름차순=======================");
		/*
		for(Integer it : tree)
			System.out.println(it); //정렬이 돼서 나온다. 오름차순. 그리고 중복이 안 됨.
		//내림차순은 descending.. 메소드 사용
		*/
		Iterator<Integer> ita = tree.iterator();
		while(ita.hasNext())
			System.out.println(ita.next());
		
		System.out.println("==내림차순================");
		Iterator<Integer> ite = tree.descendingIterator();
		while(ite.hasNext())
			System.out.println(ite.next());

	} //end main()

} //end class
