package java0424_method.prob;
/*
매개변수로 받은 두 정수형 배열의 내용을 결합하여 하나의 배열로 리턴하는 
mergeArray() 메서드를 구현하시오.
[출력결과]
<< 두 배열을 합친 배열 내용 >>
1
2
3
4
5
10
20
30
*/

public class Prob001_method {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 10, 20, 30 };
		int[] result = mergeArray(array1, array2);
		System.out.println("<< 두 배열을 합친 배열 내용 >>");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}// end main()

	public static int[] mergeArray(int[] array1, int[] array2) {
		// 여기에서 구현하세요.
		int[] merge = new int[array1.length+array2.length];
		for(int i=0; i<merge.length; i++) {
			//0부터4는 array1, 5~7은 array2 값 할당
			if(i<5) {
				merge[i] = array1[i];
			} else {
				merge[i] = array2[i-array1.length];
			}
		}
		
		return merge;
	}// end mergeArry()

}// end class
