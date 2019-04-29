package java0429_static_access.prob;

// -(private)    + (public)    #(protected)     X : default
/* 
 * -name:String                    
 * -dept:String 
 * -pay:int
 * -score:double
 * 
 * +setName(name:String):void
 * +setDept(dept:String):void
 * +setPay(pay:int):void
 * +setScore(score:double):void
 * +getName():String
 * +getDept():String
 * +getPay():int
 * +getScore():double
 * 
 * 
 * +setEmployee(name:String, dept:String, pay:int, score:double):void
 * +toString():String 
 */
public class Employee {
	
	//멤버변수//
	private String name;
	private String dept;
	private int pay;
	private double score;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	//메소드//
	public void setEmployee(String name, String dept, int pay, double score) {
		setName(name);
		setDept(dept);
		setPay(pay);
		setScore(score);
	}
	
	public String toString() {
		
		return "이름은 "+name+"이고 "+dept+"에 근무하며 급여는 " + pay + "원 입사성적은 " + score + "입니다.";	
	}
	
	
}















