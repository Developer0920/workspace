package java0418_basic;


// 논리연산자 : &&(and), ||(or), !(not)

/*
 * true && true => true
 * true && false => false
 * false && true => false
 * false && false => false
 * 
 * true || true => true
 * true || false => true
 * false || true => true
 * false || false => false
 * 
 * !true = false
 * !false = true
 */

public class Java011_operator {
	public static void main(String[] args) {
		
		int x = 3;
		int y = 6;
		int z = 3;
		
		boolean res;
		/*
		 * x<y => true
		 * x==z => true
		 * true && true => true
		 * res변수에 식의 결과(true) 저장
		 */
		res = x<y && x==z;
		System.out.println(res);
				
	}
}
