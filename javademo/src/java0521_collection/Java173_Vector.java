package java0521_collection;

import java.util.Vector;

/*
 * 홍길동 30
 * 이영희 25
 */

//자료구조를 구현해 놓은 클래스들을 컬렉션이라고 한다.
//컬렉션을 안 쓰면, 우리가 원하는 형태대로 데이터를 다루기 위해서 직접 구현해야 한다.
public class Java173_Vector {

	public static void main(String[] args) {		
		/*
		Person p1 = new Person("홍길동", 30);
		Person p2 = new Person("이영희", 25);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		*/
		
		//배열을 쓰는 방법
		/*
		Person[] ps = new Person[2];
		ps[0] = new Person("홍길동", 30);
		ps[1] = new Person("이형희", 25);
		for(Person pn : ps)
			System.out.println(pn.toString());
		*/
		//하지만 배열은 크기를 바꿀 수 없음.
		//컬렉션 벡터를 사용
		
		Vector<Person> vt = new Vector<Person>();
		vt.add(new Person("홍길동", 30));
		vt.add(new Person("이영희", 25));
		for(Person pn : vt)
			System.out.println(pn.toString());
		
	} //end main()

} // end class
