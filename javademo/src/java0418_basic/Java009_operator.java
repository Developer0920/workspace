package java0418_basic;

//한 문장에서 항이 여러 개인 경우 증감연산자의 사용
public class Java009_operator {
	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		int k = 0;
		
		//전위형 : 값이 참조되기 전에 증가시킨다.
		j = ++i; 
				
		System.out.println("i="+i + ", j=" + j); // i=, j=6
		
		//후위형 : 값이 참조된 후에 증가시킨다.
		k = i++;
				
		System.out.println("i=" + i + ", k=" + k); //
				
	}
}
