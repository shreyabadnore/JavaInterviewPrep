package ProgramPractise;

public class RemoveVowels {

	public static void main(String[] args) {
	
		        String str = "automation";

		        String result = "";

		        for (int i = 0; i < str.length(); i++) {

		            char ch = str.charAt(i);

		            if (ch != 'a' && ch != 'e' && ch != 'i'
		                    && ch != 'o' && ch != 'u') {

		                result = result + ch;
		            }
		        }

		        System.out.println("String after removing vowels: " + result);
		    }
		}
	


