package ProgramPractise;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateIntinArray {

	public static void main(String[] args) {
		
		int[] array= {1,2,3,2};
		
		sort(array);

	}

	public static void sort(int[] arr) {
		
		Set<Integer> set=new HashSet<Integer>();
	
		for(int i:arr) {
			set.add(i);
		}
		System.out.println(set);
		
		
	}
}
