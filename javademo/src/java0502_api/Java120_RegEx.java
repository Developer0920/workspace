package java0502_api;
//정규화
//정규식은 존나 편한 거다.
// 'regex' 는 정규식을 받을 수 있다는 의미
/*
 * 정규식(Regular Expression)
 * 1 정규식이란 텍스트 데이터 중에서 원하는 조건(패턴)과 일치하는 문자열을 찾아내기 위해 사용하는 것으로 미리 정의된 기호와 문자를 이용해서 작성한 문자열을 말한다.
 * 
 * 
 * 
 */
public class Java120_RegEx {

	public static void main(String[] args) {
		//'a', 'r' 을  '_' 로 바꾸고자 한다.
		String sn = "java korea";
		String sg = "";
		String st = "java       korea";
		
		//기존방법
		/*		
		for(int i=0; i<sn.length(); i++) {
			if(sn.charAt(i)=='a' || sn.charAt(i)=='r') {
				sg +=  "_";
			} else {
				sg += sn.charAt(i);
			}
		}
		System.out.println(sg);
		*/
		
		//이걸 깔끔하게 한 줄로!
		System.out.println("regular expression을 이용한 문자변경");
		System.out.println(sn.replaceAll("[ar]", "_")); //대관호[] 안은 a or r 을 의미한다.
		//sn변수에 저장된 문자열에서 a이거나 r이면 "_" 로 변경한다.
		
		//sn변수에 저장된 문자열에서 a이거나 r이 포함되면 true 아니면 false을 리턴한다.
		//sn= "aett";
		//sn = "a";
		
		//System.out.println(sn.matches("ar")); //100%일치해야
		System.out.println(sn.matches("[ar].{2,3}")); // '.'임의의 문자 하나를 의미. 정확한 개수지정은 { }
		System.out.println(sn.matches("[ar].*")); // '*'임의의 문자 0개 이상, '+' 는 한 개 이상.
		System.out.println(sn.matches(".*[ar].*")); //이런 애들을 정규식이라 하는 것
		
		//{2,3}2개부터 3개까지의 공백을 "@"으로 변경한다.
		st = "java                        korea";
		System.out.println(st.replaceAll("\\s{5,6}",  "@")); //  '\s'는 공백을 표현. 이걸 문자열로 값을 넣어주기 위해 한번더 -- '\\s')
		
	} //end main

} //end class
//정규식을 잘 쓰면 코딩이 심플해진다.



