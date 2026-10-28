package ProgramPractise;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInStringInArray {

	public static void main(String[] args) {
		
		String names[]= {"Java", "C#", "Ruby", "Javascript", "Java"};
		//1.Comparing
		for(int i=0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i].equals(names[j])) {
					System.out.println("The duplicate element is:"+" "+ names[i].trim());
				}
			}
		}
		
		System.out.println("--using hashset--");
		
		//2.by using hashset
		
		Set<String> store=new HashSet<String>();
		for(String name:names) {
			if(store.add(name)==false) {
				System.out.println("the duplicate element  is"+ name);
			}
		}
		
		
		

	}

}
