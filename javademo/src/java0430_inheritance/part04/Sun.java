package java0430_inheritance.part04;

class Sun extends Parent {
	String dept;
	public Sun() {
		
	}
	public Sun(String name, int age, String dept) { //3
		super(name, age); //와.. 이게 가능하네.. // 부모클래스의 생성자 호출 //4
		this.dept = dept; //8
	}
	
	public void prn() { //10
		System.out.printf("%s %d %s\n", name, age, dept); //11
	} //12
} //end class
