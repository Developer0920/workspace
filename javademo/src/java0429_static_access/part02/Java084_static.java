package java0429_static_access.part02;


public class Java084_static {

	public static void main(String[] args) {
		OrderStatic st=null;
		st = new OrderStatic(); //초기화 보다 어떤 문장을 먼저 수행해야 할 때, static블록을 사용한다.
		st.prn();
	} //end main()

} //end class
