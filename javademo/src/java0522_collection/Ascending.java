package java0522_collection;

import java.util.Comparator;

public class Ascending implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) { //이 메소드를 오버라이딩		
				
		System.out.println((o1 + "/" + o2 + " ") + o1.compareTo(o2)); //작동원리 확인을 위한 출력
		return o1.compareTo(o2);
		//이런 식으로 내부에서 처리가 돼서 정렬이 됨.
		//내가 호출하는 메소드에서 자동적으로 다른 메소드가 호출됨.
		//sort메소드에서 compare를 호출하도록 설계돼 있을 것.
		//sort메소드 뜯으보려면 어떻게 해야 하지?? 오라클에서 까볼 수 있음.
	} //end compare()

} //end class
