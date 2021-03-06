package java0520_stream.prob;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;




/*
 * [문제]score.txt 파일의 점수 정보를 읽어 들여서 각 학생의 점수 총합을 
 *       콘솔창에 출력하는 입출력 프로그램을 main() 메서드에 구현하시오.
 * 
 * [프로그램 실행결과]
 * kim의 점수 통합 :146
 * hong의 점수 통합 :243
 * park의 점수 통합 :240
 */
public class Prob001_stream {
	
	public static void main(String[] args) {
	     //각 학생의 총점을 출력하는 프로그램을 구현하시오.
		File file=new File("./src/java0520_stream/prob/score.txt");
		
		//파일 내 데이터를 변수에 담는 작업
		RandomAccessFile raf = null;	
		String data = null;		
			try {
				raf = new RandomAccessFile(file, "r");
				while((data = raf.readLine())!=null) {
					String[] dataArray = data.split("[:/]");			
					int sum = Integer.parseInt(dataArray[1]) + Integer.parseInt(dataArray[2]) + Integer.parseInt(dataArray[3]);
					System.out.printf("%s의 점수 통합 : %d\n", dataArray[0], sum);
				}	
			} catch (FileNotFoundException e) {				
				e.printStackTrace();
			} catch (NumberFormatException e) {				
				e.printStackTrace();
			} catch (IOException e) {				
				e.printStackTrace();
			}			
					
		/*
		 * 문자열을 읽어온다.
		 * 스플릿으로 자른다. ':' 기준, '\'기준
		 * 변수에 담는다.
		 * 합계를 구한다.
		 * 반복문을 돌린다.
		 *  
		 */
		
	}//end main()



}//end class











