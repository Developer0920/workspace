package java0507_exception;

public class Java150_exception {

	public static void main(String[] args) { //1
		StringBuffer sb = null; //2
		try { //3
			sb.reverse(); //메모리가 할당되지 않을 때 이런 메세지가 뜸. 메모리에 생성되지 않은 자원을 호출할 때. //4
			System.out.println(sb);
		} catch(NullPointerException ex) { //5
			sb = new StringBuffer("java"); //6
			System.out.println(sb); //7
		} finally { //8
			System.out.println("program end"); //9
		} //10
		
	} //end main() //11

} //end class
