package ProgramPractise;

public class CovertOddDigitsToWords {

	public static void main(String[] args) {
		
		String s="123456789";
		
		String output=convertToCustomFormat(s);
		System.out.println(output);

	}
	
	public static String convertToCustomFormat(String s) {
		StringBuilder result=new StringBuilder();
		
		for(char ch:s.toCharArray()) {
			switch(ch) {
			case '1': result.append("one");
			break;
			
			case '3': result.append("three");
			break;
			
			case '5': result.append("five");
			break;
			
			case '7': result.append("seven");
			break;
			case '9': result.append("nine");
			break;
			
			default: result.append(ch);
			}
		}
		return result.toString();
	}

}
