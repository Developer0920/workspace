package java0426_class.part10;

public class Employee {
	String name;
	int salary;
	
	public Employee() {
		
	}

	public Employee(String name, int salary) {	
		this.name = name;
		this.salary = salary;
	}
	
	public void prn() {
		System.out.printf("%s %d\n", name, salary);
	}

} //end class
