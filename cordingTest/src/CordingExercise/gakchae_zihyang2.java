package CordingExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class gakchae_zihyang2 {
	public static void main(String[] args) {
		
		int[] answers = {1,2,3,4,5};
	      
	      
        int[][] stu1 = {{1,2,3,4,5}
                    ,{2,1,2,3,2,4,2,5}
                    ,{3,3,1,1,2,2,4,4,5,5}
        };    
        int[] points = {0,0,0};
             
       for(int ii=0 ; ii < stu1.length ; ii++) {
    	   int anslen = answers.length;
           int stlen = stu1[ii].length;
           int cnt1 = anslen / stlen;
           int cnt2 = anslen % stlen;
       
           int[] arrNew = new int[anslen];
           ArrayList<Integer> newArr = new ArrayList<Integer>();
           
           if(cnt1 == 0) {
               for(int k = 0 ; k < cnt2 ; k++) {
                  newArr.add(stu1[ii][k]);
               }
        	   
           }
           else {
        	   for(int i = 0 ; i< cnt1 ; i++) {

            	   for(int j = 0 ; j < stlen ; j++) {
                     newArr.add(stu1[ii][j]);
                 
                      if(cnt1==i+1 && cnt2>0 && j == stlen-1) {
                         for(int k = 0 ; k < cnt2 ; k++) {
                            newArr.add(stu1[ii][k]);
                         }
                      }
                  }
               }
           }
           
           
           
           System.out.println(newArr);
           for(int i = 0 ; i < answers.length ; i++) {
        	   if(newArr.get(i)==answers[i]) {
        		   points[ii]++;     		   
        	   }      	   
           }    	   
       } 
       
       System.out.println(Arrays.toString(points));
       
       HashMap<Integer, Integer> rank = new HashMap<Integer, Integer>();
       
       for (int i = 0 ; i < points.length ; i ++) {
    	   rank.put(i+1, points[i]);    	   
       }
       
       System.out.println(rank);
       
       int temp = 0;
       for (int i = 0 ; i<rank.size() ; i++) {
    	   if(temp < rank.get(i+1)) {
    		   temp = rank.get(i+1);
    	   }
       }
       System.out.println(temp);
       
       ArrayList<Integer> finalRank = new ArrayList<Integer>();
       
       for (int i = 0 ; i<rank.size() ; i++) {
    	   if(temp == rank.get(i+1)) {
    		   finalRank.add(i+1);
    	   }
       }
       System.out.println(finalRank);
       
       int[] answer = new int[finalRank.size()];
       
       for (int i = 0 ; i< finalRank.size() ; i++) {
    	   answer[i]=finalRank.get(i);
       }
       
       System.out.println(Arrays.toString(answer));
       
	}
}
