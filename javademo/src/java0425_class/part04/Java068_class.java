package java0425_class.part04;

/*
 * [출력결과]
 * 메뉴명:떡볶이
 * 가격:2000
 * 갯수:3
 * 메뉴금액:6000
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class Java068_class {

	public static void main(String[] args) {
		
		//떡볶이 인스턴스
		Menushop od1 = new Menushop();
		od1.menu = "떡볶이";
		od1.price = 2000;
		od1.cnt = 3;
		
		od1.prn();
		
		//김말이 인스턴스
		Menushop od2 = new Menushop();
		od2.menu = "김말이";
		od2.price = 500;
		od2.cnt = 2;
		
		od2.prn();		
		
		//오뎅 인스턴스
		Menushop od3 = new Menushop();
		od3.menu = "오뎅";
		od3.price = 300;
		od3.cnt = 4;
		
		od3.prn();
		
		//합계금액 출력
		System.out.println("===================");
		int sum = od1.count()+od2.count()+od3.count();
		System.out.printf("총금액:%d", sum);

	}// end main()

}// end class
