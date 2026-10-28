package ProgramPractise;

public class RemoveJunkwithRegularExpression {

	public static void main(String[] args) {

		String s = "$hre#y@", rev="";

		s = s.replaceAll("[^a-zA-Z]","");
		System.out.println(s);
		
		for(int i=s.length()-1; i>=0; i--) {
			rev=rev+s.charAt(i);					
		}
		System.out.println(rev);
	}

}