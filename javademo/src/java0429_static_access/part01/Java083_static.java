package java0429_static_access.part01;
/*
 *
 * [프로그램 실행과정]
 * 1. 소스 코드 작성  Java083_static.java
 * 2. 컴파일(클래스 파일생성)    javac Java083_static.java
 * 3. 실행 (클래스 파일실행) java Java083_static
 * 4. 클래스 로딩-메모리로 읽어온다.(JVM method영역에 클래스 정보를 저장한다)
 *    (static으로 선언된 자원은 JVM method영역에 생성된다.)
 * 5. main()메소드 실행-main 스레드에서 main()메소드를 호출한다.
 * 6. 객체생성(new)
 * 7. 멤버변수, 메소드 호출
 * 8. main() 메소드 종료-프로그램 종료
 * 
 * [JVM의 메모리 구조]  Runtime Data Area
 * 1. stack area : 메서드의 작업공간. 메서드가 호출되면
 *    메서드 수행에 필요한 메모리 공간을 할당받고 메서드가 종료되면
 *    사용하던 메모리를 반환한다.
 * 2. heap area : 객체(인스턴스)가 생성되는 공간. new키워드에
 *    의해서 생성되는 배열과 객체는 모두 여기에 생성된다.
 * 3. method area : 클래스 정보와 클래스 변수(static)가 저장되는 곳     
 * 
* static
 * 1. 같은 데이터 타입으로 생성된 객체는 서로 공유한다.
 * 2. 클래스가 로딩되는 시점에 메모리에 저장된다.
 * 3. static키워드가 선언된 메소드에서는
 *    this(왜냐하면 시점 때문. this는 heap에 메모리 생성 후 불러오는 것, this는 new 이후에 사용할 수 있음. 따라서 new하기 전에 static이 선언된 메소드를 호출할 수 있다), super키워드를 사용할 수 없다.
 *    (static키워드가 선언된 메소드가 위 실행과정 4번에서 생성되기 때문에
 *      즉, new보다 빠르다)      
 *      
 * static은 Runtime Data Area의 클래스 영역에 저장됨      
 * 
 * 멤버변수 : 인스턴스 변수, 클래스 변수(static선언), 종단변수(final선언)
 * 크게 나누면... 멤버변수, 매개변수, 지역변수
 * 
 * static이 붙은 자원은 로딩 단계에서 생성됨
 * 여기서.. 메인 메소드의 static과 클래스 변수의 static은 관련이 없는가? 관련없다.
 * main메소드에는 반드시 static을 붙여야 함. 그래야 로딩 되면서 method영역에 올라가서, 바로 쓸 수 있다.
 * 
 */
public class Java083_static {

	public static void main(String[] args) {
		System.out.println("StaticEx.y=" + StaticEx.y); //와.. 쌌다.. 바로 호출 가능!
		
		StaticEx se = new StaticEx();
		System.out.printf("se.x=%d se.y=%d\n", se.x, se.y); //노란줄이 뜨는 이유는 클래스로 직접 호출하는 걸 권장하기 때문		

		StaticEx ss = new StaticEx();
		System.out.printf("ss.x=%d ss.y=%d\n", ss.x, ss.y);
		
		se.x = 20;
		se.y = 30;
		
		System.out.printf("se.x=%d se.y=%d\n", se.x, se.y);		
		System.out.printf("ss.x=%d ss.y=%d\n", ss.x, ss.y);
		
		
	} //end main()
	
//
	

} //end class
