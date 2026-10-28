package Java8;

import java.util.function.BiFunction;
import java.util.function.Function;

class Employee {
    String name;
    double baseSalary;

    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }
}

public class EmployeeSalaryCalculationFunctionBiFunction {

	public static void main(String[] args) {

    
        BiFunction<Employee, Double, Double> calculateSalary = (emp, bonusPercent) ->
                emp.baseSalary + (emp.baseSalary * bonusPercent / 100);

        Function<Double, String> formatSalary = salary ->
                String.format("Total Salary (after bonus): ₹%.2f", salary);

        BiFunction<Employee, Double, String> fullCalculation =
                calculateSalary.andThen(formatSalary);

      
        Employee emp1 = new Employee("Shreya Badnore", 80000);

        System.out.println("Employee: " + emp1.name);
        System.out.println(fullCalculation.apply(emp1, 10.0));  // 10% bonus
	}

}
