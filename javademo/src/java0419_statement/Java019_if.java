package java0419_statement;
/*
 * if안에 if
 * if(조건식1){
 * 	if(조건식2){
 * 		수행할 문장; //조건식1과 2를 모두 만족할 때 수행
 * 	}else{
 * 		수행할 문장; //조건식1은 만족하고 조건식2는 만족하지 않을 때 수행
 * 	}
 * }else{
 * 		수행할 문장; //조건식1을 만족하지 않을 때 수행
 * }
 */
public class Java019_if {

	public static void main(String[] args) {
		//boolean member = true; //회원 or 비회원
		boolean member = false;
		
		String grade = "일반" ; //회원등급 : vip, 일반
		//회원이고 vip고객이면 30%적립, 회원이고 vip고객이 아닐 때는 10%적립
		//비회원이면 적립금이 없음
		
		if(member) { //회원이면..
			if(grade=="vip") {
				System.out.printf("%s\n",  "30%적립");
			}else{
				System.out.printf("%s\n", "10%적립");
			};
		}else{ //비회원이면..
			System.out.printf("%s\n", "넌 비회원임.");
			
		}
		
		System.out.println("호갱님 감사합니다.");
		
	} //end main()

}// end class
