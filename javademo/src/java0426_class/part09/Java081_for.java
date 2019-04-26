package java0426_class.part09;
//개선된 for
public class Java081_for {

	public static void main(String[] args) {
		int[] num = {10,20,30,40,50};
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
			
		}
		System.out.println("==================");
		/*
		 * 개선된 루프 = 확장된 루프 = 개선된 for문
		 * for(데이터타이 변수 : 배열 or 컬렉션){
		 * 	수행할 문장;
		 * }
		 * 
		 */
		
		//무조건 사용할 수 있는게 아니다. 0부터 1씩 증가해서.. 처리해야 할 때
		for(int data : num) {
			System.out.println(data);
		}
		
	} //end main()

}
