package CordingExercise;
import java.util.ArrayList;
import java.util.Arrays;

public class Bignummaker2 {

	public static void main(String[] args) {

		String number = "777771";
		int k = 2;
		String answer = "";
		StringBuilder tempstr = new StringBuilder();
		
		int bigNumber = 0;
		int where = 0;
		for(int i = 0 ; i < number.length()-k ; i++) {
			if(bigNumber < (int)number.charAt(i)) {
				bigNumber = number.charAt(i);
				where = i;
			}		
		}
		
		for(int i = where ; i < number.length() ; i++) {
			tempstr.append(number.charAt(i));
		}
		
		for(int i = 0 ; i < tempstr.length() ; i++) {
			if(i < tempstr.length() - 1) {
				if(tempstr.charAt(i) < tempstr.charAt(i+1)&& tempstr.charAt(i) < tempstr.charAt(i-1)) {
					tempstr.deleteCharAt(i);
					
				}
			}
			else {
			}
		}
		
		answer = tempstr.toString();
		System.out.println(tempstr);
		
	
		
	}
	
}
