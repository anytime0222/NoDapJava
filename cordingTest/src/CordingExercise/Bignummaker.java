package CordingExercise;
import java.util.ArrayList;
import java.util.Arrays;

public class Bignummaker {

	public static void main(String[] args) {

		String number = "4177252841";
		int k = 4;
		String answer = "";
		
		ArrayList<Integer> arr= new ArrayList<Integer>(); 
		Bignummaker b = new Bignummaker();
		
		
//		System.out.println(b.sex(number,arr));
//		System.out.println(b.firstNumMaker(arr,k));
//		System.out.println(b.numDeleter(arr, k-(number.length()-arr.size())));
		
		b.sex(number,arr);
		b.firstNumMaker(arr,k);
		b.numDeleter(arr, k-(number.length()-arr.size()));
		
		
		for(int i = 0 ; i < arr.size() ; i++) {
			answer += arr.get(i);
		}
		
		System.out.println(answer);

	}
	
	private ArrayList<Integer> sex(String number, ArrayList<Integer> arr) {
		
		for(int i = 0 ; i < number.length(); i++) {
			arr.add(Integer.parseInt(number.substring(i, i+1)));
		}
		
		return arr;
	}

	private ArrayList<Integer> firstNumMaker(ArrayList<Integer> arr,int k){
		
		int tempMax = 0 ;
		int where = 0;
		for(int i = 0 ; i < arr.size()-k ; i++) {
			if(tempMax < arr.get(i)) {
				tempMax = arr.get(i);
				where = i;
			}
			
		}
	
		for(int i = 0 ; i < where ; i++) {
			arr.remove(0);
		}
				
		return arr;
	}
	
	private ArrayList<Integer> numDeleter(ArrayList<Integer> arr,int k){
		
		int max = 0;
		
		while(max<k) {
			for(int i = 1 ; i < arr.size() ; i++) {
				if(i<arr.size()-1) {
					if(arr.get(i) < arr.get(i+1) && arr.get(i) < arr.get(i-1)) {
//						System.out.println(arr.get(i));
						arr.remove(i);
						max++;
						break;
					}
				}
				else {
					if(arr.get(i) < arr.get(i-1)) {
//						System.out.println("??");
					}
				}
			}
			
		}
		
		return arr;
	}
	
}
