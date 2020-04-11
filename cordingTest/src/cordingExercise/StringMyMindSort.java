package cordingExercise;

import java.util.Collections;
import java.util.HashMap;

public class StringMyMindSort {
	
	public static void main(String[] args) {
		
		String[] strings = {"abce","abcd","cdx"};
		int n = 2;
		String a = "";
		
		String[][] newArr = new String[strings.length][2];
		
		for(int i = 0 ; i < strings.length ; i++) {
			newArr[i][0]=(strings[i].substring(n, n+1));
			newArr[i][1]=strings[i];
			
			System.out.println(newArr[i][0]);
			System.out.println(newArr[i][1]);
		}
		
		System.out.println( Integer.parseInt((newArr[1][0])));
		
		
		
		
		
	}
}
