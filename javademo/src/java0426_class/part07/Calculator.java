package java0426_class.part07;


/*
 * 오버로딩(overloading)
 * 1 하나의 클래스에 같은 이름의 메서드를 여러 개 정의하는 것을 오버로딩이라 한다.
 * 2 오버로딩의 조건
 * 	1) 메서드의 이름이 같아야 한다.
 * 	2) 매개변수의 갯수 또는 데이터 타입이 달라야 한다.
 * 	3) 매개변수는 같고 리턴타입이 다른 경우는 오버로딩이 성립되지 않는다.
 * 		(즉 리턴 타입은 오버로딩을 구현하는 데 아무런 영향을 주지 않는다)
 */
//생성자도 하나의 매소드.. 따라서 생성자를 여러 개 만든 것도 오버로딩의 일종
/*
//a
int sum() {
	
}
//b
double sum(int a, int b) {
	
}
//c
double sum() {
	
}
*/
// a,c는 오버로딩 성립, a,b는 오버로딩 성립X

public class Calculator {
	void addValue(int x, int y) {
		System.out.println(x+y);		
	}	 	
	 	
	/* 자동형변환이 일어나서 세번째 꺼를 수행함
	void addValue(int x, int y) {
		 	System.out.println(x+y);
	}
	*/
	
	void addValue(int x, int y, int z) {
		 	System.out.println(x+y+z);
	}
	 
	void addValue(double x, double y) {
		 	System.out.println(x+y);
	}
 
 
 
}




//오버로딩은 왜 하는 건가???
//어차피 같은 기능을 수행하니까 이름을 같게 하자. 왜? 관리하기가 쉽도록!
//결국 내가 편하려고.

















