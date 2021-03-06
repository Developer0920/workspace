package java0502_api;

import java.util.regex.Pattern;

public class Java121_RegEx {	

	public static void main(String[] args) {
		
				
		String sn = "12s345";
		String sb = "2bsba5e";
		String st = "aetwefcc";
		
		//a-zA-Z_*$가 sn변수에 포홤돼 있으면 true, 아니면 false을 리턴한다.
		System.out.println(sn.matches(".*[a-zA-Z_*$].*")); // '-' 은 범위 안의 모든 문자. 특수문자는 *$
		
		//sn변수에 0-9가 포함돼 있으면 true 아니면 false
		System.out.println(sn.matches(".*[0-9].*")); //중간에 0-9
		System.out.println(sn.matches(".*\\d.*")); // \d는 숫자를 의미
		
		//sb변수에 저장된 값이 2로 시작되면 true 아니면 false를 리턴한다.
		System.out.println(sb.matches("2.*")); //2로 시작
		
		//sb변수에 저장된 값이 2로 시작해서 5로 끝나면 true 아니면 false를 리턴
		System.out.println(sb.matches("2.*5"));
		
		
		//sb변수에 저장된 값이 a이거나 b로 시작하고 5자리 문자열이면 true 아니면 false를 리턴한다.
		System.out.println(sb.matches("[ab].{5}"));
		
		//st변수에 저장된 문자열이 a 또는 b로 시작하고 cc로 끝나면서
		//사이에는 임의 문자 최소 1개에서 5개를 포함.
		
		System.out.println(st.matches("[ab].{1,5}cc")); //.은 임의의 문자?
		System.out.println("========================================================");
		
		
		
		
		//이게 뭘 하는 거냐?	
		
		String input1="11mar123dd";
		String input2="maaaaa";
		String input3="252352";
		
		/*
		 * 
		 * Pattern.matcher() : 빠르게 어떠한 text(String)이 주어진 Pattern에
		 *          있는지를 확인한다.
		 * Pattern.comile(): 여러개의 텍스트를 재사용 가능한 Pattern 
		 *          인스턴스로 컴파일 한다.
		 * find() : 최초의 패턴 위치로 이동한 뒤 True 반환, 없으면 false 
		 * find(int start) : start 위치 부터 find 
		 * start() : 매칭되는 패턴의 시작 인덱스 반환 
		 * start(int group) : group이 매칭되는 시작 인덱스 반환
		 * end() : 매칭된 패턴 한칸 뒤 인덱스 반환 
		 * end(int group) : 지정되 그룹이 매칭되는 한칸 뒤 인덱스 반환 
		 * group() : 최초로 그룹 매칭된 패턴을 반환 group(int group) : 그룹 매칭된 부분중 group번째 패턴을 반환 
		 * groupCount() : 패턴내 그룹핑(괄호로 묶은 패턴들)의 갯수 반환
		 * matches() : 패턴이 전체 문자열과 일치하면 True
		 * 
		 */
		
		//\\w : 영문, 숫자
		//System.out.println(input1.matches("[\\w]{5,10}")); //w는 영문자나 숫자
		
		/*방법1
		Pattern pn = Pattern.compile("[\\d]"); //패턴... api에 나와 있음 
		Matcher mc = pn.matcher(input1);
		System.out.println(mc.find());
		*/
		
		//방법2
		System.out.println(Pattern.compile("[\\d]").matcher(input1).find());
		
		
		//미리 패턴을 설정해 놓는 거다.
		//사용자가 조건에 맞게 입력을 하게 하는 방식
		
		//이것들이 무슨 의미인 거지?
		System.out.println(Pattern.compile("[a-zA-Z]").matcher(input1).find()); //matcher에 "[a-zA-Z]" 을 포함하고 있느냐
		
		System.out.println(input1.matches("[\\w]{5,10}")
				&& Pattern.compile("[\\d]").matcher(input1).find()
				&& Pattern.compile("[a-zA-Z]").matcher(input1).find());
		
		System.out.println(input2.matches("[\\w]{5,10}")
				&& Pattern.compile("[\\d]").matcher(input2).find()
				&& Pattern.compile("[a-zA-Z]").matcher(input2).find());
		
		System.out.println(input3.matches("[\\w]{5,10}")
				&& Pattern.compile("[\\d]").matcher(input3).find()
				&& Pattern.compile("[a-zA-Z]").matcher(input3).find());		
		
		
	} //end main()

} //end class
