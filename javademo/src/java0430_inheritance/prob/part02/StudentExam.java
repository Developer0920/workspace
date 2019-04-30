package java0430_inheritance.prob.part02;

public class StudentExam extends Human{
	String number;
	
	public StudentExam(String name, int age, int height, int weight, String number) {
		super(name, age, height, weight);
		this.number = number;
		
	}
	@Override
	public String toString() {
		String data = name + "\t" + age + "\t" + height + "\t" + weight + "\t" + number;
		return data;
	}	
	
}
