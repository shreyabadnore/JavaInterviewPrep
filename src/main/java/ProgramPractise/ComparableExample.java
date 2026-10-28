package ProgramPractise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<>();

		Employee e1 = new Employee("Rahul", 55000, 28, "Pune");
		Employee e2 = new Employee("Kartik", 55000, 28, "Pune");
		Employee e3 = new Employee("Amit", 45000, 26, "Nagpur");
		Employee e4 = new Employee("Sneha", 55000, 26, "Delhi");
		Employee e5 = new Employee("Vikram", 40000, 32, "Pune");
		Employee e6 = new Employee("Neha", 75000, 29, "Pune");

		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		employee.add(e4);
		employee.add(e5);
		employee.add(e6);
		
		System.out.println("Before sorting "+employee);
		
		Collections.sort(employee);
		
		System.out.println("After sorting "+employee);
		
		Collections.reverse(employee);
		
		System.out.println("Reverse "+employee);
		
		
		
		

	}

}
