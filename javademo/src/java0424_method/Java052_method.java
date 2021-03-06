package java0424_method;

/*
 * method(메소드) 정의
 * 1 값을 계산하기 위해서 사용되는 기능이다.
 * 2 객체의 동작을 처리하기 위한 기능이다.
 * 
 * 함수는 단독으로 사용되지만, 객체는 클래스 안에서 사용됨.
 * 
 * method 구조형태 : 메소드 선언부 + 메소드 구현부
 * 		반환자료형 메소드명(데이터타입 매개변수) => 메소드 선언부
 * 		{
 * 			=> 매소드 구현부
 * 			:메소드가 처리해야 할 로직 구현;
 * 			return 값; -- 반드시 반환자료형을 넘겨야 함
 * 		}
 * 
 * 이제부턴 main메소드에서 한 번에 구현하지 않고, 따로 따로 구현할 것이다.
 * 
 * <메소드의 세분 형태>
 * 1.리턴값이 없고, 매개변수도 없다.
 *  void add(){
 *  	int x=10;
 *  	int y-20;
 *  	if(y>30){
 *  		return; -> 해당 메소드를 강제적으로 빠져나와라.
 *  	}
 *  	System.out.println(x+y);
 *  }
 *  
 *  이러한 메소드가 동작을 하게 하려면 메소드를 호출을 해야 한다.
 *  add(); => 호출
 *  
 * 2.리턴값은 없지만 매개변수는 있다.
 * 	void plus(int x, int y){
 * 		System.out.println(x+y);
 *  }
 *  
 *  [호출]
 *  plus(10,20); => 호출
 *  
 * 3.리턴값은 있고, 매개변수 없고.
 * 	double avg(){ //리턴값은 오직 하나만 설정 가능, 반면 매개변수는 여러 개 가능
 * 		int total=15;
 * 		return total/3.0
 *  }
 *  
 *  [호출]
 *  double res = avg();
 *  System.out.println(res);  
 *  System.out.println(avg()); 이거도 가능
 *  System.out.println(plus(10,20)); 이딴 건 안 된다. 왜냐하면 리턴해주는 값이 없기 때문
 *  
 * 4. 리턴값 있고, 매개변수도 있다. -- 리턴값이 있는 경우, 반드시 return 키워드가 들어가야 한다.
 * 		double avg(int x, int y){
 * 			return (x+y)/2.0;
 *  	}
 *  
 *  [호출]
 *  
 *  double res = avg(10,20);
 *  System.out.println(res);
 *  
 *  
 * //호출된 메소드가 끝나면 다음 문장으로 간다.
//메소드는 호출해야만 실행된다. 정의만 해선 아무 소용없다. 
 */
public class Java052_method {
	
	//프로그램을 실행하면 JVM에서
	//main스레드가  main()메소드를 호출한다.
	public static void/*반환자료형*/ main/*메소드명*/ (String[] args/*인자값을 받을 수 있는 매개변수*/) //메소드 선언부	//1
	{ 	
		System.out.println("main start"); //2
		//makeTest메소드 호출(call)
		makeTest(); //3
		System.out.println("main end"); //7
	}// end main() //8
	
	public static void makeTest() { //4
		System.out.println("makeTest run"); //5 
	} //end makeTest //6

}// end class
