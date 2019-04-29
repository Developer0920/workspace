package java0429_static_access.part08;

/*
 * 
 * 캡슐화 : 추상화를 통해 정리된 데이터들과 기능을 하나로 묶어 관리하는 기법으로, 데이터의 접근 제한을 원칙으로 한다.
 * 캡슐화(encapsulation) 정의방법
 * 1 멤버변수의 접근제어자는 private으로 선언한다.
 * 2 외부로부터 멤버변수에 값을 할당하기 위한 setter메소드를 정의한다.
 * 3 setter메소드 정의방법
 *   -접근제어자는 public으로 지정한다.
 *   -리턴 타입은 void으로 지정한다.
 *   -메소드명은 set으로 시작하고 멤버변수의 첫글자만 대문자로 지정하고 나머지는 같게 한다.
 *   private int num;
 *   public void setNum(int num){
 *    this.num=num;
 *   }
 * 4 외부에 멤버변수의 값을 제공할때는 getter메소드를 정의한다.
 * 5 getter메소드 정의방법
 *   -접근제어자는 public으로 지정한다.
 *   -리턴타입은 멤버변수의 데이터 타입하고 같게한다.
 *   -메소드명은 get으로 시작하고 멤버변수의 첫글자만 대문자로 지정하고 나머지는 같게한다.
 *    public int getNum(){
 *      return num;
 *    }  
 */
 
public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	
	//마우스 오른 쪽  > source > generate get...
	
	
	//사용자가 딱 맞는 자료를 입력하도록 유도할 때 사용!
} //end class
