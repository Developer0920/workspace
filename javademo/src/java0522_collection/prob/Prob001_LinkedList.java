package java0522_collection.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * LinkedList
 * 1 List : 순서적으로 데이터를 저장
 * 2 Stack : LIFO
 * 3 Queue : FIFO
 */

public class Prob001_LinkedList {

	public static void main(String[] args) {
		/*
		 * booklist.txt파일의 데이터를 Stack으로 처리하여 출력되도록 
		 * 프로그램을 구현하시오.
		 *  title             	publisher   writer     price
		 	JSP Programming  	JSPPub     JSPExpert   21000
			Servlet Programming WeBBest 	GoodName	 20000
			JDBC Programming 	JDBCBest 	NaDo SQL 	30000
			SQL Fundmental 		SQLBest		 Na SQL 	47000
			Java Programming 	JavaBest	 Kim kava	 25000
		 */
		
		//파일을 불러온다.
		//한 줄씩 불러와 자른다.
		//잘라서 넣는다.
		//출력한다.
		
		//파일을 불러온다.
		try {
			Scanner sc = new Scanner(new File(".\\src\\java0522_collection\\prob\\booklist.txt"));
			LinkedList<String> nStack = new LinkedList<String>();
			
			while(sc.hasNextLine()) {
				String[] line = sc.nextLine().split("/");
				String data = line[0] + "   " + line[1] + "   " + line[2] + "   " + line[3];
				nStack.push(data);				
			}			
			
			while(!nStack.isEmpty())
				System.out.println(nStack.pop());	
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		
		//한 줄씩 불러와 자른다.
		//잘라서 넣는다.
		//출력한다.
		
		
	
	}//end main()

}//end class










