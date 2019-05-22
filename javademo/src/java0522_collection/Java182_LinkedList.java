package java0522_collection;

/*
 * stack
 * 1 LIFO(Last In First Out) : 마지막에 저장된 요소를 먼저 꺼낸다.
 * 2 수식계산, 수식괄호검사, undo/redo, 뒤로/앞으로
 */

import java.util.LinkedList;

public class Java182_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nStack = new LinkedList<String>();
		//추가 //stack을 사용하려면 push()메소드를 써야 한다.
		nStack.push(new String("java"));
		nStack.push(new String("jsp"));
		nStack.push(new String("spring"));
		
		System.out.println("size:" + nStack.size());
		
		/*
		System.out.println(nStack.pop());
		System.out.println(nStack.pop());
		System.out.println(nStack.pop());
		*/
		
		//반복문을 쓰면 안 가져옴. 왜? pop은 get()과 달리 완전히 꺼내오기 때문이다. 그럼 뭘 써야 할까? isEmpty!
		for(int i=0; i<nStack.size(); i++)
			System.out.println(nStack.pop());
		
		while(!nStack.isEmpty())
			System.out.println(nStack.pop());	

	} // end main()

} // end class
