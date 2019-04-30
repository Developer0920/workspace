package java0430_inheritance.part07;

public class SuperClass {
	int x, y, z;
	
	//생성자1
	public SuperClass() {
		System.out.println("**** x, y, z에 값채우기***");		
	}
	//생성자2
	public SuperClass(int k) {
		this(); //생성자 호출은 항상 다른 문장보다 먼저 와야.
		this.x = k;
		System.out.println(k + "을 넘겨받은 생성자");		
	}
	//생성자3
	public SuperClass(int a, int b) {
		this(a);
		this.y = b;
		System.out.println(a + "   " + b + "   을 넘겨받은 생성자");
	}
	//생성자3
	public SuperClass(int a, int b, int c) {
			this(a, b);
			z = c;
			System.out.println(a + "   " + b + "   " + c + "   을 넘겨받은 생성자");
		}	
	//메소드
	public void display() {
		System.out.printf("%d %d %d\n",  x, y, z);
	}
	
} //end class
