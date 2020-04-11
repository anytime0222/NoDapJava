package cordingExercise;

public class Watermelon {
	public static void main(String[] args) {
		
		int n = 4;
		String aa = "1234";
		System.out.println(Integer.parseInt(aa));
		
		String answer="";
		
		if(n%2==0) {
			for(int i = 0 ; i < n/2 ; i++) {
				answer += "수박";
			}
		}
		else {
			for(int i = 0 ; i < n/2 ; i++) {
				answer += "수박";
			}
			answer+="수";
		}
		
		System.out.println(answer);
	}
	
	public String watermelon(int n){
		
		return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
	}
}
