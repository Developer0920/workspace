package java0425_class.prob;



/* [실행결과]를 참조하여  main() 메소드에 로직에 추가하세요.
 * 
 * [실행결과]
 * 생성자 호출됨
 * Bible 작자미상
 */
class Book2 {
	
	//멤버변수
	String title;
	String author;
	
	//메소드
	void show() { System.out.println(title + " " + author); }
	
	//생성자1
	
	public Book2() {
		this("", "");
		System.out.println("생성자 호출됨");
	}
		
	//생성자2
	public Book2(String title) {
		this(title, "작자미상"); //생성자3 호출
	}
	
	//생성자3
	public Book2(String title, String author) {
		this.title = title;
		this.author = author;
	}	
}

public class Prob02_class {

	public static void main(String[] args) {
		Book2 javaBook = new Book2("Java", "황기태"); //인스턴스1 생성
		Book2 bible = new Book2("Bible"); //인스턴스2 생성
		Book2 emptyBook = new Book2(); //인스턴스3 생성
		/////////여기에 구현하세요.
		
		bible.show();		
		
		/////////////////////////////////////

	}//end main( )

}//end class
