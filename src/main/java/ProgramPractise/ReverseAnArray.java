package ProgramPractise;

import java.util.Arrays;

public class ReverseAnArray {
	
	public static void reverse(int a[], int n) {
		int temp;
		
		for(int i=0; i<n/2; i++) {
			temp=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=temp;
		}
		System.out.println("Reverse of an Array is");
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int array[]= {10,20,30,40,50};
		reverse(array, array.length);

	}

}
