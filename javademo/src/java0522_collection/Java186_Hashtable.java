package java0522_collection;

import java.util.Enumeration;
import java.util.Hashtable;

/*
 * Hashtable
 * 1 Map인터페이스 구현해 놓은 클래스
 * 2 Map인터페이스 를 구현해 놓은 클래스들은 key, value쌍으로 저장한다.
 * 3 value을 구현해주는 것은 key이므로 key는 중복을 허용하지 않는다.
 * 
 */

public class Java186_Hashtable {

	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		
		table.put(10, "java");
		table.put(20, "jsp");
		table.put(30, "spring");
		
		//가져올 때는 get
		System.out.println(table.get(10));
		System.out.println("==Enumeration==========================");
		Enumeration<Integer> enu=table.keys();
		while(enu.hasMoreElements()) {
			Integer key = enu.nextElement();
			
			System.out.printf("%d:%s\n", key, table.get(key)); //key가 열거됨.
		}
		
		
		
	} //end main()

} //end class
