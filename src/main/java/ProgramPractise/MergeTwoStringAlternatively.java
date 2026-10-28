package ProgramPractise;

public class MergeTwoStringAlternatively {

	public static String mergeAlternatively(String str1, String str2) { //declaring the two strings
		StringBuilder result = new StringBuilder();
		  int len1 = str1.length();
	        int len2 = str2.length();
	        int i = 0;
	        
			while(i<len1|| i<len2)
	 {
			if (i < len1) {
				result.append(str1.charAt(i));

			} 
			if (i <len2) {
				result.append(str2.charAt(i));
			}
			i++;
		}
		return result.toString();
	}

	public static void main(String[] args) {

		String str1 = "shreya";
		String str2 = "kartikopopqr";

		String mergedString = mergeAlternatively(str1, str2);
		System.out.println("Merged String" + " " + mergedString);

	}
}
