package cordingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class pro_1 {
	public static void main(String[] args) {
		
		
		int[] goods = {14,2,3,5,4,7,11};
		int[] boxes = {3,6,4,2,55,23};
		
		Arrays.sort(goods);
		Arrays.sort(boxes);
		
		
		ArrayList<Integer> lists1  = new ArrayList<Integer>();
		ArrayList<Integer> lists2  = new ArrayList<Integer>();

		
		/*
		 * System.out.println(goods[0]); System.out.println(goods[1]);
		 * System.out.println(goods[2]);
		 * 
		 * 
		 * System.out.println(boxes[0]); System.out.println(boxes[1]);
		 * System.out.println(boxes[2]);
		 */
		
		
		for(int i = 0 ; i < goods.length ; i ++) {
			int aa = goods[i];
			
			for (int j = 0 ; j < boxes.length ; j ++) {
				int bb = boxes[j];
				
				if(aa<=bb) {
					lists1.add(aa);
					lists2.add(bb);

					break;
				}
				
			}
		}
		
		System.out.println(lists1.get(0));
		System.out.println(lists1.size());
		System.out.println(lists2.size());

		
	}
	

	
	
}


