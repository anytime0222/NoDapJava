package cordingExercise;

import java.util.Arrays;

public class H_index_LV2 {

	public static void main(String[] args) {

		int[] citations = {9,9,9,9,0,0,0};
		
		int answer = 0;
	
		int inyongcount = 0;
		int[] inyong = new int[citations.length];

		
		int maxinyong = 0;
		int[][] level = new int [citations.length][3];
		
		for(int i = 0 ; i < citations.length ; i++) {
			level[i][0]=citations[i]; //인용된 수
			for(int j = 0 ; j < citations.length ; j++) {
				int a = citations[i];
				if(a <= citations[j]) {
					level[i][1]++; //인용된수 이상인것 수
				}else {
					level[i][2]++; //인용 안된것 수
				}
			}
		}
//		System.out.println(Arrays.toString(level[0]));
//		System.out.println(Arrays.toString(level[1]));
//		System.out.println(Arrays.toString(level[2]));
//		System.out.println(Arrays.toString(level[3]));
//		System.out.println(Arrays.toString(level[4]));
		
		for(int i = 0 ; i <citations.length ; i++) {
			if(level[i][0]==level[i][1] && level[i][0]>level[i][2]&&maxinyong<level[i][0]) {
				maxinyong = level[i][0];
			}else if(level[i][0]>level[i][1]&&level[i][1]>level[i][2]&&maxinyong<level[i][0]){
				maxinyong = level[i][1];
			}else if(level[i][0]<level[i][1]&&level[i][1]>level[i][2]&&maxinyong<level[i][0]){
				maxinyong = level[i][0];
			}
		}

		System.out.println(maxinyong);
		
	}

}
