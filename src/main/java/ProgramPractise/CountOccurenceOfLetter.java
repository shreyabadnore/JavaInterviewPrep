package ProgramPractise;

public class CountOccurenceOfLetter {

	public static void main(String[] args) {
		String s="Java is a programming language";
		
		int count=s.length()-s.replace("a", "").length();
		
		System.out.println(count);

	}

}
