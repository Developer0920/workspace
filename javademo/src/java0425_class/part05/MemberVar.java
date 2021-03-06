package java0425_class.part05;
//배열에서 제공되는 기본값과 같음
public class MemberVar {	
	// 멤버변수는 기본값을 제공한다.(JVM)
	byte var_byte; // 0
	short var_short; // 0
	int var_int; // 0
	long var_long; // 0L
	float var_float; // 0.0F
	double var_double; // 0.0
	boolean var_boolean; // false
	char var_char; // \u0000
	int[] num; // null
	String stn; // null (스트링도 참조 데이터 타입이므로 초기값을 지정하지 않은 경우 기본값으로 null값이 주어짐)	
}// end class


/*원래는 이렇게 돼 있어야 한다.
public MemberVar() {
	
}
*/