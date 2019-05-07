package java0502_api;

public class Java112_String {

	public static void main(String[] args) {
		String sn = "java"; //"java" 라는 문자열 값이 힙 영역에 이렇게 저장된 게 있는지 찾는다. 처음이라 없음. 새로 생성.
		String sg = "java"; //이때는 새로 생성하지 않고 기존에 만든 걸 가르켜 버린다. 반면, new는 무조건 새로 생성한다.
		String st = new String("java");
		String ss = new String("java");
		//sg = "jsp"; //
		
		//주소비교
		System.out.printf("sn==sg:%b\n", sn==sg); //true
		System.out.printf("st==ss:%b\n", st==ss); //false
		
		//equals( ) : 메모리에 저장된 문자열 비교
		System.out.printf("sn.equals(sg):%b\n", sn.equals(sg));
		System.out.printf("st.equals(ss):%b\n", st.equals(ss));	
		
		//toString() : 메모리에 저장된 문자열 리턴
		System.out.println(sn.toString()); //메모리에 저장된 문자열을 리턴하도록 오버로딩된 것(원래는 객체의 해쉬코드를 리턴했음)
		System.out.println(sn); //이건 뭐지?
		
		System.out.println(sn.getClass());
	} //end main()

}
//참조데이터 타입에서 ==는 주소 비교가 됨
//object에서 equals는.. 주소비교..
//Sting에서는 overriding 해서 문자열을 비교함
//앞으로 문자열 비교 시 equals()를 쓸 것