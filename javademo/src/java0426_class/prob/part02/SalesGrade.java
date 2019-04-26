package java0426_class.prob.part02;

public class SalesGrade {
	//멤버변수//
	int hisal;
	int losal;
	char grade;
	
	//생성자//
	SalesGrade(int losal, int hisal, char grade) {
		this.losal = losal;
		this.hisal = hisal;
		this.grade = grade;
	}

	//메소드//
	public String toString() {
		return losal + " " + hisal + " " + grade;
	}
}// end class
