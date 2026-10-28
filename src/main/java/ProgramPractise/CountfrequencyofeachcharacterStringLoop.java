package ProgramPractise;

public class CountfrequencyofeachcharacterStringLoop {

	public static void main(String[] args) {
		String s = "programming";

        for (int i = 0; i < s.length(); i++) {

            char currentChar = s.charAt(i);
            int count = 0;

            for (int j = 0; j < s.length(); j++) {

                if (currentChar == s.charAt(j)) {
                    count++;
                }
            }

            System.out.println(currentChar + " → " + count);
        }
    }

	}
	
	

