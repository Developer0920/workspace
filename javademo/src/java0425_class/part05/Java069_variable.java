package java0425_class.part05;

public class Java069_variable {

	public static void main(String[] args) {
		MemberVar mv=new MemberVar(); //MemberVar() <-
		System.out.printf("var_byte:%d\n", mv.var_byte);
		System.out.printf("var_short:%d\n", mv.var_short);
		System.out.printf("var_int:%d\n", mv.var_int);
		System.out.printf("var_long:%d\n", mv.var_long);
		System.out.printf("var_float:%.1f\n", mv.var_float);
		System.out.printf("var_double:%.1f\n", mv.var_double);
		System.out.printf("var_boolean:%b\n", mv.var_boolean);
		System.out.printf("var_char:%c\n", mv.var_char);
		System.out.printf("int[]=%s\n", mv.num);
		System.out.printf("String=%d\n", mv.stn);	

	} //end main()

}//end class

//자동형변환 : 정수를 실수에 대입할 때도 일어남
