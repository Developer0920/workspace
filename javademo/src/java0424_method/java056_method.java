package java0424_method;

public class java056_method {

	public static void main(String[] args) {
		//stack영역 값이 저장 = 기본데이터 타입
		int a = 10, b = 20;
		int c=a, d=b; // 값복사가 일어났다.(call by value) -- 값을 주는 애랑 받는 애랑 서로 영향이 없음. 값을 줬다고 해서 a, b에 있는 값이 없어지거나 하지 않는다.
		//call by value는 기본 데이터 타입끼리일 때 발생
		
		
		//c,d변수의 값을 교환
		int temp=c;
		c=d;
		d=temp;
		
		System.out.printf("a=%d b=%d\n", a, b);
		System.out.printf("c=%d d=%d\n", c, d);
		
		System.out.println("//////////////////////////");
		
		//stack영역에 주소저장 - 참조데이터 타입
		int[] num = new int[] {10,20};
		int[] arr = num; //주소복사(call by reference)
		
		int imsi=arr[0];
		arr[0]=arr[1];
		arr[1]=imsi;
		
		System.out.printf("num[0]=%d, num[1]=%d\n",  num[0], num[1]);
		System.out.printf("num[0]=%d, num[1]=%d\n",  arr[0], arr[1]);
		//참조데이터 타입은 주소복사가 일어남. 서로 넘겨주는 곳이랑 받는 곳이랑 영향이 간다. 이렇게 되는 걸(call by reference라고 함)
		
		//자 이제, 메소드에 적용을 해보자.

	}//end main()

}//end class
