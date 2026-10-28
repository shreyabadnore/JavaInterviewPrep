package ProgramPractise;

public class CountCapitalAndSmallAlphabets {

	public static void main(String[] args) {
		String s="ShReYa";
		
		int smallCount=0, capitalCount=0;
		
		for(char ch:s.toCharArray()) {
			if(Character.isLowerCase(ch)) {
				smallCount++;
			}
			else if(Character.isUpperCase(ch)) {
				capitalCount++;
			}
		}
		System.out.println(smallCount+" "+"num	ber of small characters");
		System.out.println(capitalCount+" "+ "number of capital character");

	}

}
