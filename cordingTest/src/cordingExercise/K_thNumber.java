package cordingExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class K_thNumber {

	
	public static void main(String[] args) {
		int [] array = {1,5,2,6,3,7,4};
		int [][] commands = { {2,5,3}, {4,4,1}, {1,7,3} };
		int [] answers = new int[commands.length];
		for(int i = 0 ; i<commands.length ; i++) {
			
					 
			ArrayList<Integer> newArr = new ArrayList<Integer>();
			
			for(int j = commands[i][0]-1 ; j <= commands[i][1]-1 ; j++ ) {
				newArr.add(array[j]);
							
			}
			
			Collections.sort(newArr);
			answers[i] = newArr.get(commands[i][2]-1);
			
		}
		
		System.out.println(Arrays.toString(answers));
	}
	
}
