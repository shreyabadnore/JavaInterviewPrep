package ProgramPractise;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedList {

	public static void main(String[] args) {
		
		mergeSortedList(List.of(1,3,5,7), List.of(2,4,6,8)).forEach(System.out::println);
		
	}
	
	public static List<Integer> mergeSortedList(List<Integer> list1, List<Integer> list2)
	{
		List<Integer> result=new ArrayList<>();
		
		int i=0; int j=0;
		
		while(i<list1.size() && j<list2.size()) {
			
			if(list1.get(i)<list2.get(j)) {
				result.add(list1.get(i));
				i++;
			}
			else {
				result.add(list2.get(j));
				j++;
			}
		}
		
		while(i<list1.size()) {
			result.add(list1.get(i));
			i++;
		}
		
		while(j<list2.size()) {
			result.add(list2.get(j));
			j++;
		}
		
		return result;
	}
}
