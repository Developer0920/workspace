package java0429_static_access.part04;
//args에 대하여..
//java Java086_main hong --- 이런 식으로 인자 전달 (쓸 일 별로 없음, 웹에서는 main메소드 필요 없다?)
//run configuration..
//static을 생략하면 main()을 못찾는다.
public class Java086_main {

	public static void main(String[] args) {
		//System.out.println(args[0]); //컴파일 단계가 아닌, 실행단계에서 오류 발생.
		//System.out.println(args[1]);
		for(String data : args) {
			System.out.println(data);
		}
	} //end main()

} //end class
