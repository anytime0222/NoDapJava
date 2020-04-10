package CordingExercise;

public class JoyStick {
	public static void main(String[] args) {
				
		String name = "BBAAAAA";
		int answer = 0;
		
		char defaults ='A';
		int joyleft = name.length()-1;
		int joyChange = 0;
				
		for(int i = 0 ; i<name.length();i++) {
			//움직임이 없는것 , A인경우
			if(name.charAt(i) - defaults ==0) {
				System.out.println("안움직임");
				continue;
			}
			//오른쪽으로 보내는게 이득
			else if(name.charAt(i) - defaults < 13) {
				System.out.println("-->");
				joyChange+= name.charAt(i) - defaults;
				continue;
			}
			//왼쪽으로 보내는게 이득
			else if(name.charAt(i) - defaults > 13) {
				System.out.println("<--");
				joyChange+= 26 - (name.charAt(i) - defaults);
				continue;
			}
			//왼쪽오른쪽 노상관 13칸. 무조건 n임.
			else if(name.charAt(i) - defaults ==13){
				System.out.println("=");
				joyChange += 13;
				continue;
			}
		}
		
		int left = 0;
		int right = 0;
		for(int i = 1 ; i<name.length();i++) {
			if(name.charAt(i)=='A') {
				right += 1;
			}
			else {
				break;
			}
			
		}
		
		for(int j = name.length()-1 ; j>0;j--) {
			if(name.charAt(j)=='A') {
				left += 1;
			}
			else {
				break;
			}
			
		}
		System.out.println(left);
		System.out.println(right);
		
		if(left < right) {
			answer = joyChange + (joyleft-right);
		}else if(left >right) {
			answer = joyChange + (joyleft-left);
		}
		else {
			answer = joyChange + (joyleft-right);
		}
		
		System.out.println(answer);
	}
}
