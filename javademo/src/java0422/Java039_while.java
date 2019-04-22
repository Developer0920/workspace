package java0422;

public class Java039_while {

	public static void main(String[] args) {
		int cnt=1;
		while(true) {
			System.out.println(cnt++);
			if(cnt==6) {
				break; //실행중인 반복문을 빠져나옴
			}
		}

	}//end maim()

}//end class
