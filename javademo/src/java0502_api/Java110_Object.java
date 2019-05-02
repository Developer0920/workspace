package java0502_api;
/*
 * JAVA API(Application Programming Interface)
 * Object
 * 1 클래스 중에서 최상의 클래스
 * 2 Object을 제외한 모든 클래스들은 Object을 상속받고 있다.
 * 3 java.lang 패키지에서 제공하는 클래스이다.
 * 
 * 이미 우리가 설치를 할 때 같이 설치됨. 그래서 별도의 import없이 사용가능했던 것
 * 
 * 거의 final이 선언된 클래스. 상속을 할 수 없음.
 * 
 */

/*
 * 컴파일 시 자동으로 생성되는 코드
 * import java.lang.*
 * default constructor
 * return
 * .toString()
 * this.
 * super()
 * 자동 upcasting 
 * 인터페이스에서의 생략
 * 인터페이스에서 메소드 public abstract
 * 인터페이스에서 필드 public static final
 * 
 */

public class Java110_Object {

	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj.toString()); //java.lang.Object@15db9742
		
		int x = 5;
		int y = 5;
		// ==값비교(기본데이터)
		System.out.printf("x=%d y=%d x==y:%b\n",  x,y,x==y);
		
		Object ojt = new Object();
		// ==주소비교(참조데이터)
		System.out.printf("dbj==djt:%b\n",  obj==ojt);
		
		//equals는 참조데이터 타입만 비교
		System.out.printf("obj.equals(ojt)=%b\n", obj.equals(ojt));
		
		//class java.lang.Object
		System.out.println(obj.getClass()); //클래스 정보가 뜸
		//java.lang.Object
		System.out.println(obj.getClass().getName());
		
		System.out.println(obj); //obj라는 참조변수에는 주소값을 저장하고 있기 때문이다.
		
		
	}//end main()

}//end class
