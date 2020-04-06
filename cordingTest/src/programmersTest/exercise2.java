package programmersTest;

import java.util.ArrayList;
import java.util.Arrays;

public class exercise2 {
	public static void main(String[] args) {

		//1, 1 ,2 ,3 ,5, 8, 13, 21, 34 ,,,,,
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(1);
		int a = 1;
		int b = 0;
		
		System.out.println(arr);
		
		for(int i = 0 ; i < 10 ; i++) {
			int z = arr.get(i)+arr.get(i+1);
			arr.add(z);
			System.out.println(z);
			
			
		}
		System.out.println(arr);

		
		
		
		
	
	}
}


