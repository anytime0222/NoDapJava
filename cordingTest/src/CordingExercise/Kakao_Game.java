package CordingExercise;

import java.util.ArrayList;
import java.util.Arrays;

public class Kakao_Game {

	public static void main(String[] args) {
		int [][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
	
		int[] moves = {1,5,3,5,1,2,1,4};
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i = 0 ; i < moves.length ; i++) {
			
			int a = moves[i]-1;
			
			for(int j = 0 ; j < board.length ; j++) {
				if(board[j][a]>0) {
					arr.add(board[j][a]);
					board[j][a]=0;
					break;
				}

			}
		}
		
		System.out.println(arr);
		arr.set(1, 4);
		int temp = 0 ;
		
		
		for(int i = 0 ; i < arr.size()-1 ; i++) {
			if(arr.get(i)==arr.get(i+1)&&i>0){
				arr.remove(i);
				arr.remove(i);
				i--;
				i--;
				temp++;
				temp++;
			}else if(arr.get(i)==arr.get(i+1)&&i==0) {
				arr.remove(i);
				arr.remove(i);
				i--;
				temp++;
				temp++;
			}	
			System.out.println(arr);

		}
		
		int answer = temp;
		
		System.out.println(temp);
	}
	
}

