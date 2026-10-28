package ProgramPractise;

public class ReverseStringWthoutMovingSpecialChars {

	public static void main(String[] args) {
		String input = "au&to#m@at!i*on";

		String output = reverseAlphabets(input);

		System.out.println("Reverse is " + output);

	}

	  public static String reverseAlphabets(String input) {

	        char[] ch = input.toCharArray();

	        int left = 0;
	        int right = ch.length - 1;

	        while (left < right) {

	            if (!Character.isAlphabetic(ch[left])) {
	                left++;
	            } 
	            else if (!Character.isAlphabetic(ch[right])) {
	                right--;
	            } 
	            else {
	                char temp = ch[left];
	                ch[left] = ch[right];
	                ch[right] = temp;

	                left++;
	                right--;
	            }
	        }
	        
	        

	        return new String(ch);
	    }
	

public static boolean isVowel(char ch) {

    return ch == 'a' || ch == 'e' || ch == 'i' ||
           ch == 'o' || ch == 'u' ||
           ch == 'A' || ch == 'E' || ch == 'I' ||
           ch == 'O' || ch == 'U';
}
}