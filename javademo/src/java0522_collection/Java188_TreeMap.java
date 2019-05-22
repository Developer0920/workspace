package java0522_collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

/*
 * TreeMap
 * 1 Map인터페이스를 구현한 클래스이다.
 * 2 정렬을 제공하는 클래스이다.
 * 
 */
public class Java188_TreeMap {
	public static void main(String[] args) {
		TreeMap<Integer,String> tree = new TreeMap<Integer, String>();
		tree.put(10, "java");
		tree.put(30, "spring");
		tree.put(20, "jsp");
		
		Set<Integer> set = tree.keySet();
		Iterator<Integer> ite = set.iterator();
		while(ite.hasNext()) {
			Integer key = ite.next();
			System.out.printf("%d:%s\n", key, tree.get(key)); //키를 기준으로 정렬이 된다.
		}
		

	}// end main()

}
