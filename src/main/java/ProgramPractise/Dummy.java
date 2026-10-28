package ProgramPractise;
import java.util.*;

public class Dummy {
public static void main(String[]args) {
	
	List<String> list=new ArrayList<String>();
	list.add("Rose");
	list.add("Lily");
	list.add("Sunflower");
	list.add("Poppy");
	list.add("Magnolia");
	
	Collections.sort(list);//sort the list
	
	System.out.println(list);//sorted list
	

	list.removeIf(name -> name.length()<5);
	
	System.out.println(list);
	
	
	/*
	 * String[] s="aaaaa".split("a"); System.out.println(s);
	 */
	
	/*
	 * String s = "selenium";
	 * 
	 * s.toUpperCase(); s.replace("selenium", "Java"); s.concat(" Test");
	 * 
	 * System.out.println(s);
	 */
	
	/*
	 * String s = "Java";
	 * 
	 * s = s.concat(" Selenium");
	 * 
	 * System.out.println(s);
	 * 
	 * s.toUpperCase();
	 * 
	 * System.out.println(s);
	 */
	
	String s=new String("Shreya");
	
	StringBuilder sb=new StringBuilder("Shreya");
	
	StringBuffer sbuf=new StringBuffer("Shreya");
	boolean f=s.equals(sb);
	
	System.out.println(f);
	System.out.println(sbuf);
	
	
	
	
}


}
