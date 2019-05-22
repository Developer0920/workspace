package java0522_collection;

import java.util.LinkedList;

//자료구조... 큐라는 게 제공됨

/*
 * Queue
 * 1 FIFO(first in first out) : 제일 먼저 저장한 요소를 제일 먼저 꺼내온다.
 * 2 최근사용문서, 인쇄작업대기목록, 버퍼
 * 
 */
public class Java183_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> nQueue = new LinkedList<String>();
		//큐 처리를 할 때는 offer()메소드를 사용
		//추가
		nQueue.offer(new String("java"));
		nQueue.offer(new String("jsp"));
		nQueue.offer(new String("spring"));
		
		//큐는 입구 출구가 있음.
		while(!nQueue.isEmpty())
			System.out.println(nQueue.poll());
		
		
		
				

	} //end main()

} //end class
