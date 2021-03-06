package java0426_class.part02;
//클래스를 가지고 배열을 선언한다.

/*
[실행결과]
상품                                    가격       상품재고       팔린수량
Nikon            400000    30    50
Sony             450000    20    35
FujiFilm         350000    10    20
*/

public class Java074_class {

	public static void main(String[] args) {
		/*
		String a = "상품";
		String b = "가격";
		String c = "상품재고";
		String d = "팔린수량";
		System.out.printf("%2s %37s %10s %10s\n", a, b, c, d);
		Goods g1 = new Goods("Nikon", 400000, 30, 50);
		Goods g2 = new Goods("Sony", 450000, 20, 35);
		Goods g3 = new Goods("FujiFilm", 350000, 10, 20);
		g1.prn();	
		g2.prn();
		g3.prn();
		*/
		
		
		//배열을 이용한 효율적인 방법//
		Goods[] goodArray = new Goods[3]; //goodArray는 main()안에서만 참조가 가능
		goodArray[0] = new Goods("Nikon", 400000, 30, 50);
		goodArray[1] = new Goods("Sony", 450000, 20, 35);
		goodArray[2] = new Goods("FujiFilm", 350000, 10, 20);
		
		/*
		goodArray[0].prn();
		goodArray[1].prn();
		goodArray[2].prn();
		
		System.out.println(goodArray[0]);
		*/
		
		//배열 + 반복문을 이용한 더 나은 방법//
		/*
		for(int i=0; i<goodArray.length; i++) {
			goodArray[i].prn();
		}
		*/
		
		display(goodArray);		
		
	}// end main()
	
	//메소드를 이용해서 따로 출력// 매개변수를 이용해서 연동을 시키는 것!!
	
	public static void display(Goods[] goodArray2) {
		
		for(int i=0; i<goodArray2.length; i++) {
			goodArray2[i].prn();
		}
		
	} //end display{}

}// end class
