package java0425_class.part03;

/*
 * [출력결과]
 * [가로5, 세로3의 사각형]
 * 넓이:15
 * 둘레:16
 * =======================
 * [가로7, 세로4의 사각형]
 * 넓이:28
 * 둘레:22
 */

public class Java067_class {

	public static void main(String[] args) {
		
		Rect rct1 = new Rect();
		rct1.width = 5;
		rct1.height = 3;
		
		Rect rct2 = new Rect();
		rct2.width = 7;
		rct2.height = 4;
		
		///출력///
		rct1.prn();
		System.out.println("================");
		rct2.prn();
		
		/*
		System.out.printf("[가로%d, 세로%d의 사각형]\n", rct1.width, rct1.height);
		System.out.printf("넓이=%d\n", rct1.area());
		System.out.printf("둘레=%d\n", rct1.grith());
		
		System.out.println("================");		

		System.out.printf("[가로%d, 세로%d의 사각형]\n", rct2.width, rct1.height);
		System.out.printf("넓이=%d\n", rct2.area());
		System.out.printf("둘레=%d\n", rct2.grith());
		*/
	}

}
