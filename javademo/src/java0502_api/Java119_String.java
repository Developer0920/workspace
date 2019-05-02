package java0502_api;

/*
 * [출력결과]
 *  홍길동님은 남성입니다.
 *  응삼이님은 여성입니다.
 *  잘못입력하셨습니다.
 */
public class Java119_String {

	public static void main(String[] args) {
		String p1 = "홍길동,561203-1597650";
		String p2 = "응삼이,030628-4056892";
		String p3 = "갑동이,900824-8052582";
		display(p1);
		display(p2);
		display(p3);

	}// end main()

	public static void display(String str) {
		// 여기를 구현하세요.
		String[] data = str.split(",");
		//System.out.println(data[1].charAt(7));
		char gen = data[1].charAt(7);
		
		if(gen=='1' || gen=='3') {
			System.out.printf("%s님은 %c성입니다.\n", data[0], '남');
		} else if (gen=='2' || gen=='4') {
			System.out.printf("%s님은 %c성입니다.\n", data[0], '여');
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
		
	}// end display()

}// end class
