package java0426_class.part03;

public class Doctor {
	//멤버변수//
	String name; // 의사명
	String medical; // 진료과목
	int patient; // 대기환자수
	
	//생성자1//
	public Doctor() {
		
	}

	//생성자2//	
	public Doctor(String name, String medical, int patient) {
		super();
		this.name = name;
		this.medical = medical;
		this.patient = patient;
	}
	
	//메소드//
	public void prn() {
		System.out.printf("%s %s %d\n", name, medical, patient);
	}
	
} //end class
