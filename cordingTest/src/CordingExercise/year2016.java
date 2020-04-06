package CordingExercise;

public class year2016 {

	public static void main(String[] args) {

		//2016년 1.1 은 금요일
		// 2016년 a월 b일은 무슨요일인가?
		
		//1년은 365일 , 2016년은 366일짜리
		//1년 366일
		final int totalDate = 366;
		int a = 1;
		int b = 24;
		
		//월+일합산
		int nowDate = 0;
		
		int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
		
		String[] yoil = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		String answer = "";

		for(int i = 0 ; i<a-1 ; i++) {
			nowDate += months[i];			
		}
		nowDate += b;
		
		switch(nowDate%7) {
		case 1 : answer = yoil[5];
		break;
		case 2 : answer = yoil[6];
		break;
		case 3 : answer = yoil[0];
		break;
		case 4 : answer = yoil[1];
		break;
		case 5 : answer = yoil[2];
		break;
		case 6 : answer = yoil[3];
		break;
		case 0 : answer = yoil[4];
		break;
		}
		
		//1 금 1
		//2 토 2
		//3 일 3
		//4 월 4
		//5 화 5
		//6 수 6
		//7 목 7
		
		System.out.println(7%7);
		System.out.println(answer);
		
		
	}

}
