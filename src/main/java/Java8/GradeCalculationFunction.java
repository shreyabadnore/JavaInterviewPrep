package Java8;

import java.util.function.Function;

public class GradeCalculationFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Function to calculate grade based on marks
        Function<Integer, String> gradeFunction = marks -> {
            if (marks >= 90)
                return "A";
            else if (marks >= 75)
                return "B";
            else if (marks >= 50)
                return "C";
            else
                return "Fail";
        };

        // Test cases
        System.out.println("Marks: 95 → Grade: " + gradeFunction.apply(95));
        System.out.println("Marks: 80 → Grade: " + gradeFunction.apply(80));
        System.out.println("Marks: 65 → Grade: " + gradeFunction.apply(65));
        System.out.println("Marks: 40 → Grade: " + gradeFunction.apply(40));

	}

}
