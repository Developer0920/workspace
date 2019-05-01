package java0501_abstract_interface.part02;

public class Java103_abstract {

	public static void main() {
		Rect rr = new Rect(10,20);
		System.out.println("사각형 넓이:" + rr.getArea());
		
		Tri tt = new Tri(10,20);
		System.out.println("삼각형 넓이:" + tt.getArea());
	} //end main()
	
} //end class
