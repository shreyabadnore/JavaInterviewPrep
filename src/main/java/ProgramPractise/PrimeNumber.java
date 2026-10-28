package ProgramPractise;

public class PrimeNumber {
	
	 
	public static boolean isPrimeNumber(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}

		}
		return true;
	}
	
	public static void getPrimeNumbers(int num) {
		for(int i=2; i<=num; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		
		System.out.println(isPrimeNumber(9));
		System.out.println(isPrimeNumber(8));
		System.out.println(isPrimeNumber(-3));
		System.out.println(isPrimeNumber(3));
		getPrimeNumbers(7);
		getPrimeNumbers(20);
		getPrimeNumbers(50);


	}
}
