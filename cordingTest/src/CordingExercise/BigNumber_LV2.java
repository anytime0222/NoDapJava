package CordingExercise;

import java.util.ArrayList;
import java.util.Arrays;

public class BigNumber_LV2 {

	public static void main(String[] args) {

		int [] numbers = {5,1,2,3,1,23,24,25,52,53,54,9,56};
//		
//		String answer = "";
		
		 String answer = "";
	        String[] str = new String[numbers.length];
	        for(int i = 0; i < numbers.length; i++) str[i] = String.valueOf(numbers[i]);     

	        Arrays.sort(str, (a, b) -> ((b+a).compareTo(a+b))); //배열 정렬. 뒤랑 붙여보자

	        if (str[0].equals("0")) System.out.println("err");; //0만 입력되는 경우. 예외처리
	        for(String s: str) answer += s; //문자열(String) 합치기

	       System.out.println(answer);
	      

//		
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		
//		String temp = "";
//		String tmp = "";
//		int realnum = 0;
//		for(int i = 0 ; i < numbers.length ; i++) {
//			temp = "0";
//			realnum=0;
//			for(int j = i ; j < numbers.length ; j++) {
//				tmp = Integer.toString(numbers[j]).substring(0,1);
//				if(Integer.parseInt(temp) < Integer.parseInt(tmp)) {
//					temp = Integer.toString(numbers[j]).substring(0, 1);
//					realnum = numbers[j];
//					numbers[j]=numbers[i];
//					numbers[i]=realnum;
//				}
//				
//				
//			}
//		}
//		System.out.println(Arrays.toString(numbers));
//		
		
	}


}
