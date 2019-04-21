package java0418_basic;

public class Java014_operator {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int res;
		
		res = a+b;
		System.out.println(res); //res = 7
		
		//res = res + a;
					
		res += a; //목표지점을 정확히 알고 간 경우 -- 처리속도에 이점이 있음.
		
		System.out.println(res);
		
	}

}
