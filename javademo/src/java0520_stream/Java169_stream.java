//일단 skip!!

//데이터직렬화

//package문
package java0520_stream;

//import문
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.imageio.stream.FileImageInputStream;

//객체를 직렬화해보자.
//직렬화 하려면 Serializable 인터페이스를 구현해야 한다.

/*
 * 직렬화(serializable)
 * 1 객체를 연속적인 데이터로 변환하는 것이다.
 *   반대는 역질렬화
 * 2 객체의 멤버변수들의 값을 일렬로 나열하는 것이다.
 * 3 객체를 저장하기 위해서는 객체를 직렬화해야 한다.
 * 4 객체를 저장한다는 것은 객체의 멤버변수의 값을 저장한다는 것
 * 5 객체를 직렬화하여 입출력할 수 있는 스트림 : ObjectInputStream, ObjectOutputStream
 */

// 객체를 메모리에서 사라지게 하지 않고(?) 계속 쓸 수 있게 만드는 것(?)
// 메모리에 저장돼 있는 자료를.. p.u.( )

//객체를 저장하기 위해서는(객체의 멤버변수 값을 저장하기 위해서는) 직렬화를 시켜줘야 한다.

class Phone /*직렬화*/ implements Serializable{
	String name;
	int price;
	
	public Phone() {
		
	}

	public Phone(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		
		return name + "\t" + price;
	}
		
}// end Phone


//직렬화하지 않고 일단 저장을 해보자.
public class Java169_stream {

	public static void main(String[] args) {
		File file = new File("src/java0520_stream/phone.dat");
		FileOutputStream fs = null;
		ObjectOutputStream os = null;
		FileInputStream fi = null;
		ObjectInputStream oi = null;
		
		try {
			fs = new FileOutputStream(file);
			os = new ObjectOutputStream(fs);
			//이제 저장을 해보자.
			Phone p = new Phone("android",  5000);
			os.writeObject(p);			
			os.writeObject(new String("java"));			
			System.out.println("객체저장");
			os.flush();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		
		/*
		 * 객체를 저장하려면 직렬화가 돼 있어야 한다. 따라서 오류가 뜸.
		 * java.io.NotSerializableException: java0520_stream.Phone
			at java.io.ObjectOutputStream.writeObject0(Unknown Source)
			at java.io.ObjectOutputStream.writeObject(Unknown Source)
			at java0520_stream.Java169_stream.main(Java169_stream.java:68)

		 */
		
		System.out.println("///////////////////////////////////////////////");
		try {
			fi = new FileInputStream(file);
			oi = new ObjectInputStream(fi);
			//이제 읽어와 보자.
			Phone p = (Phone)oi.readObject(); //Phone으로 다운캐스팅
			System.out.println(p.toString()); //오.. 저장된 값이 나온다.
			//실제 파일이 저장될 때, Object로 저장. upcasting이 발생돼서 저장된 것. phone의 조장은 object.
			//따라서 꺼내올 때는 downcasting을 해줘야 한다.
						
			//스트링타입의 객체도 저장을 해줄 수 있다.		
			
			String sn=(String)oi.readObject();
			System.out.println(sn.toString());
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
		
	

	} //end main()

} //end class
