package java0522_collection;

class Box<T>{// 제너릭을 마음대로 지정해서 쓸 수있다.
	private T data;

	public Box() {
		
	}	

	public Box(T data) {		
		this.data = data;
	}


	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
	
} //end class
public class Java189_User {

	public static void main(String[] args) {
		Box<Integer> box = new Box<Integer>();
		box.setData(new Integer(10)); //Integer로 넘겨 줌. 그러면 Integer로 생성함
		System.out.println(box.getData());
		
		//생성자를 이용
		Box<String> box2 = new Box<String> ("java");
		System.out.println(box2.getData());
		
	} //end main()

} //end class
