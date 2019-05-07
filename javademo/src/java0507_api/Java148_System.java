package java0507_api;
//배열에 관한 메소드
public class Java148_System {

	public static void main(String[] args) {
		int[] arr1 = {1, 5, 2, 4};
		int[] arr2 = {6, 3, 9, 7, 8};
		int[] arr3 = {4, 3};
		int[] arr4 = process(arr1, arr2, arr3);
		for (int data : arr4)
			System.out.printf("%3d", data);
		

	} //end main()

	public static int[] process(int[] arr1, int[] arr2, int[] arr3) {
		int[] arr4 = new int[arr1.length+arr2.length+arr3.length];
		/*
		for(int i=0; i<arr1.length; i++) {
			arr4[i] = arr1[i];
		}
		for(int i=0; i<arr2.length; i++) {
			arr4[arr1.length+i]=arr2[i];			
		}
		for(int i=0; i<arr3.length; i++) {
			arr4[arr1.length+arr2.length+i]=arr3[i];			
		}
		*/
		//이걸 간단하게...
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);
		System.arraycopy(arr2, 0, arr4, arr1.length, arr2.length);
		System.arraycopy(arr3, 0, arr4, arr1.length+arr2.length, arr3.length); //오... 지렸다.
				
		return arr4;
			
	} //end process()
	
	
	
	
} //end class
