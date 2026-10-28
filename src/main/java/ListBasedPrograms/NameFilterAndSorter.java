package ListBasedPrograms;



import java.util.Arrays;
import java.util.List;

public class NameFilterAndSorter {

	public static void main(String[] args) {
	
		
		List<String> list=Arrays.asList("John", "Alex", "Chris", "Bob", "David");
		System.out.println(list+ "Original list");
		
		
		list.removeIf(listt -> listt.length()<5);
		
		System.out.println("list after removal"+ list);

	

	}

}
