package ProgramPractise;

public class ReverseFirstAndLastDigitUsingstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12345;
		
		char[] ch=String.valueOf(num).toCharArray();
		
		char temp=ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=temp;
		
		System.out.println(new String(ch));
		

	}

}
