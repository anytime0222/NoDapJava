package cordingTest;

public class kakao_4 {
	public static void main(String[] args) {
		
		int splitNumber = 2;
		String givenWords = "abababab";
		
		makeSplitList(givenWords,splitNumber);
		
	}
	
	public static String makeSplitList(String givenWords,int splitNumber) {
		
		String data = null;
		
		int wordLengths = givenWords.length();
		String [] wordSplitList = new String [wordLengths];
		String [] sumWord = new String [wordLengths];

		int a = wordLengths % splitNumber;
		
		
		for(int i = 0; i < wordLengths ; i+=splitNumber) {
			
			if(a + i == wordLengths) {
				wordSplitList[i]=1+givenWords.substring(i, wordLengths);
				
			}else {
				wordSplitList[i]=1+givenWords.substring(i, i+splitNumber);
				
			}
				

		}
		
		for(int i = 0 ; i < wordLengths-splitNumber ; i+=splitNumber) {


				int j = i+splitNumber;
				if(wordSplitList[i].equals(wordSplitList[j])) {
					String aa = wordSplitList[i].substring(0,1);
					String bb = wordSplitList[j].substring(0,1);
					
					int aaa = Integer.parseInt(aa);
					int bbb = Integer.parseInt(bb);
					
					int getSum = aaa+bbb;
					String res = Integer.toString(getSum);
					
					sumWord[i] = res+wordSplitList[j].substring(1,splitNumber+1);
					
				}else {
					sumWord[i] = wordSplitList[i].substring(1,wordSplitList[i].length());
					sumWord[j] = wordSplitList[j].substring(1,wordSplitList[j].length());
					
				}

			
			
		}
		
		for(int i=0;i<wordLengths;i++) {
			if(sumWord[i]==null) {
				continue;				
			}
			data = data+sumWord[i];
			
		}
		
		System.out.println(data);	
		
		return data;
	}



	
	
}


