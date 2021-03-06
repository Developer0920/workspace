package java0430_inheritance.part05;

public class Second extends First{
	
		int b = 20;
		
		@Override //이렇게 실수를 미연에 방지할 수 있다. override란 annotation. 정확하게 override 됐는지 체크해 주는 기능.
		void prn() { //다르게 메소드명을 쓰면 오버라이딩이 아니다. 그냥 메소드 하나를 더 만든 것. 이러한 실수를 막기위해..
			System.out.println("b=" + b);
		}
		
		public void superThisMethod() {
			super.prn();
			this.prn();
		}
		public static void display() {
			//super.prn(); //이렇게 호줄하면 안 됨. static이므로. 아직 prn()이 생성돼 있지 않기 때문이다. 시점의 차이 때문
			//this.prn(); //이렇게 호줄하면 안 됨. static이므로
		}
		
} //end Second class

