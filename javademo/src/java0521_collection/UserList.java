package java0521_collection;
/*
 * 선형리스트(Linear List)
 * 1 순서리스트(Ordered List)
 * 2 자료들 간에 순서를 갖는 리스트
 * 3 선형 리스트에서 원소를 나열한 순서는 원소들의 순서가 된다.
 */


//배열 또는 연결리스트로 저장.
//여기서는 배열을 가지고 자료를 구현
//연결리스트에 쓰이는 게 노드.
public class UserList {
	Object sale[] = new Object[3];
	int point = 0;
	//이런 식으로 직접 구현. 컬렉션이 없다면(?(
	
	public void add(Object data) {
		if(sale.length==point) {
			Object[] arr = new Object[sale.length*2];
			System.arraycopy(sale, 0, arr, 0, sale.length);
			sale = arr;
		}
		sale[point++] = data; //연산이 끝나고 +1이 됨. 0번째 인덱스의 데이터값은 data에 넣고나서 1이 증가
		
	} //end add
	
	public Object get(int index) {
		return sale[index];
		
	}
	
	//요소의 크기
	public int size() {
		return point; //point값을 넘기면 된다.		
	}
	
	public Object remove(int index) {
		Object obj = sale[index];
		for(int i=index; i<point; i++) {
			sale[i] = sale[i+1];
			
		}
		point--;
		return obj;
	} //실제 이런 식으로 해서 구현돼 있다. //이걸 어떻게 공부해야 하나...????
	//실제 벡터가 이런 식으로 구현돼 있기 때문에 간단하게 벡터를 사용할 수 있는 것이다. 이게 핵심이다.
	
	
	
	
} //end class

