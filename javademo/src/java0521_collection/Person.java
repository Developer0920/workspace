//package문
package java0521_collection;

//클래스
public class Person {
	//멤버변수
	private String name;
	private int age;
	
	//생성자1	
	public Person() {
		
	}
	
	//생성자2
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//메소드	
	@Override
	//Object 클래스의 toString()메소드를 오버라이드
	public String toString() {		
		return name + "\t" + age;		
	}	
	
} //end class
