package ProgramPractise;

import java.util.PriorityQueue;

public class KthLargestElementInUnsortedArray {

	public static void main(String[] args) {
		int[] arr= {1,5,6,3,1,9,6,4,0,1};
		
		int k=3;
		
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		
		for(int n:arr) {
			queue.add(n);
			if(queue.size()>k) {
				queue.poll();
			}
		}
		
		System.out.println(queue.peek());
	}

}
