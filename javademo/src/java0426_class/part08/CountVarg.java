package java0426_class.part08;


//a와 b처럼 개수만이 차이가 날 때... 이걸 하나로 정의해서 사용할 수 있다. variable argument?

public class CountVarg {

	void addValue(int...arr) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
		}
		System.out.println(sum);	
	} //end addValue()
	
	//고정매개변수와 가변매개변수를 함께 가용코자 할 때
	//언제나 고정 매개변수를 먼저 사용
	//오버로딩과 함께 사용 가능
	void sumValue(String name, int...arr) {
		int sum = 0;
		for (int i=0; i < arr.length; i++) {
			sum += arr[0];
		}
		System.out.printf("name=%s sum=%d\n",  name, sum);
		
	} //end sumValue()
} //end class


