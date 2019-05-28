//용량 크기100으로 세팅. 저장을 해 놓고 보니  4개만 필요. 이 나머지는 없애보자.

//package문
package java0521_collection;

//import문
import java.util.Vector;

//실행클래스
public class Java174_Vector {
	//메인메소드
	public static void main(String[] args) {
		Vector<String> v= new Vector<String>(20,2);
		//Vector객체를 생성하고 해당 주소값을 참조변수 v에 저장하라.
		//String형만 다룰 것이니, 지네릭스로 String을 선언.
		//최소 데이터 크기를 20, 이후 2씩 증가하게 Vector객체를 생성하라.(미지정 시 기본값 10)
		
		v.addElement(new String("java"));
		v.add(new String("jsp"));
		//add와 addElement의 차이가 뭐지?
		v.add(1, new String("spring"));
		//인덱스 1에 "spring"를 추가하라.
		//이 경우 "jsp" 가 뒤로 밀려남
		
		for(int i=0; i<v.size(); i++) {
			System.out.printf("v[%d]=%s\n", i, v.get(i));
		}
		
		//요소가 저장돼 있지 않은 메모리 제거
		v.trimToSize();
		//Vector클래스의 trimToSize()메소드는 남는 capacity를 없애버림.
		
		System.out.println("용량 크기:" + v.capacity()); //다른 컬렉션은 이런 capacity같은 게  없음.
		System.out.println("요소 갯수:" + v.size());		
		
	} //end main()

} //end class
