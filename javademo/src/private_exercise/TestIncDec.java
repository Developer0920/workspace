package private_exercise;

public class TestIncDec {

	public static void main(String[] args) {
		int x = 12;
		int y = 12;
		
		int result1 = ++x + 10;
		int result2 = y++ + 10;
		
		System.out.println("x: " + x + ", result1 = " + result1);
		System.out.println("y: " + y + ", result2 = " + result2);
		System.out.println("y: " + y);
		
	}

}
