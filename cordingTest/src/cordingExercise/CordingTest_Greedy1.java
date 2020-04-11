package cordingExercise;

import java.util.Arrays;

public class CordingTest_Greedy1 {
	public static void main(String[] args) {
		
		int n = 30;
		int[] lost = {3,6,14,15,16,22,25,27,28};
		int[] reserve = {4,5,7,8,14,17,23,26,28};
		
		int[][] total = new int[n][2];
		
		for(int i = 0 ; i < n ; i++) {
			for (int j = 0 ; j < 1 ; j++) {
				total[i][j] = i+1;
				total[i][j+1] = 1;				
			}
			
			for(int ii = 0 ; ii < lost.length ; ii++) {
				if(total[i][0]==lost[ii]) {
					total[i][1]=0;
				}				
			}

			for(int jj = 0 ; jj < reserve.length ; jj++) {
				if(total[i][0]==reserve[jj]) {
					total[i][1]=2;
				}				
			}
			
			
			
		}

		int a = 0;

		for(int kk = 0 ; kk < lost.length ; kk++) {
			for(int z=0; z<reserve.length ; z++) {
				if(lost[kk]==reserve[z]) {
					a= lost[kk];
					
					if(lost[kk]>0) {
						total[(lost[kk])-1][1] -= 1;
					}
					break;
				}
				
			}
			
		}		
		
		for(int i = 0 ; i < n ; i++ ) {
			System.out.println(Arrays.toString(total[i]));
		}
		
		for(int i = 0 ; i < n ; i++ ) {
			System.out.println(Arrays.toString(total[i]));
			System.out.println("                    ");

			switch(total[i][1]) {
				case 1 : System.out.println((i+1)+"번째 학생 " + total[i][1] + "개 : 빌릴수도 빌리지도 못함"); 
					break;
				
				case 2 : System.out.println((i+1)+"번째 학생 " + total[i][1] + "개 : 빌려줄수있음");
					System.out.println((i+1)+" / "+total[i][1]);
					if(i>0 && i < n-1) {
						if(total[i-1][1] < 1) {
							System.out.println("내 앞의 학생이 0개 이하다.");
							System.out.println("하나 빌려줄게");
							total[i-1][1] += 1;
							total[i][1] -= 1;
						}
						else if(total[i+1][1] < 1) {
							System.out.println("내 뒤가 0개가 되었군");	
							System.out.println("하나 빌려줄게");
							total[i+1][1] += 1;
							total[i][1] -= 1;
						}
					}
					else if (i==0){
						if(total[i+1][1] <1 ) {
							System.out.println("내 뒤의 학생이 0개 이하다");
							System.out.println("하나 빌려줄게");
							total[i+1][1] += 1;
							total[i][1] -= 1;
						}						
					}
				
					break;
				
				case 0 : System.out.println((i+1)+"번째 학생 " + total[i][1] + "개 : 나 거지야..");
					break;
			
			}
			
		}	
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println(Arrays.toString(total[i]));	
		}
		
		int counts = 0 ;
		
		for(int i = 0 ; i < n ; i++) {
			if(total[i][1] > 0) {
				counts++;
			}
			
		}
		
		System.out.println(counts);
	}
}
