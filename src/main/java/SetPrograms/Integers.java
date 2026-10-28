package SetPrograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Integers {

	public static void main(String[] args) {

		Set<Integer> num = new HashSet<>();
		num.add(2);
		num.add(3);
		num.add(4);
		num.add(6);
		num.add(7);
		num.add(8);
		num.add(1);

		Iterator<Integer> it = num.iterator();

		while (it.hasNext()) {
			Integer nums = it.next();
			System.out.println(nums);
		}
		
		//converting hashset into treeset

		TreeSet<Integer> treeSet = new TreeSet<>(num);//passing the hashset into the treeset constructor

		System.out.println("TreeSet (Sorted): " + treeSet);

	}

}
