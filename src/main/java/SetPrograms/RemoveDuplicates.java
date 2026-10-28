package SetPrograms;

import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String s="Java is powerful and Java is fun and fun";
		
		String[] words=s.split(" ");
		
		HashSet<String> set=new HashSet<>();
		
		for(String word:words) {
			set.add(word);
		}
		
		System.out.println(set);
		
		
	

	}

}
