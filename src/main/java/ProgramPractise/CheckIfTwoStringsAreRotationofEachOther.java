package ProgramPractise;

public class CheckIfTwoStringsAreRotationofEachOther {

	public static void main(String[] args) {
		
		String s1="abcd";
		String s2="abcd";
		
		if(areRotations(s1,s2)) {
			System.out.println("String are rotations");
		}
		else {
			System.out.println("Strings are not rotations");
		}
		

	}
	
	public static boolean areRotations(String s1, String s2) {
		return(s1.length()==s2.length()&& (s1+s1).contains(s2));
	}

}
