package java0423_array;

public class Java042_array {

	public static void main(String[] args) {
		int[] jumsu=new int[] {90,80,40}; //선언, 생성, 할당을 한 번에 / 이 경우 크기를 지정하면 안 된다.
		
		for(int index=0; index<jumsu.length; index++) {
			System.out.printf("jumsu[%d]=%d\n", index, jumsu[index]);
		}
		
		System.out.println("=====================");
		/*System.out.printf("jumsu[%d]=%d\n", 2, jumsu[2]);
		System.out.printf("jumsu[%d]=%d\n", 1, jumsu[1]);
		System.out.printf("jumsu[%d]=%d\n", 0, jumsu[0]);
		*/
		
		for(int index=jumsu.length-1; index>=0; index--) {
			
			System.out.printf("jumsu[%d]=%d\n", index, jumsu[index]);
		}
		
		
	}

}
