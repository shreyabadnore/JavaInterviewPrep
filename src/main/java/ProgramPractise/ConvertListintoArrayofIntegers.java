package ProgramPractise;

import java.util.Arrays;
import java.util.List;

public class ConvertListintoArrayofIntegers {

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,4);	
		int[] array=new int[list.size()];	
		for(int i=0; i<list.size(); i++) {
			array[i]=list.get(i);
		}	
		System.out.println(Arrays.toString(array));

	}

}
