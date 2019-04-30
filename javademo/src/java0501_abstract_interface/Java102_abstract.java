package java0501_abstract_interface;

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
//open API에서 이런 걸로 구현을 해놓음. 따라서 이걸 이해해야.