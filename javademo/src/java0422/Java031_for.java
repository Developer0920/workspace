package java0422;
/*
 * i=1
 * i=2
 * i=3
 * i=4
 * i=5
 * sum=15
 */
public class Java031_for {

	public static void main(String[] args) {
		int i=1;
		int sum = 0;
		for( ; ; i++) {
			sum = sum+i;
			System.out.printf("i=%d\n", i);
			if(sum>=15) {
				System.out.printf("sum=%d\n", sum);
				break;
			}
		}

	} //end main()

}//end class
