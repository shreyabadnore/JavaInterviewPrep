package ProgramPractise;

public class NextFiboNumber {
	
	public static int findNextFiboNumber(int num) {
		int prev=0, curr=1;
		while(curr<num) {
			int temp=curr;
			curr=prev+curr;
			prev=temp;
			
		}
		return curr;
	}

	public static void main(String[] args) {
		
		int num=30;
		System.out.println("Next fibo"+ num+" "+ findNextFiboNumber(num));
		

	}

}
