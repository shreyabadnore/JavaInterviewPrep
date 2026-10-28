package ProgramPractise;

import java.util.stream.IntStream;

public class AnagramJava8 {
	    public static boolean isAnagram(String str1, String str2) {

	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        int[] count = new int[26];

	        IntStream.range(0, str1.length())
	                 .forEach(i -> {
	                     count[str1.charAt(i) - 'a']++;
	                     count[str2.charAt(i) - 'a']--;
	                 });

	        return IntStream.of(count)
	                        .allMatch(c -> c == 0);
	    }

	    public static void main(String[] args) {
	        System.out.println(isAnagram("silent", "listen"));
	    }
	}


