package java0426_class.part10;

public class Java082_for {

	public static void main(String[] args) {
		Employee[] emp = new Employee[2];
		emp[0] = new Employee("John", 5000);
		emp[1] = new Employee("steven", 8000);
		
		for(int i=0; i<emp.length; i++) {
			emp[i].prn();
		}
		System.out.println("==============================");
		
		for(Employee data : emp ) {
			data.prn();
		}

	} //end main()

} //end class
