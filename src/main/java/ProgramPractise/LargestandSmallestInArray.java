package ProgramPractise;

public class LargestandSmallestInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8,9};
		int min=a[0];
		int max=a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
			else if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("largest element is"+max);
		System.out.println("smallest element is"+min);
	
	}

}
