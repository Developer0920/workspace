package java0522_collection;

import java.util.HashSet;

//hash는 순서 유지가 안 됨
//map을 상속. element만 넣는 것과 달리, key와 value를 넣어줘야.
public class Java185_hashSet {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(new Integer(10));
		set.add(new Integer(20));
		set.add(new Integer(30));

		for(Integer it : set)
			System.out.println(it);
		

	} // end main()

} // end class
