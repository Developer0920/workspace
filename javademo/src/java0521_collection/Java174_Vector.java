package java0521_collection;

import java.util.Vector;

//용량 크기100으로 세팅. 저장을 해 놓고 보니.. 4개만 필요. 나머지는 쓰지도 못하고 버림. 이 나머지는 없애보자.
public class Java174_Vector {

	public static void main(String[] args) {
		Vector<String> v= new Vector<String>(20,2); //최소 데이터 크기 20, 이후 2씩 증가. //지정 안하면 기본 10
		v.addElement(new String("java")); //append로 추가
		v.add(new String("jsp")); //append(?)
		v.add(1, new String("spring")); //인덱스 1에 "spring"를 추가하라. //insert //"jsp" 가 뒤로 밀려남
		
		for(int i=0; i<v.size(); i++) {
			System.out.printf("v[%d]=%s\n", i, v.get(i));
		}
		
		//요소가 저장돼 있지 않은 메모리 제거
		v.trimToSize(); //이런 메소드도 벡터에서 제공
		System.out.println("용량 크기:" + v.capacity()); //다른 컬렉션은 이런 capacity같은 게  없음.
		System.out.println("요소 갯수:" + v.size()); 
		
		
	} //end main()

} //end class