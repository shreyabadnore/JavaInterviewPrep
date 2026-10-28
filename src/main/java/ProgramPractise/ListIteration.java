package ProgramPractise;
import java.util.ArrayList;
import java.util.List;
public class ListIteration {
	public static void main(String[] args) {

		List<Integer> n = new ArrayList<Integer>();
		n.add(9);
		n.add(5);
		n.add(4);
		n.add(5);
		List<Integer> unique = new ArrayList<Integer>();
		List<Integer> repeated = new ArrayList<Integer>();
		for (int num : n) {
			if (!repeated.contains(num)) {
				unique.add(num);
			}
			repeated.add(num);		}

		System.out.println("unique element" + unique);
	}
}
