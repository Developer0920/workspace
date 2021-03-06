package java0430_inheritance.prob.part05;
/*
  다음을 출력하시오.

[실행결과]
<최근수입현황>
일자			품목		세번		세율	담당관세사
2019-04-30	살아있는 말	0101	0%	이성민
2019-04-30	프린터	8443	8%	엄지훈
2019-04-30	자동차	8703	10%	한규현
2019-05-03	펜		9608	8%	김주희
2019-05-03	모니터	8523	8%	김수빈
====================================
<특정일자 처리결과>
2019-05-03 수입품목 처리현황은 다음과 같습니다.
2019-05-03	펜		9608	8%	김주희
2019-05-03	모니터	8523	8%	김수빈
 */
public class MyProblem {
	public static void main(String[] args) {
		//객체 생성
		Result rs[]  = new Result[5];
		rs[0] = new Result("2019-04-30", "살아있는 말", "0101", 0, "이성민");
		rs[1] = new Result("2019-04-30", "프린터", "8443", 8, "엄지훈");
		rs[2] = new Result("2019-04-30", "자동차", "8703", 10, "한규현");
		rs[3] = new Result("2019-05-03", "펜", "9608", 8, "김주희");
		rs[4] = new Result("2019-05-03", "모니터", "8523", 8, "김수빈");
		
		System.out.println("<최근수입현황>");
		System.out.printf("일자		품목	세번	세율	담당관세사\n");
		for(Result xxx : rs) {
			System.out.println(xxx.toString());
		}
		System.out.println("==================================");
		System.out.println("<특정일자 처리결과>");
		
		//사용자 입력
		String dt = "2019-04-30";
		
		System.out.printf("%s 수입품목 처리현황은 다음과 같습니다.\n", dt);
		System.out.printf("일자		품목	세번	세율	담당관세사\n");
		for(int i = 0 ; i<rs.length; i++) {
			if(rs[i].getDate()==dt) {
				System.out.println(rs[i].toString());
			}
		}
		
		//메소드 실행
		
		
	}
}
