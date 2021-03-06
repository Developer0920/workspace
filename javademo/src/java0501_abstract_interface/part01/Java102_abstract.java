package java0501_abstract_interface.part01;

/*
 * 클래스 종류 : 클래스, 추상클래스, 인터페이스
 *  메소드 정의 : 메소드선언부 + 메소드구현부
 *   public void prn() { }
 *   
 *  추상메소드 : 선언부만 정의되어 있는 메소드
 *  abstract public void prn();
 *  
 *  추상클래스 : 추상메소드를 가지고 있는 클래스
 *  abstract public class Test{}
 *  
 *  추상클래스 제공 목적 : 추상메소드를 강제적으로 오버라이딩하고
 *  객체생성을 할 수 없도록 하기 위해서
 *  
 */


/*
 * Car : 속도, 색상, 움직인다. 속도를 높인다. 멈춘다. work()
 * Senda extends Car : 
 * Truck extends Car : 
 */
public class Java102_abstract {

	public static void main(String[] args) {
		//CarAbs cs = new CarAbs(); //추상클래스는 객체생성을 못한다.
		
		//상속받은 추상클래스를 가지고 객체를 생성!
		
		TruckAbs truck = new TruckAbs();
		truck.work();
		
		SendaAbs senda = new SendaAbs();
		senda.work();

	}

}
//상속을 받아서.. 오버로드를 하면된다...??
//open API에서 추상 클래스를 제공하는 것들이 있음. 따라서 이걸 알아야.
//추상 클래스는 메소드를 강제적으로 오버라이딩 하기 위해 사용한다.