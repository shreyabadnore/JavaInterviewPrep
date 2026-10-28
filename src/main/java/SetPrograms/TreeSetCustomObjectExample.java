package SetPrograms;

import java.util.Comparator;
import java.util.TreeSet;

class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// toString for printing Employee object
	@Override
	public String toString() {
		return "Employee{id=" + id + ", name='" + name + "'}";
	}
}

public class TreeSetCustomObjectExample {

	public static void main(String[] args) {
		// Step 2: Create a Comparator (sorting by id)
		Comparator<Employee> idComparator = (e1, e2) -> Integer.compare(e1.id, e2.id);

		// Step 3: Create TreeSet with comparator
		TreeSet<Employee> employees = new TreeSet<>(idComparator);

		// Step 4: Add Employees
		employees.add(new Employee(103, "Alice"));
		employees.add(new Employee(101, "Bob"));
		employees.add(new Employee(105, "Charlie"));
		employees.add(new Employee(102, "David"));

		// Print Employees sorted by id
		System.out.println("Employees sorted by ID:");
		for (Employee e : employees) {
			System.out.println(e);
		}

		// Step 5: Sorting by Name instead (another comparator)
		Comparator<Employee> nameComparator = (e1, e2) -> e1.name.compareTo(e2.name);

		TreeSet<Employee> employeesByName = new TreeSet<>(nameComparator);

		employeesByName.add(new Employee(103, "Alice"));
		employeesByName.add(new Employee(101, "Bob"));
		employeesByName.add(new Employee(105, "Charlie"));
		employeesByName.add(new Employee(102, "David"));

		System.out.println("\nEmployees sorted by Name:");
		for (Employee e : employeesByName) {
			System.out.println(e);
		}
	}
}
	
	
	




