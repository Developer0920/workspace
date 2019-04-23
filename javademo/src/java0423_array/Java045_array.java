package java0423_array;
//데이터 타입에 따라 기본값이 바뀜
public class Java045_array {

	public static void main(String[] args) {
		int[] data1=new int[3]; //기본값 0 // byte, short도 동일
		long[] data2=new long[3]; //0L
		float[] data3=new float[3]; //0.0F
		double[] data4=new double[3]; //0.0
		char[] data5=new char[3]; //\u0000 -- 공백이 아닌 그냥 초기화시켜 놓은 값이다.
		boolean[] data6=new boolean[3]; //false
		String[] data7=new String[3]; //null -- 참조 데이터 타입은 null값이 기본값으로 제공됨
		
		for(int i=0; i<data1.length; i++) {
			System.out.printf("data[%d]=%d\n",  i, data1[i]);			
		}
		System.out.printf("=================================\n");
		for(int i=0; i<data2.length; i++) {
			System.out.printf("data[%d]=%d\n",  i, data2[i]);			
		}
		System.out.printf("=================================\n");
		for(int i=0; i<data3.length; i++) {
			System.out.printf("data[%d]=%f\n",  i, data3[i]);			
		}
		System.out.printf("=================================\n");
		for(int i=0; i<data4.length; i++) {
			System.out.printf("data[%d]=%f\n",  i, data4[i]);			
		}
		System.out.printf("=================================\n");
		for(int i=0; i<data5.length; i++) {
			System.out.printf("data[%d]=%c\n",  i, data5[i]);			
		}
		
		System.out.println("=================================");
		char a=' ';
		char b='\u0020';
		char c='\u0000';
		System.out.println(a==b); //즉 공백의 유니코드값은 0020이다.
		System.out.println(a==c);
		
		
		System.out.println("=================================");
		for(int i=0; i<data6.length; i++) {
			System.out.printf("data[%d]=%b\n",  i, data6[i]);			
		}
		System.out.println("=================================");
		for(int i=0; i<data7.length; i++) {
			System.out.printf("data[%d]=%s\n",  i, data7[i]);
		}

		
	} // end main()

}// end class
