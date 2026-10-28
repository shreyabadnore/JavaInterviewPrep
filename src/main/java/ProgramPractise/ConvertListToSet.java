package ProgramPractise;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListToSet {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(1);
		list.add(6);
		list.add(3);
		list.add(2);
		list.add(2);
		int p=list.size();
		
		System.out.println("Size of the list is"+p);
		
		Set<Integer> set=new HashSet<Integer>(list);
		
		System.out.print("List"+ list);
		System.out.print("Set"+ set);
		int q=set.size();
		System.out.println("Size of the set is "+ q);
		

		
		
		
		


	}

}
