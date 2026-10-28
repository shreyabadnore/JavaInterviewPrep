package ProgramPractise;

public class CountAlphabetsAndSpecialCharacters {

	public static void main(String[] args) {
		
		String s="$hrey@";
		
		int alphabets=0, specialCharacters=0;
		
		for(char ch: s.toCharArray()) {
			if(Character.isAlphabetic(ch)) {
				alphabets++;
			}
			else if(!Character.isAlphabetic(ch)) {
				specialCharacters++;
			}
		}
		System.out.println(alphabets);
		System.out.println(specialCharacters);

	}

}
