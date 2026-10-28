package ProgramPractise;

public class ArmstrongNumber {

	public static void main(String[] args) {
	int num=153;
	
	int original_number=num,result=0,remainder;
	
	while(original_number!=0) {
		remainder=original_number%10;
		result+=Math.pow(remainder, 3);
		original_number=original_number/10;	
		
	}
	
	if(result==num) {
		System.out.println("Number is armstrong");
	}
	else {
		System.out.println("number is not armstrong");
	}

	}

}
