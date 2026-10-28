package ProgramPractise;

import java.util.Arrays;

public class ArrayIsPallindrome {
	
	public static boolean isPallindrome(int[] arr) {
		
		int left=0, right=arr.length-1;
		while(left<right) {
			if(arr[left]!=arr[right]) {
				return false;
			}
			left++;
			right--;
			
			
		}
		return true;
	}
	
	public static void main (String [] args) { 
		
		int[] arr= {1,2,3,2,1};
		
		System.out.println("Array is"+Arrays.toString(arr));
		
		if(isPallindrome(arr)) {
			System.out.println("Array is Pallindrome");
		}
		else {
			System.out.println("Array is not Pallindrome");
		}
	}


	
}
