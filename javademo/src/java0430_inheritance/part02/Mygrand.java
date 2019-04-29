package java0430_inheritance.part02;

public class Mygrand {
	public Mygrand() { //생성자  //7
		
		System.out.println("MyGrand"); //8
	} //9
}

class MyFather extends Mygrand{
	public MyFather() { //5
		super(); //6
		System.out.println("MyFather"); //10
	} //11
}
class MyChild extends MyFather{
	public MyChild() { //3
		//상위 클래스 생성자 호출해야. 하지만 없다면.. 인자값이 없는 생성자를 호출하도록 자동적으로
		super(); //4
		System.out.println("MyChild"); //12
	} //13
}

//생성자는 상속 안 됨! 상속관계에서 생성자는 반드시 상위클래스에 있는 생성자를 호출해야 한다.

//자식생성자에서는 반드시 부모생성자를 호출해야 한다.
//부모생성자 호출이 상략돼 있으면  JVM에서 super()로 호출한다.

//상속 아닌 단순 호출로 봐야 하는 것?