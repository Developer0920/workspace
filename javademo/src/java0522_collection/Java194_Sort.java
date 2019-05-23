package java0522_collection;

import java.util.ArrayList;

public class Java194_Sort {

	public static void main(String[] args) {
		ArrayList<Person> ts = new ArrayList<Person>(); //ArrayList 객체를 생성
		ts.add(new Person("홍길동", 40)); //이것들의 의미가 무엇인가?
		ts.add(new Person("가비", 20));
		ts.add(new Person("가비", 30));
		ts.add(new Person("나비", 15));
		ts.sort(new Person()); //이건 왜 이렇게 하는 거지?
		for(Person ps : ts)
			System.out.printf("%s %d\n", ps.getName(), ps.getAge());		

	} //end main()

} //end class
