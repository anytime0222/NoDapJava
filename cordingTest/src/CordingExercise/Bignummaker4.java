package CordingExercise;
import java.util.ArrayList;
import java.util.Arrays;

public class Bignummaker4 {

	public static void main(String[] args) {

		String number = "5417369236";
		int k = 4;
	
		 int idx = 0;
			char max;
		StringBuilder answer = new StringBuilder();

		if (number.charAt(0) == '0')
			System.out.println("error");
		for (int i = 0; i < number.length() - k; i++) {
			max = '0';
			for (int j = idx; j <= k + i; j++) {
				if (max < number.charAt(j)) {
					max = number.charAt(j);
					idx = j + 1;
				}
			}
			answer.append(max);
		}
		
		System.out.println(answer);
	}
	
	
	
	/*
	 * class Solution { public String solution(String number, int k) { String answer
	 * = "";
	 * 
	 * int index = 0; int i,j;
	 * 
	 * 
	 * //첫번째 자리 수 찾기 k의 숫자마다 맨 앞자리 수의 최대 몇번째 자리까지 갈 수 있는지 알 수 있다.
	 * 
	 * if(number.charAt(0) == '0') retrun "0"; //이거는 예외중에 Geevely님의 설명을 듣고 인용하였습니다.
	 * 
	 * //총 숫자의 자릿수는 0부터 시작할때 최소한 0~k 번째 수 안에 나와야 한다. 그래야 뒤에서 다른 수를 최소로 조합할 수 있는 경우의
	 * 수를 만들 수 있다. for(i=0;i<number.length()-k;i++) { //temp는 각자리의 최댓값을 넣는 변수이며
	 * temp는 매 자리 숫자를 찾을때마다 리셋되어야 한다. char temp='0'; for(j=index ; j<k+i;j++) { if(
	 * temp < number.charAt(j)) temp = number.charAt(i); //temp는 자리 숫자들 가운데 최대로 k개를
	 * 뺀 정수중 가장 큰 앞자리를 구한다. index = j+1; //index는 그 temp가 골라진 자리수를 의미하며 그 자리수는 temp가
	 * 골라졌을 j에서 temp가 골라졌기 때문에 +1 을 해준다. // 그러면 바로 뒷 자리 부터 확인이 가능하다. }
	 * answer.append(temp); //append 는 문자를 하나씩 붙히는 개념이다. 이를 쓰려면 StringBulder라는 클래스를
	 * 써야한다. }
	 * 
	 * 
	 * return answer.toString(); } }
	 */


	
}
