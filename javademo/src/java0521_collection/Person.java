package java0521_collection;

public class Person {
	private String name;
	private int age;
	
	public Person() {
		
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {		
		return name + "\t" + age;
		
	}	
	
} //end class
