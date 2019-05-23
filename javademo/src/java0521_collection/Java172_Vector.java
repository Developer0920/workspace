package java0521_collection;
/*
 * 배열 : length키워드
 * 문자열 : length()메소드
 * 컬렉션 : size()메소드
 */

import java.util.Vector;

/*
 * 컬렉션 클레스를 선언하고 생성할 때 제너릭을 선언한다.
 * 제너릭(generic) : 컬렉션 클래스에 저장된 객체를 가져올 때 다운캐스팅하는 작업을 생략할 수 있도록 제공해주는 기능이다. * 
 */

//벡터에서 불편한 점. 꺼내올 때마다 내가 원하는 형태로 다운캐스팅을 해줘야 한다. 계속 반복해서.
//귀찮다. 그냥 꺼내올 수 있게 해달라. 응. 알았어. 제너릭을 만들었어.

public class Java172_Vector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>(); //7버전 이후부터는 뒤에 <E>는 생략가능
		v.add(new String("java"));
		v.add(new String("jsp"));
		v.add(new String("spring"));
		
		System.out.println("////일반 반복문////");
		for(int i=0; i<v.size(); i++) {
			String data = /*(String)*/v.get(i); //(String)을 지워도 된다. 제너릭 때문이다.
			System.out.println(data);
		}
		//하지만.. 제너릭은 String만 넣을 수 있다.
		
		//개선된 루프
		System.out.println("////개선된 반복문////");
		//for(데이터타입 변수 : 배열 or 컬렉션)
		for(String st : v)
			System.out.println(st);
		
		//벡터에.. 10 10.4 4.8f 를 넣고자한다. --integer, double, float의 상위클래스는 number
		Vector<Number> vt = new Vector<Number>();
		//Integer -> Number -> Object (업캐스팅)
		vt.add(new Integer(10));
		//Double -> Number -> Object (업캐)
		vt.add(new Double(10.4));
		//Float -> Number -> Object (업캐)
		vt.add(new Float(4.8f));
		
		
		
		
		//instanceof : 객체만 비교할 수 있는 연산자
		
		for(Number ne : vt) {
			if(ne instanceof Integer) { //instanceof Object는 올 수 없다. Number의 자손이 올 수 있음.
				Integer it = (Integer)ne;
				System.out.println(it);
			}else if(ne instanceof Double) {
				Double de = (Double)ne;
				System.out.println(de);
			}else if (ne instanceof Float) {
				Float ft = (Float)ne;
				System.out.println(ft);
			}		
		}
		//it = (integer)vt.get(0); ㅅㅂ 모르겠다ㅋㅋ		
		
	} //end main()

} //end class