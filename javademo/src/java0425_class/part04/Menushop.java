package java0425_class.part04;

/*
 * 메뉴명		가격		갯수
 * 떡볶이		2000	3
 * 김말이		500		2
 * 오뎅		300		4
 */
public class Menushop {
	
	//멤버변수
	String menu;
	int price;
	int cnt;
	
	//지불금액 계산 메소드
	int count() {
		return price * cnt;
	}//end count()		
		
	//출력 메소드
	public void prn() {
		System.out.printf("메뉴명:%s\n",menu);
		System.out.printf("가격:%d\n",price);
		System.out.printf("갯수:%d\n",cnt);
		System.out.printf("메뉴금액:%d\n\n",count());
		
	}
	
}//end class
