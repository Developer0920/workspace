package java0429_static_access.part03;

public class Java085_static {
	
	//static이 있고 없고의 차이를 알아보자.
	public static void display() {
		System.out.println("display");
	}
	
	public void process() {
		System.out.println("process");
	}

	
	public static void main(String[] args) {
		display();
		//process(); //오류가 뜬다. 메인은 이미 생성돼 있지만, process()는 아직 생성이 안 돼 있기 때문이다.
					//이걸 사용하려면 객체를 생성한 후 호출해야 한다.
		
		Java085_static js = new Java085_static();
		js.process(); //이럴 경우, static은 빼고 나머지만 딱 heap영역에 생성이 되나? OK!		

	} //end main()

} //class
