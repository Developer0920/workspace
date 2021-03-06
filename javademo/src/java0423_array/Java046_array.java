package java0423_array;
/*
 * data배열에서 대문자의 갯수를 출력하는 프로그램을 구현하시오.
 * 
 * [출력결과]
 * 대문자갯수 : 2
 */

public class Java046_array {

	public static void main(String[] args) {
		char[] data = new char[] { 'a', 'b', 'F', 'R', 'a' };
		int cnt = 0; // 대문자 갯수 저장하기 위한 변수
		
		for(int i=0; i<data.length; i++) {
			if(data[i]<='Z' && data[i]>='A') {
				cnt = cnt + 1; //cnt++; cnt+=1;
			}
		}
		
		System.out.printf("대문자갯수 : %d",  cnt);
	}// end main()

}// end class
