package CordingExercise;

public class cger {
	public static void main(String[] args) {
		
		String s = "";
		int n = 1;
		
		String answer = "";
		
		char temp = ' ';
		int temps = 0;
		
		for(int i =0 ; i < s.length() ; i++) {
			temps = (int)s.charAt(i)+n;
			
			temp = (char)temps;
			System.out.println(temp);
			answer += temp;
		}
		
		System.out.println(answer);
		
		
	}
}
