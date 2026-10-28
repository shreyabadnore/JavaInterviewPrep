package ProgramPractise;

public class SwapTwoStringWithoutThirdVariable {

	public static void main(String[] args) {
		String a="Hello";
		String b="worldczz";
		
		swap(a, b);
		
	}
	
	
	public static void swap(String a, String b) {
		
		System.out.println("String Before Swapping"+" "+"a= "+a+" "+"b= "+b);
		
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("String after Swapping"+" "+"a= "+a+" "+"b= "+b);
		   
		
	}
}


