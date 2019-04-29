package java0429_static_access.part06;

import java0429_static_access.part05.Java87_access; //Java87이 public이어야 import가 가능
//다른 패키지의 클래스를 상속하려면 우선 import 되어야? 응 맞아.
public class Java089_access extends Java87_access{

	public static void main(String[] args) {		
		Java089_access p = new Java089_access(); //이렇게 객체를 생성해야 함
		//System.out.printf("var_private=%d\n",p.var_private);
		//System.out.printf("var_default=%d\n",p.var_default);
		System.out.printf("var_protected=%d\n",p.var_protected); //상속하면 가능
		System.out.printf("var_public=%d\n",p.var_public);
	} //end main()

} //end class