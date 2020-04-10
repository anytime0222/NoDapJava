package CordingExercise;
import java.util.ArrayList;
import java.util.Arrays;

public class Bignummaker3 {

	public static void main(String[] args) {

		String number = "1231234";
		int k = 3;
		String answer = "";
		StringBuilder tempstr = new StringBuilder();
		StringBuilder tempstr2 = new StringBuilder();
		
		char bigNumber = '0';
		int where = 0;
		for(int i = 0 ; i < number.length()-k ; i++) {
			if(bigNumber < number.charAt(i)) {
				bigNumber = number.charAt(i);
				where = i;
			}		
		}
		
		for(int i = where ; i < number.length() ; i++) {
			tempstr.append(number.charAt(i));
		}

		int total = tempstr.length()- (k - where);
		System.out.println(total);
		
		int a = 0 ;
		char maxnumber = 0;
		while(a<total) {
			maxnumber = 0;
			for(int i = a ; i < tempstr.length() ; i++) {
				if(maxnumber < tempstr.charAt(i)) {
					maxnumber = tempstr.charAt(i);
				}
			}
			tempstr2.append(maxnumber);
			a++;
		}
		
		System.out.println(bigNumber);
		System.out.println(where);
		System.out.println(tempstr);
		System.out.println(tempstr2);
	}
}
