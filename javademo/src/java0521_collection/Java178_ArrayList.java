package java0521_collection;

import java.util.ArrayList;

public class Java178_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("oracle");
		aList.add("mysql");
		aList.add("mssql");
		String[] arr = display(aList);
		for (String data : arr)
			System.out.println(data);	

	} // end main()
	
	public static String[] display(ArrayList<String> aList) {
		//이걸 다시 String[] 로 만들어서 출력하라.
		/*
		String[] stn = new String[aList.size()];
		for(int i=0; i<stn.length; i++)
			stn[i]=aList.get(i);
		return stn;*/
		
		return aList.toArray(new String[aList.size()]); //이렇게 한 방에 끝낸다.
		
		
	} //end display()

} //end class
