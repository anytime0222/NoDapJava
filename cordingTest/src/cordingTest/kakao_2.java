package cordingTest;

public class kakao_2 {
	public static void main(String[] args) {
		
		int splitNumber = 3;
		String givenWords = "abcabcaaddbbsds";
		
		makeSplitList(givenWords,splitNumber);
	}
	
	public static String makeSplitList(String givenWords,int splitNumber) {
		
		String data="1111111111111";
		
		int wordLengths = givenWords.length();
		String [] wordSplitList = new String [wordLengths];


		for(int i = 0; i <= wordLengths ; i+=splitNumber) {
			wordSplitList[i]=givenWords.substring(i, i+splitNumber);
			System.out.println(wordSplitList[i]);
		}
		
		
		
		
		
		
		
		
		return data;
	}



	
	
}


