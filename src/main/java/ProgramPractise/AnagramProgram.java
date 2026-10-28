package ProgramPractise;


public class AnagramProgram {

    public static boolean isAnagram(String str1, String str2) {

        // Step 1: Check whether the lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Step 2: Create an array to count characters
        int[] count = new int[26];

        // Step 3: Increase counts for str1 and decrease for str2
        for (int i = 0; i < str1.length(); i++) {

            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            count[ch1 - 'a']++;
            count[ch2 - 'a']--;
        }

        // Step 4: Check whether all counts are zero
        for (int i = 0; i < count.length; i++) {

            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String str1 = "silent";
        String str2 = "listen";

        if (isAnagram(str1, str2)) {
            System.out.println("Given strings are anagrams");
        } else {
            System.out.println("Given strings are not anagrams");
        }
    }
}
