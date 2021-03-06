package java0430_inheritance.part08;
/*
 * [출력결과]
 * 1000량의 물을 뿌린다
 * 8인승 차량입니다.
 */
public class Java099_inheritance {

	public static void main(String[] args) {
		//객체 생성
		FireEngine fe = new FireEngine();
		OwnerEngine oe = new OwnerEngine();
		
		//값 세팅
		fe.setWater(10000);
		oe.setSeat(8);
		
		//메소드 호출
		fe.waterSpread();
		oe.information();

	} //end main()

} //end class
