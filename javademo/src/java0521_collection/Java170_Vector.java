package java0521_collection;
//자, 이제 컬렉션이다.
//자료구조 리스트를 처리할 수 있는 것 중에 벡터가 제공됨. 요샌 벡터를 그렇게 많이 쓰지 않음.
//초창기 배열을 대체했던 게 벡터.
//자료구조를 처리할 수 있도록 자바에서 구현해 놓은 클래스들을 컬렉션이라고 하는 것.
//add메소드를 이용해서 자료저장. 가져올 때는 get메소드
//가져오는 방식에는 두 가지. get은 복사해서 가져오는 것. 근데.. 컬렉션 중에 완전히 꺼내오는 게 있다. copy와 꺼내오는 걸 구분해야 한다.
import java.util.Vector;

/*
 * 배열에서... 배열은 크기를 변경할 수 없는 단점이 있음. 하지만 컬렉션은 가능하다.
 * 대표적인 컬렉션. 벡터.
 */

public class Java170_Vector {

	public static void main(String[] args) {
		Vector v = new Vector();
		//Integer -> Object : up-casting 이 발생되서 저장됨.
		v.add(new Integer(10)); //타입이 오브젝트임. 오브젝트를 상속받아서..
		v.add(new Integer(20));
		v.add(new Integer(30));
		
		//int -> Integer -> Object
		v.add(40); //auto boxing이 일어남. 업캐스팅이 발생되서.. ㅅㅂ 뭔말이냐.
		
		//Object -> Integer : down-casting
		//Integer it1 = v.get(0); //오류가 뜬다. 자료형이 맞지 않기 때문이다. 따라서 다운캐스팅을 해줘야 한다.
		Integer it1 = (Integer)v.get(0);
		Integer it2 = (Integer)v.get(1);
		Integer it3 = (Integer)v.get(2);
		Integer it4 = (Integer)v.get(3);
		
		/*
		System.out.println(v.get(0)); //add 순서대로 인덱스가 붙는다. //Integer가 아니라 Object임
		System.out.println(v.get(1));
		System.out.println(v.get(2));
		*/
		
		System.out.println(it1); //숫자가 출력된 것
		System.out.println(it2);
		System.out.println(it3);
		System.out.println(it4);
		
	} //end main()

} //end class
