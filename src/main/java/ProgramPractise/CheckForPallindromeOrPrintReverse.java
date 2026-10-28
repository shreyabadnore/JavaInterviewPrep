package ProgramPractise;

public class CheckForPallindromeOrPrintReverse {

	public static void main(String[] args) {
		
		int number=123456, reverse=0;
		int original_number=123456;
		
		while(number!=0) {
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
					
		}
		
		if(reverse==original_number) {
		System.out.println("Given Number is Pallindrome");
		}
		else {
			System.out.println("Given number is not pallindrome");
		
		System.out.println("Reverse of the Number is "+ reverse);
		
		}
	}

}
