package java0425_class.part01;

//사용자가 정의한 데이터 타입 - 사람 객체
public class Person{
	public String name; //멤버변수
	public int age;
	public char gen;
	
	public void eat() {// 메소드
		System.out.println("먹는다");		
	}
	
	public void run() {
		System.out.println("달린다");
	}
}// end class

//같은 패키지 내에서는 impor필요없음. public도 필요 없다?