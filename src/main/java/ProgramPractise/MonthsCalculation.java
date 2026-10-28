package ProgramPractise;

import java.util.ArrayList;
import java.util.List;

public class MonthsCalculation {

	public static void main(String []args) {
		
        String months=getMonth(3); 
        System.out.println(months);
    }

    public static String getMonth(int month) {
        if (month < 1 || month > 12) {
            return "Please pass the value in the range of 1 to 12";
        }

        List<String> list = new ArrayList<>();
        list.add("January");
        list.add("February");
        list.add("March");
        list.add("April");
        list.add("May");
        list.add("June");
        list.add("July");
        list.add("August");
        list.add("September");
        list.add("October");
        list.add("November");
        list.add("December");

        return list.get(month - 1).substring(0,3).toUpperCase();  
    }
}