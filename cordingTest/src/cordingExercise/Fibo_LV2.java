package cordingExercise;

public class Fibo_LV2 {

	public static void main(String[] args) {

		int n =61;
		int answer = 0 ;
		
		int i0 = 0;
		int i1 = 1;
		int i = 0;
		int temp = 0 ;
		
		while(i<n-1&& n <= 100000) {
			temp = i0+i1;
			
			i0 = i1;
			i1 = temp;
			i++;
			//System.out.println(temp);
		}
		
		System.out.println(temp);
		answer = temp % 1234567;
		System.out.println(answer);
	}

}
