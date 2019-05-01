package java0501_abstract_interface.part04;

public class TruckRun implements CarRun{
	public TruckRun() {
		
	}
	
	@Override
	public void prn() {
		System.out.println("prn");
	}

}
//인터페이스를 사용하면 좋은 점.. 개발자들이 마구잡이로 이름을 못짓게 세팅을 해 놓을 수 있다.
//어떤 초안을 제공하는 것
//자바와 DB의 연동에서 인터페이스가 많이 사용됨
//oracle ms-sql mysql .. 겁자 많음. 각 DB와 연동해서 처리할 수 있도록.. 
//어떤 DB를 사용하느냐에 따라.. 다 달라짐.. 이걸 그냥 interface만 알아서.. DB쪽에서는 interface를 상속받아서 각 DB에 맞게 클래스를 구현
//즉, 표준 명세서의 역할을 해주는 것. 자바와 DB사이의 표준명세서!
