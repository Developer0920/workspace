package java0423_array;
 //변수 : 하나의 값을 저장하기 위한 메모리 공간
public class Java041_array {

	public static void main(String[] args) {
		/*int ko=90;
		int en=80;
		int jp=40;*/
		
		//배열선언
		int[] jumsu; //int jumsu[]; <- JAVA는 이것도 가능
		//배열생성 = 메모리 생성(확보)
		// new 키워드를 이용해서 배열을 생성한다.
		// 배열의 크기 3이다.
		// 각 요소마다 인덱스가 0부터 생성된다.
		
		jumsu = new int[3]; //int이므로 4byte 3개, 그리고 자동적으로 인덱스가 주어짐, 기본값(default)으로 0이 저장됨.
		//int[] jumsu = new int[3]; -- 선언과 생성을 한 번에
		
		
		System.out.printf("jumsu[0]=%d\n",  jumsu[0]);
		System.out.printf("jumsu[1]=%d\n",  jumsu[1]);
		System.out.printf("jumsu[2]=%d\n",  jumsu[2]);	
		System.out.println("========================");
		
		jumsu[0]=90; //90을 jumsu배열 0 인덱스(index)에 저장
		jumsu[1]=80; //80을 jumsu배열 1 인덱스(index)에 저장
		jumsu[2]=40; //40을 jumsu배열 2 인덱스(index)에 저장
		
		/*System.out.printf("jumsu[0]=%d\n",  jumsu[0]);
		System.out.printf("jumsu[1]=%d\n",  jumsu[1]);
		System.out.printf("jumsu[2]=%d\n",  jumsu[2]);	
		System.out.println("========================");
		*/		
		
		
		//length : 배열의 크기 => 배열명.length (이거 키워드다. 배열의 크기를 리턴해주는 키워드)
		for(int index=0; index<jumsu.length; index++) { //여기서 length는 3이므로 < 로 바꿔줘야 한다.
			System.out.printf("jumsu[%d]=%d\n", index, jumsu[index]);
		}
		
	}//end main()
	
	/*자바가상머신에서의 메모리 영역
	 * 메모리 관리..
	 * stack, heap, method (일단, 내 수준에서)
	 * 배열선언 시 -> stack에서 jumsu가 잡힘
	 * 참조데이터 타입 : 배열, xx, 인터페이스 -- 이런 것들을 new를 써야 함. -- stack에서 4byte로 잡힘
	 * new를 쓰면.. heap에서 4byte, 4byte, 4byte 가 잡힘.
	 * 
	 * 
	 */
	

}//end class
