package CordingExercise;

import java.util.ArrayList;
import java.util.Arrays;

public class NoSameNum {

	public static void main(String[] args) {
		
		int[] arr = {4,4,4,3,3,9,9,1,2,3,5,4,3,2,4,3,1,2,3,2,2,0,0,0,0,0,0,0,1,0,0,0};
		
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		
		int temp = 0 ;
		
		for ( int i = 0; i < arr.length ; i ++) {
			if(i>0 && temp == arr[i]) {
				continue;
			}
			else {		
				temp = arr[i];
			}
			newArr.add(temp);
		}
		
		int[] answer = {};
		for(int i = 0 ; i < newArr.size() ; i++) {
			answer[i]=newArr.get(i);
		}

		System.out.println(Arrays.toString(answer));
		
	}

}
