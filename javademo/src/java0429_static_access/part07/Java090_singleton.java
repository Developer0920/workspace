package java0429_static_access.part07;

public class Java090_singleton {

	public static void main(String[] args) {
		MemberDAO dp = MemberDAO.getInstance();
		//MemberDAO dp = new MemberDAO(); //이거 안 됨
		
		//MemberDAO dp = MemberDAO.dao; //public이면 이게 가능.. 객체 하나임. 하지만.. 이렇게 직접 접근하진 않는다.
		
		dp.display();
		
		/*
		MemberDAO da = new MemberDAO();
		da.display();
		*/
		
		MemberDAO ds = MemberDAO.getInstance(); //같은 객체를 가리키게 됨.
		dp.display();
		
		System.out.println(dp==ds);
		
		StudentDAO sa = new StudentDAO();
		StudentDAO st = new StudentDAO();
		System.out.println(sa==st); //false
		
		
	} //end main()

} //end class

//객체 생성에 대한 이슈
//객체를 하나만 생성해서 같이 참조를 하게 할 수 있다. 이게 singleton 패턴
//생성자의 접근제어자를 private으로 준다.
//생성자가 정의돼 있는 클래스에서 객체 생성.. 그리고 밑에서 리턴. 그리고 제어자 static을 추가.