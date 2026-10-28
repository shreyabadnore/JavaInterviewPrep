package ProgramPractise;

public class CharOccurenceWithoutUsingForLoop {

	public static void main(String[] args) {
		String str="GeeksForGeeks";
		
		char ch='e';
		
		System.out.println(count(str,ch));

	}
	public static long count(String str, char c) {
		return str.chars().filter(ch->ch=='e').count();
		
	}

}