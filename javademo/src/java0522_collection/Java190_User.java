package java0522_collection;
//앞의 예제와의 차이는.. 제너릭을 명시하는 부분이 제한이 따름.
//API에서 이런 게 나왔을 때, 이런 용도라는 걸 알기 위해 배운 거다.
class Average<T extends Number> { //Number나 Number를 상속받은 것만 가능 //즉 제한을 둘 필요가 있는 경우에 사용
	private T[] list;
	
	public Average() {
		
	}
	
	public Average(T[] list) {
		this.list = list;
	}
	
	public double findAverage() {
		double sum = 0.0;
		for (T data : list) {
			sum += data.doubleValue();			
		}
		return sum / list.length;
	}
	
} //end class

public class Java190_User {

	public static void main(String[] args) {
		Integer it[] = new Integer[] {1, 5, 3, 2};
		Average<Integer> av = new Average<Integer>(it); //Integer는 Number의 자식이므로 생성이 됨.
		System.out.println(av.findAverage());
		
		//이번에는.. String으로 해보자.
		//Average<String> ae = null; //오류가 뜬다.
		
		Number nb[] = new Number[] {2, 5.3F, 4.5};
		Average<Number> aa = new Average<Number>(nb);
		System.out.printf("%.1f\n", aa.findAverage());
		
		
	} //end main()

} //end class
