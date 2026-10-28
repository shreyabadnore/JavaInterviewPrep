package ProgramPractise;

public class ReverseEachWord {

	public static void main(String[] args) {
		
		String input="I Love Java";
		String[] words = input.split(" ");

		String output = "";

		for (int i = 0; i < words.length; i++) {

		    String word = words[i];

		    for (int j = word.length() - 1; j >= 0; j--) {

		       output=output+word.charAt(j);
		    }
		    if (i < words.length - 1) {
		    	output=output+" ";
		    }
		    
		}
		System.out.println(output.trim());

	}

}
