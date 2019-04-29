package java0429_static_access.prob;

/*
-name:String
-kor:int
-mat:int
-eng:int
+Student()
+Student(name:String,kor:int,mat:int,eng:int)
+setter&getter
+toString():String
+getTotal():int                 <---- kor+eng+mat 를 리턴
+getAvg():double             <---- getTotal()를 3으로 나누어서 평균을 구한후 리턴
+getGrade():char              <---- getAvg()를 이용해서 A,B,C,D,F학점을 구해서 리턴
*/

public class Student {
	//멤버변수//
	private String name;
	private int kor;
	private int mat;
	private int eng;
	
	//생성자1//
	public Student() {
		
	}
	
	//생성자2//
	public Student(String name, int kor, int mat, int eng) {
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}
	
	//개세//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}
	
	//메소드//
	public String toString() {
		String str = name + "의 점수는 " + getTotal() + "이며, 평균은 " + getAvg() + "이고 학점은 " + getGrade() + "입니다.";
		return str;
	}
	
	public int getTotal() {
		return kor+eng+mat;
	}
	public double getAvg() {
		return (double)getTotal()/3; //int/int는 int가 됨
	}
	public char getGrade() {
		if(getAvg()>=90) {
			return 'A';
		} else if(getAvg()>=80) {
			return 'B';
		} else if(getAvg()>=70) {
			return 'C';			
		} else if(getAvg()>=60) {
			return 'D';
		} else {
			return 'F';
		}
		
	} //end getGrade()
} //end class