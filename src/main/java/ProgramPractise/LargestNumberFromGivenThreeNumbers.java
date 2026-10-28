package ProgramPractise;

public class LargestNumberFromGivenThreeNumbers {

	public static void main(String[] args) {
		int n1=6, n2=4, n3=10, largest;
		if(n1>n2 && n1>n3) {
			largest=n1;
		}
		else if(n2>n1 && n2>n3) {
			largest=n2;
		}
		else {
			largest=n3;
		}
		System.out.println(largest);
	}

}
