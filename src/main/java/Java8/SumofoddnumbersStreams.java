package Java8;

import java.util.Arrays;
import java.util.List;

public class SumofoddnumbersStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list=Arrays.asList(11, 22, 33, 44, 55);
		
		int num=list.stream().filter(n->n%2!=0).reduce(0,Integer::sum);
		
		System.out.println(num);

	}

}
