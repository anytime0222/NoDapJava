package cordingExercise;

import java.util.ArrayList;
import java.util.Collections;

public class DivideNumArr {
	public static void main(String[] args) {
		int[] arr = {2,36,1,3};
		int divisor = 11;
		
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i]%divisor != 0 ){
				continue;
			}
			else {
				newArr.add(arr[i]);
			}		
			
		}
		
		
		if(newArr.size()==0) {
			newArr.add(-1);
		}
		
		Collections.sort(newArr);
		
		int[] answer = new int[newArr.size()];
				
		for(int i = 0 ; i < newArr.size(); i++) {
			answer[i]=newArr.get(i);
		}
				
	}
}
