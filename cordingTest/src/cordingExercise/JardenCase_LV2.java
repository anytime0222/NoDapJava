package cordingExercise;

public class JardenCase_LV2 {

	public static void main(String[] args) {

		String s = "3people unFollowed me";
				
		System.out.println(s.toLowerCase());
		JardenCase_LV2 j = new JardenCase_LV2();
		StringBuilder sb = new StringBuilder();
		//System.out.println(s.length());
		boolean isFirst= false;
		
		for(int i = 0 ; i < s.length() ; i++) {
			if(i==0) {	//첫번째 글자만 체크
				int johnson = s.charAt(i);
				if(johnson>=65&&johnson<=90) {
					sb.append(s.charAt(i));
				}
				else{
					sb.append(j.changer(s.charAt(i)));
				}
				
			}	//그 뒤 글자 체크
			else if(i > 0 && i < s.length()-1){
				if(s.charAt(i+1)==32||(s.charAt(i-1)>=65&&s.charAt(i-1)<=90)) {
					sb.append(j.changer(s.charAt(i)));
				}
			}
		}
		
		//System.out.println(sb);
	}
	
	public char changer(char sp) {
		char answer = 0;
		if(sp<65||sp >122) {
			answer = sp;
			//잡글자임
		}else if (sp>=65&& sp <=90) {
			answer = (char)((int)sp+32);
			//대문자임
		}else if (sp>=97&& sp <=122) {
			answer = (char)((int)sp-32);
			//소문자임
		}
		
		return answer;
	}

}
