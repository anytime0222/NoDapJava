package cordingExercise;

public class MiddleStringGet {
	public static void main(String[] args) {
		
		String s = "abcdef";
		
		int len = s.length();
				
		String answer = "";
		//짝수일떄
		if(len%2 == 0) {
			answer = s.substring((len/2)-1, (len/2)+1);
		}
		
		//짝수가 아닐때
		else {
			answer = s.substring(len/2, (len/2)+1);
			
		}
		
		System.out.println(answer);
		
		
	}
}
