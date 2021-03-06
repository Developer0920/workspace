package java0419_statement;

/*
 * switch(식){ // 조건식이 아니다!
 * 	case 값1 : 문장1; break;
 * 	case 값2 : 문장2; break;
 * 	case 값3 : 문장3; break;
 * 	default : 문장4;
 * }
 * 
 * 식의 결과 타입 : byte, short, char, int,
 * 				enum(jdk7버전), String(jdk7버전)
 * 
 * switch~case에서 break를 만나면 현재 수행 중이 조건문을 완전히 빠져나와, 다음 문장을 수행한다.
 *  
 */
public class Java025_switch {

	public static void main(String[] args) {
		int jumsu = 85;
		char res;
		
		// jumsu >=90 'A', jumsu >=80 'B', jumsu >=70 'C', jumsu >=60 'D', jumsu < 60 'F'
		
		
		/*
		 * if(jumsu >= 90) res = 'A'; // 한 문장이면 {} 생략 가능 else if(jumsu >= 80) res = 'B';
		 * else if(jumsu >= 70) res = 'C'; else if(jumsu >= 60) res = 'D'; else res =
		 * 'F';
		 */
		 
		
		switch(jumsu/10) {
		case 10 : 
			res='A'; break; //case 9와 같은 문장이므로 제거 가능
		case 9 : 
			res='A'; break;
		case 8 : 
			res='B'; break;
		case 7 : 
			res='C'; break;
		case 6 : 
			res='D'; break;
		default : 
			res = 'F'; break;
		}
		
		//break가 없으면 그냥 다음 case 문장을 수행함.(멍청한 노예다)
		//순서 바꿔도 상관없다. 하지만 가독성을 생각한다면 그러지 말자. 귀싸대기 맞는다.
			
		
		//System.out.println("너의 등급은 " + res);
		System.out.printf("%d점수는 %c학점입니다.\n", jumsu, res);

		
		
	} // end main()

} // end class
