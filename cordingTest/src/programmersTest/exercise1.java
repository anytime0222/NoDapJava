package programmersTest;

import java.util.Arrays;

public class exercise1 {
	public static void main(String[] args) {

		int a = 1;
		int b = 0;
		int c = 0;
		
		int i = 0;
		while(true) {
		
			c = a+b ;
			
			b = a;
			a = c;
			i++;
			if(i>15) {
				break;
			}
			System.out.println(i+"번째"+b);
			//System.out.println(c);
		}	


	
	}
}


