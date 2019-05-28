/*
벡터에서 불편한 점. 꺼내올 때마다 내가 원하는 형태로 다운캐스팅을 해줘야 한다. 계속 반복해서.
귀찮다. 그냥 꺼내올 수 있게 해달라. 응. 알았어. 지네릭스를 만들었어.

컬렉션 클래스를 선언하고 생성할 때 제너릭을 선언한다.
지네릭스(generics) : 컬렉션 클래스에 저장된 객체를 가져올 때 다운캐스팅하는 작업을 생략할 수 있도록 제공해주는 기능이다.

배열 : length키워드
문자열 : length()메소드
컬렉션 : size()메소드
*/


//package문
package java0521_collection;

//import문
import java.util.Vector;

//실행클래스
public class Java172_Vector {
	//메인메소드
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		//Vector객체를 생성하고 v에 해당 주소값을 저장하라.
		//String만 다룰 것이다.(지네릭스 선언)
		
		v.add(new String("java"));
		//지네릭스로 String을 선언했으므로 String만 객체v에 들어갈 수 있다. 
		v.add(new String("jsp"));
		v.add(new String("spring"));
		
		//일반반복문
		System.out.println("////일반 반복문////");
		for(int i=0; i<v.size(); i++) {
			String data = (String)v.get(i); //(String)을 지워도 된다. 지네릭스 때문이다.
			System.out.println(data);
		}
				
		//개선된 루프
		System.out.println("////개선된 반복문////");		
		for(String st : v)
		//for(데이터타입 변수 : 배열 or 컬렉션)
		//v의 index 0부터 끝까지  다음을 실행하라.
			System.out.println(st);
		
		
		//벡터에 10 10.4 4.8f 를 넣고자한다. integer, double, float의 상위클래스는 number
		Vector<Number> vt = new Vector<Number>();
		
		vt.add(new Integer(10));
		//Integer -> Number -> Object (업캐스팅)
		
		vt.add(new Double(10.4));
		//Double -> Number -> Object (업캐스팅)		
		
		vt.add(new Float(4.8f));
		//Float -> Number -> Object (업캐스팅)
		
				
		//instanceof : 객체만 비교할 수 있는 연산자		
		for(Number ne : vt) {
		//vt의 index 0부터 끝까지 다음을 실행하라.
			if(ne instanceof Integer) {
			//vt i번째가 Integer형이면 다음을 실행하라.
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
		
	} //end main()

} //end class
