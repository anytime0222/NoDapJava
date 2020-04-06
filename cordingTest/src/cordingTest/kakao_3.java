package cordingTest;

import java.util.ArrayList;

public class kakao_3 {
	public static void main(String[] args) {
		
		int splitNumber = 3;
		String givenWords = "abcabcabcabcabcsdfsdfsdfsdf";
		
		makeSplitList(givenWords,splitNumber);
		
	}
	
	public static String makeSplitList(String givenWords,int splitNumber) {
		
		String data = null;
		int contstants = 1;
		
		int wordLengths = givenWords.length();
		ArrayList<String> wordSplitList  = new ArrayList<String>();
		ArrayList<String> zlist  = new ArrayList<String>();
		String [] sumWord = new String [wordLengths];

		int a = wordLengths % splitNumber;
		
		
		for(int i = 0; i < wordLengths ; i+=splitNumber) {
			
			if(a + i == wordLengths) {
				wordSplitList.add(givenWords.substring(i, wordLengths));
				
			}else {
				wordSplitList.add(givenWords.substring(i, i+splitNumber));
				
			}
			

		}	
			
	
		int xx = 1;
		for(int i=0 ; i < wordSplitList.size() ; i++) {
			if(xx == wordSplitList.size()) {
				break;
			}
			
			if(wordSplitList.get(i).equals(wordSplitList.get(i++))){
				xx++;
				System.out.println(wordSplitList.get(i));
			}
			else {
				System.out.println("다름");
				
			}
			
			
			
			
			
			
		}
			
		
		
		
		return data;
	}



	
	
}


