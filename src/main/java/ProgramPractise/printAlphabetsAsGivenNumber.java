package ProgramPractise;

public class printAlphabetsAsGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="a3b2c1";
		String output="";
		
		for(int i=0; i<s.length(); i+=2) {
			char ch=s.charAt(i);
			
			int count=s.charAt(i+1)-'0';
			
			for(int j=0; j<count; j++) {
				output=output+ch;
			}
			
		}
System.out.println(output);
	}

}
