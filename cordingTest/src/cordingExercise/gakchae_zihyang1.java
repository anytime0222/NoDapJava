package cordingExercise;

import java.util.ArrayList;
import java.util.Arrays;


public class gakchae_zihyang1 {
	public static void main(String[] args) {
		
		int[] answers = {1, 3, 2, 4, 2, 1, 3, 2, 4, 2, 1, 3, 2, 4, 2};
	      
	      
        int[][] stu1 = {{1,2,3,4,5}
                    ,{2,1,2,3,2,4,2,5}
                    ,{3,3,1,1,2,2,4,4,5,5}
        };    
       
       int anslen = answers.length;
       int stlen = stu1[2].length;
       System.out.println(anslen/stlen);
       int cnt1 = anslen / stlen;
       int cnt2 = anslen % stlen;

       System.out.println(anslen%stlen);
   
       int[] arrNew = new int[anslen];
       ArrayList newArr = new ArrayList();
       
       
       for(int i = 0 ; i< cnt1 ; i++) {
          int a = 0;
          for(int j = 0 ; j < stlen ; j++) {
             newArr.add(stu1[2][j]);
         
              if(cnt1==i+1 && cnt2>0 && j == stlen-1) {
                 for(int k = 0 ; k < cnt2 ; k++) {
                    newArr.add(stu1[2][k]);
                 }
              }
              System.out.println(newArr);
          }
       }
	
	}
}
