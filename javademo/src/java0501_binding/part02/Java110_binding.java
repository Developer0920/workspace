package java0501_binding.part02;

/*
 * 다형성(polymorphism)
 * 1 사전적 의미는 '여러가지 형태를 가질 수 있는 능력'을 의미한다.
 * 2 하나의 타입으로 상속 관계에 있는 여러 객체를 다루는 기술이다. (수정되기 자바에서는 한 타입의 참조변수로 여러 타입의 객체를 참조하는 기술이다.)
 *   예를 들면, 조상클래스 타입의 참조변수로 자손클래스의 인스턴스를 참조
 *         할 수 있도록 할 수 있다는 것이다.
 *  
 *  void add(Parent a, Parent b){ }
 *  void add(Child a,Child b){ }
 *  void add(Sun a, Sun b){ }
 *  add(new Parent(), new Parent()); Parent a= new Child();
 *  add(new Child(),new Child());	 Parent a = new Sun();
 *  add(new Sun(), new Sun());		진짜 이 부분은 무슨 말이냐?
 * 
 * 바인딩(binding) : 메소드 호출을 실제 메소드의 몸체와 연결하는 기술이다.
 * 1 정적 바인딩 (static binding) : 컴파일단계에서 어떤 클래스의 어떤 메소드가
 *            호출되는지 연결하는 기술
 * 2 동적 바인딩(dynamic binding) : 실행단계에서 어떤 클래스의 어떤 메소드가
 *             호출되는지 연결하는 기술
 *          
 */


public class Java110_binding {

	public static void main(String[] args) {
		BindTest bt = new BindTest();
		// 정적바인딩
		System.out.println(bt.toString());
		
		
		Object obj = bt; //업캐스팅
		System.out.println(obj.toString()); //동적바인딩
		
		process(new String("java")); //string과 object는 상속관계.. 동적바인딩으로 연결돼서 처리
		process(new Object()); //정적바인딩
		
		//상속관계 : Integer -> Number -> Integer (업캐스팅발생)
		process(new Integer(10));
				
	}// end main()
	
	//is a(상속관계) -> up-casting(업캐스팅) -> 동적바인딩(dynamic binding)
	public static void process(Object obj) {
		System.out.println(obj.toString());
	} //end process
	
} //end class
