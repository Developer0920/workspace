package java0418_basic.prob;
/*
* 동전교환프로그램
* 1 가장 적은 동전으로 교환할 수 있는 프로그램작성하시오
* 2 [출력결과]
*   500원: 15개 
    100원: 2개
    50원: 1개
    10원: 2개
    1원: 7개
    */

public class Prob05 {

	public static void main(String[] args) {
		int money = 7777;
		int mok=money/500;
		
		//여기에 작성하시오.
		
		int moHundred;
		int moFifty;
		int moTen;
		int moOne;
		
		moHundred = (money - mok * 500)/100;
		moFifty = (money - mok * 500 - moHundred * 100)/50;
		moTen = (money - mok * 500 - moHundred * 100 - moFifty * 50)/10;
		moOne = money - mok * 500 - moHundred * 100 - moFifty * 50- moTen * 10;
		
		System.out.println("500원: " + mok + "개");
		System.out.println("100원: " + moHundred + "개");
		System.out.println("50원: " + moFifty + "개");
		System.out.println("10원: " + moTen + "개");
		System.out.println("1원: " + moOne + "개");
		
		
		/* 사고과정
		 * 1. 500원
		 * 2. 100원
		 */

	}//end main()

}//end class


