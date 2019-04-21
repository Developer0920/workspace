package java0418_basic;

public class Java004_casting {
	public static void main(String[] argws) { //프로그램의 시작을 의미
		int x = 3;
		double y = 4.5;
		
		//묵시적 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변환할 때 발생
		y = 5; //자동(묵시적) 형변환이 일어남 (int에서 double로) --- 묵시적 형변환
		
		System.out.println(y);
		
		
		//명시적 형번환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할 때 발생
		x = (int)2.6; 
		
		System.out.println(x);
		
		y = (double)5;
		
	} //end main() --- 프로그램의 끝을 의미 (main 메소드의 시작과 끝이 프로그램의 시작과 끝을 의미함)
} //end class
