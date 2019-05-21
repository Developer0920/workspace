package java0521_collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

//Enumeration은 Vector와 Hashtable에서만 제공이 되늰 인터페이스이다.
public class Java179_Enumeration {

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<Integer>();
		v.add(new Integer(10));
		v.add(new Integer(20));
		v.add(new Integer(30));
		
		//열거형
		Enumeration<Integer> enu=v.elements(); //vector에 저장된 요소들을 쭉 나열
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}
		
		//반복자 : 열거형과 같은 것. enumeration이 제공 안 되는 건, iterator를 제공. 하지만.. 이젠 개선된 루프가 있다.
		Iterator<Integer> ite = v.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		//개선된 루프
		for(Integer ig : v) {
			System.out.println(ig);
		}
		
	} //end main()

} //end class
