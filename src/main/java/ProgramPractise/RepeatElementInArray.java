package ProgramPractise;

public class RepeatElementInArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,7,8};
		int arr_size=arr.length;
		repeatElement(arr,arr_size);
		
	
	}
	
	public static void repeatElement(int arr[], int size) {
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]+ "is the repeated number");
				}
			}
		}
		
	}

}
