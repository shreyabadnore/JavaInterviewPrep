package ProgramPractise;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		String s="Big black bug bit a big black dog on his big black nose";
		
		int count=0;
		
		String p=s.toLowerCase();
		
		String[] words=p.split(" ");
		
		for(int i=0; i<words.length; i++) {
			
			for(int j=i+1; j<words.length; j++) {
				if(words[i].equals(words[j])){
					count++;
					words[j]="0";//This prevents counting or printing the same duplicate again.
					
				}
			}
			if(count>1 && words[i]!="0") {//"0" prevents duplicate words from being printed multiple times.
				System.out.println(words[i]);
				
			}
		}
		
		
	}

}
