package cordingExercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Carpet_LV2_1 {

	public static void main(String[] args) {

		int brown = 12;
		int red = 6;
		int[] answer = {0,0};
		int total = brown + red;
		
		Carpet_LV2_1 c = new Carpet_LV2_1();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> comp = new ArrayList<Integer>();
		
		for(int i = 1 ; i <= total ; i++) {
			
			if(total%i==0) {
				arr.add(i);
			}
		}
		
		if(arr.size()%2==0) {
			answer[0]=arr.get((arr.size()/2));
			answer[1]=arr.get((arr.size()/2)-1);			
		}
		else {
			answer[0]=arr.get(arr.size()/2);
			answer[1]=arr.get(arr.size()/2);
		}
		System.out.println(arr);
		System.out.println(Arrays.toString(answer));
		
		
	}
	
	public int calc(int x, int y) {
		
		int answer=0;
		answer = ((x+2)*2) + (y*2); 
		
		return answer;
	}

}
