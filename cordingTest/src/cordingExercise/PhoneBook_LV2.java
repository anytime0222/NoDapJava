package cordingExercise;

public class PhoneBook_LV2 {

	public static void main(String[] args) {

		String[] phone_book = {"123","456","789"};
		boolean answer = true;
		
		for(int i = 0 ; i < phone_book.length ; i ++) {
			System.out.println(i);
			for(int j = 0 ; j<phone_book.length ; j++) {
				
				//System.out.println(phone_book[i].length());
				if(!phone_book[i].equals(phone_book[j])&&phone_book[i].length() <= phone_book[j].length()&& phone_book[i].equals(phone_book[j].substring(0,phone_book[i].length()))) {
					System.out.println("있음"+phone_book[i]+","+phone_book[j]);
					answer = false;
					break;
				}else {
					System.out.println("없음"+phone_book[i]+","+phone_book[j]);
				}
				
				System.out.println();
				
			}
			if(!answer) {
				break;
			}
		}
		
		System.out.println(answer);
	}

}
