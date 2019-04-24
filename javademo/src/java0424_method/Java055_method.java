package java0424_method;

public class Java055_method {

	public static void main(String[] args) {
		int a=4, b=2, c=5;
		int[] num = new int[] {2,3};
		int[] data = new int[] {1,5,8,9};
		System.out.println(process(a,b,c));
		System.out.println(plus(num));
		System.out.println(plus(data));
	}//end main()
	
	public static int process(int x, int y, int z) {
		return x+y+z;
	}//end process
	
	public static int plus(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		return sum;		
	}//end plus()
}//end class

//메모리 관련
//