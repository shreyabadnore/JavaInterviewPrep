package ProgramPractise;

public class SecondLargestNumberInString {
	
	public static int findSecondLargest(String str) {
		int largest=-1, second_Largest=-1;
		
		for(char ch: str.toCharArray()) {	//
			if(Character.isDigit(ch)) {		//
				int num=ch-'0';				//
				if(num>largest) {
					second_Largest=largest;
					largest=num;
				}
				else if(num>second_Largest && num!=largest) {
					second_Largest=num;
				}
			}
		}
		
		return second_Largest;
	}

	public static void main(String[] args) {
		
		String str="Agdf135FDg";
		
		int result=findSecondLargest(str);
		System.out.println(result);

	}

}
