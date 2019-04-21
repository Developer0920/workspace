package java0419_statement;
/*
 * [출력결과]
 * station = "KBS", channel = 7 => 닥터포스터
 * station = "KBS", channel = 9 => 국수의 신
 * station = "MBC" => 몬스터
 * station = "EBS" => 한국기행
 */

public class Java024_if {

	public static void main(String[] args) {
		int channel = 11;
		String station = "EBS";
		
		if(station != "KBS" && station != "MBC" && station != "EBS") {
			System.out.println("거긴 방송국이 아니다. 멍충아.");
			return;
		}
		
		if(station == "KBS") {
			if(channel != 7 && channel != 9) {
				System.out.println("7번이나 9번만 입력해. 멍충아.");
				return;
			} else if(channel==7) {
				System.out.println("닥터포스터");
			} else {
				System.out.println("국수의 신");
			}
			
		} else if(station == "MBC") {
			System.out.println("몬스터");
		} else {
			System.out.println("한국기행");
		}
		
	} //end main()

} //end class
