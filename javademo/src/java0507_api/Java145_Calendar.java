package java0507_api;

import java.util.Calendar;

abstract class Test{
	
	public static Test getInstance() {
		return new TestExam();
	}
	
	abstract public void prn();
} //end test

class TestExam extends Test{
	/* 
	public static Test getInstance() {
		 return new TestExam();
	
	 }
	 */
	
	public void prn() {
		System.out.println("prn");
	}
} //end TestExam


public class Java145_Calendar {

	public static void main(String[] args) {
		//Test tt = new TestExam(); //upcasting 발생
		//Test tt = Test.getInstance();
		//System.out.println(tt);
		//tt.prn();
		
		//Calendar은 추상클래스이므로 객체 생성을 할 수 없다.
		Calendar cal = Calendar.getInstance();
		//Calendar cal2 = Calendar.getInstance();
		//System.out.println(cal==cal2); //호출할 때마다 생성하기 때문 //이런 식으로 객체를 생성할 수 있음
		
		System.out.println(cal.toString()); //오버라이딩 됨
		/*
		int year1 = cal.YEAR; //이렇게 하면 1이 나와버림
		System.out.printf("%d", year); 
		*/
		
		int year = cal.get(Calendar.YEAR);
		
		//MONTH는 1월일 때 0을 리턴
		int month = cal.get(Calendar.MONTH) +1 ; //0월부터 시작함. month는 하나 적게 가져온다.
		
		int date = cal.get(Calendar.DATE);
		
		//int hour = cal.get(Calendar.HOUR); //12시간을 가져옴
		int hour = cal.get(Calendar.HOUR_OF_DAY); //24시간
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
				
		System.out.printf("%d-%d-%d %d:%d:%d\n", year, month, date, hour, minute, second); //get메소드를 이용해야 정확한 값을 가져온다.
		
		//각 달의 마지막일을 구해주는 메소드를 제공함.
		//이번 달의 마지막 리턴
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		
		//오늘의 요일 리턴(일요일 ->1)
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //언어마다 다름
		
		//오늘을 기준으로 5일전의 날짜로 설정
		cal.add(Calendar.DATE,  -5);
		System.out.println(cal.toString());
		
		cal.set(2017,2,1); //2017-3-1
		System.out.println(cal.toString());
		
		
	}//end main()

} //end class

//calendar라는 클래스가 이딴 식으로 구현돼 있음.
//추상메소드를 오버라이딩하면 그걸 부모형 참조변수가 접근할 수 있다?

