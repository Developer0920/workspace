package java0521_collection.prob;

import java.util.ArrayList;


public class BookManager {
	public static int getRentalPrice(ArrayList<BookDTO> bookList, String kind) {
		// 구현하세요.
		int sum= 0;
		for(BookDTO bd:bookList) {
			if(bd.getKind().equals(kind)) {
				sum +=bd.getRentalPrice();
			}
		}
		return sum;
	}//end getRentalPrice()
}//end class






