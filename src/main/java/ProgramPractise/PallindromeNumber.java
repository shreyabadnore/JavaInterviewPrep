 package ProgramPractise;

public class PallindromeNumber {

	public static void main(String[] args) {
		
		int num=121;
		
		int rev=0, original_number=121;
		
		
		while(num!=0) {
			int remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
			
		}
		if(rev==original_number) {
			System.out.println("given number is pallindrome");
		}
		else {
			System.out.println("given number is not pallindrome");
		}
		
		
	

	}

}
