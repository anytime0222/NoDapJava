package CordingExercise;

import java.util.ArrayList;
import java.util.HashMap;

public class Spy_LV2 {

	public static void main(String[] args) {
		
		String[][] clothes = {{"yellow_hat", "headgear"},{"yellow_st", "headgear"},{"yellow_sex", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"},{"crow_mask", "face"}, {"blue_sunglasses", "face"},{"smoky_makeup", "face"}};
		int answer = 1;
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>(); 
		for(String[] strings : clothes) { 
			hashMap.put(strings[1], hashMap.getOrDefault(strings[1], 0)+1); 
		} 
		for(String key : hashMap.keySet()) { 
			answer *= hashMap.get(key) + 1; 
		}

		System.out.println(answer-1);
	}
}
