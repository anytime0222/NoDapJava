package CordingExercise;

import java.util.Arrays;
import java.util.Collections;

public class SortAlgo {

	public static void main(String[] args) {
		int[] a = {9,2,3,6,5,1,7};
		
		int temp;
		int[] newArr = new int[a.length];
		for(int i = 0 ; i < a.length ; i ++) {
			temp = a[i];
			
			for(int j = i ; j < a.length ; j++) {
				if(temp > a[j]) {
					temp = a[j];
					
					a[j] = a[i];
					a[i] = temp;
				}
				else {
					continue;
				}
			}
			
		}
		System.out.println(Arrays.toString(a));
		

	}

}
