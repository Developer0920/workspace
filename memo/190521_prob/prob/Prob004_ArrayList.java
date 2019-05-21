package java0521_collection.prob;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 2 
 * 10 
 * 4 
 * 6
 */
public class Prob004_ArrayList {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 3, 2, 7 };
		int[] num = { 1, 10, 15, 4, 6 };
		ArrayList<Integer> v = merge(arr, num);
		for (Integer it : v)
			System.out.println(it);
	}// end main()

	public static ArrayList<Integer> merge(int[] arr, int[] num) {
		// arr,num배열을 병합한후 2의 배수만 리턴하는 프로그램을 구현하시오.
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int a:arr) {
			al.add(a);
		}
		for(int a:num) {
			al.add(a);
		}
		
		Iterator<Integer> iter = al.iterator();
		while(iter.hasNext()) {
			int a = iter.next();
			if(a%2==1) {
				iter.remove();
			}
		}
		
		
		return al;

	}// end merge();

}






