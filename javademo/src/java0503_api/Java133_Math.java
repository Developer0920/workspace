package java0503_api;

import java.util.Random;

public class Java133_Math {

	public static void main(String[] args) {
		Random ran = new Random();
		int[] num = new int[5]; //1부터10까지
		
		for(int i=0; i<num.length ; i++) {
			//num[i] = (int)(Math.floor(Math.random()*10))+1;
			num[i] = ran.nextInt(10)+1;
			
			
			//중복체크			
			for(int j=0; j<i; j++) {
				if(num[i]==num[j]) {
					--i;
					break; //해당 반복문을 빠져나옴.
				}				
			}
		}
		for(int data : num)			
			System.out.printf("%4d",data);
		
		/*내꺼
		for(int i=0; i<5 ; i++) {
			num[i] = (int)(Math.random()*10);
		}
		
		for(int data : num)			
			System.out.println(data+1);
		*/
		
		
		
		

	}

}
