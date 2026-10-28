package ListBasedPrograms;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbersREmoveEven {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		list.removeIf(n -> n%2==0);
		System.out.println(list);


	}

}
