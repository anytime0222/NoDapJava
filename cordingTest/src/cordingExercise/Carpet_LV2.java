package cordingExercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Carpet_LV2 {

	public static void main(String[] args) {

		int brown = 18;
		int red = 6;
		int[] answer = {0,0};
		int total = brown + red;
		
		Carpet_LV2 c = new Carpet_LV2();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> comp = new ArrayList<Integer>();
		for(int i = 1 ; i <= red ; i++) {
			
			if(red%i==0) {
				comp.add(i);
			}
		}
		
		if(comp.size()>1 && comp.size()%2==0) {
			
			
			
			System.out.println(comp);
			int a=0;
			int ap = 0;
			int am = 1;
			int z = comp.size()/2;
			while(a!=brown) {
				
				if(c.calc(comp.get(z+ap),comp.get(z-am))==brown) {
					System.out.println("예쓰");
					a=c.calc(comp.get(z+ap),comp.get(z-am));
				}
				else {
					System.out.println("노우");
					ap++;
					am++;
				}	
			}
			
			System.out.println(comp.get(z+ap));
			System.out.println(comp.get(z-am));
			
			answer[0]=comp.get(z+ap)+2;
			answer[1]=comp.get(z-am)+2;
			
			System.out.println(Arrays.toString(answer));
			
		}
		else {
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
//		
//		
//		
//		
//		
//		
//		
//		for(int i = 1 ; i <= total ; i++) {
//			
//			if(total%i==0) {
//				arr.add(i);
//			}
//		}
//		
//		if(arr.size()%2==0) {
//			answer[0]=arr.get((arr.size()/2));
//			answer[1]=arr.get((arr.size()/2)-1);			
//		}
//		else {
//			answer[0]=arr.get(arr.size()/2);
//			answer[1]=arr.get(arr.size()/2);
//		}
//		System.out.println(arr);
//		System.out.println(Arrays.toString(answer));
		
		
	}
	
	public int calc(int x, int y) {
		
		int answer=0;
		answer = ((x+2)*2) + (y*2); 
		
		return answer;
	}
//	
//	public int[] isok(int x, int y,int index) {
//		
//		if(index)
//		int[] answer= {0,0};
//		answer = 
//		
//		return answer;
//	}

}
