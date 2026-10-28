package ProgramPractise;

public class ReverseEntireString {

	public static void reverse(String input) {

		String[] words = input.split(" ");

		String output ="";

		for (int i = words.length - 1; i >= 0; i--) {
			output = output+ words[i];
			if(i>0) {
				output=output+" ";
			}
			
		}
		System.out.println(output);

	}


	public static void main(String[] args) {
		reverse("I love Java");

	}

}
	