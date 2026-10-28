package ProgramPractise;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n1 = 1, n2 = 2, i, n3, count = 20;

		for (i = 0; i <= count; i++) {

			n3 = n1 + n2;
			System.out.println(n1);

			n1 = n2;
			n2 = n3;

		}

	}

}
