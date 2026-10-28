package ProgramPractise;

public class StringPallindrome {

	public static void main(String[] args) {

		System.out.print(isPallindrome("Madam"));
	}
	
	public static boolean isPallindrome(String s) {
		String output="";
		String original=s.toLowerCase();
		
		
		for(int i=s.length()-1; i>=0; i--) {
			output=output+s.charAt(i);
		}
		
	if(original.equals(output.toLowerCase().trim())) {
		System.out.println("Given string is pallindrome "+ output);
		return true ;
	}
	else {
		System.out.println("String is not pallindrome " + output);
		return false;
		
	}
		
	}

}
