package java0430_inheritance.part06;
/*
 * PetOver을 상속받은 DogOver, BirdOver클래스를
 * main()메소드를 참조하여 아래와 같이 출력이 되도록 구현하시오.
 * 
 * [출력결과]
 * 수퍼클래스 move() : 애완동물이 움직입니다.
 * 서브클래스 move() : 새가 날아갑니다.
 * 
 * 
 */

public class PetOver {
	int age; // 애완동물 개월수
	
	public void move() {
		System.out.println("수퍼클래스 move(): 애완동물이 움직입니다.");
		
	}	
}

/*
class DogOver extends PetOver{	//public선언된 클래스는 하나여야 한다.
	
}

class BirdOver extends PetOver{
	
	@Override
	public void move() {
		System.out.println("서브클래스 move(): 새가 날아갑니다.");
	}
}
*/
