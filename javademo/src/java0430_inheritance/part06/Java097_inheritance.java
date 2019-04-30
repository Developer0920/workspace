package java0430_inheritance.part06;

public class Java097_inheritance {

	public static void main(String[] args) {
		DogOver dog = new DogOver();
		BirdOver bird = new BirdOver();
		dog.move();
		bird.move();

	} //end main()

} //end class

//클래스파일을 나눠서 구현
//같은 패키지 내라서 이렇게 가능한 건가? 응. 패키지가 다르면 import해야 돼.
