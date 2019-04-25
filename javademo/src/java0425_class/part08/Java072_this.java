package java0425_class.part08;

public class Java072_this {

	public static void main(String[] args) {
		Employees emp=new Employees("용팔이", "기획", 5000);
		emp.prn();
		
		Employees emp2=new Employees();
		emp2.prn();

	}
}
