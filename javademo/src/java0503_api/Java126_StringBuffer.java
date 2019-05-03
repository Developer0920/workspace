package java0503_api;

public class Java126_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test"); //StringBuffer라는 클래스를 이용
		// 4인덱스에 ",jsp" 문자열을 삽입한다.
		sb.insert(4,  ",jsp"); //java,jsp test

		
		// 4인덱스부터 8인덱스 미만 사이의 문자열을 삭제한다.
		sb.delete(4,  8); //java test
		
		// 특정문자 삭제. 0인텍스의 문자를 삭제한다.
		sb.deleteCharAt(0); //ava test
		
		//진짜 편한 거. 문자열을 반대로 변경해서 리턴한다.
		sb.reverse(); // tset ava //StringBuffer 에서만 제공.. 따라서 String을 StringBuffer로 바꿔서 리버스. 그리고 다시 String으로 바꿔주면 된다.
		System.out.println(sb); //문자열을 리턴하도록 오버라이딩 된 것		
		
		String data = "mybatis orm"; //생성자에서 보면.. StrigBuffer 를 받아서 생성할 수 있음
		StringBuffer sf = new StringBuffer(data);
		sf.reverse();
		String sn = sf.toString();
		System.out.println(sn); //여기서 객체는 총 3개가 만들어짐
		
		char[] arr = new char[] {'k', 'o', 'r', 'e', 'a'};
		/*방법1
		StringBuffer sbf = new StringBuffer();
		sbf.append(arr);
		sbf.reverse();
		System.out.println(sbf);
		*/
		
		String sng = new String(arr);
		StringBuffer sa = new StringBuffer(sng);
		sa.reverse();
		System.out.println(sa);
		
		

	} //end main()

}// end class
