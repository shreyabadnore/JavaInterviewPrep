package ListBasedPrograms;

import java.util.ArrayList;
import java.util.List;

public class SearchForAnElement {

	public static void main(String[] args) {
		List<String> colour = new ArrayList<String>();
		colour.add("Blue");
		colour.add("Green");
		colour.add("red");
		colour.add("Yellow");
		
		String co="Brown";
		
		if(colour.contains(co)) {
			System.out.println("List contains"+co);
		}
		else {
			System.out.println("List do not contain "+ co);
		}
		

				
				

	}

}
