package java0521_collection;

public class Java171_List {

	public static void main(String[] args) {
		UserList uList = new UserList();
		uList.add(10);
		uList.add(20);
		uList.add(30);
		
		uList.add(40); //다음 과정을 구분해서 가르치는 방법은 없을까??
		
		System.out.println(uList.size());
		
		for(int i=0; i<uList.size(); i++) {
			int data = (Integer)uList.get(i);
			System.out.println(data);			
		}
		
		
	} //end main()

} //end class
