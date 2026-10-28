package Java8;

import java.util.*;
import java.util.stream.Collectors;

class Employee1 {
	String name;
	String dept;
	int salary;

	Employee1(String name, String dept, int salary) {
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public String toString() {
		return name + "-" + salary;
	}
}

public class GroupByDepartmentGroupingBy {
	public static void main(String[] args) {

		List<Employee1> employees = Arrays.asList(new Employee1("John", "IT", 50000),
				new Employee1("Alex", "HR", 30000), new Employee1("Sam", "IT", 60000),
				new Employee1("Riya", "Finance", 45000), new Employee1("Neha", "HR", 35000));

		Map<String, List<Employee1>> groupByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee1::getDept));

		System.out.println(groupByDept);

		Map<String, Long> departmentCount = employees.stream()
				.collect(Collectors.groupingBy(Employee1::getDept, Collectors.counting()));

		System.out.println(departmentCount);

		Map<String, Integer> totalSalary = employees.stream()
				.collect(Collectors.groupingBy(Employee1::getDept, Collectors.summingInt(e -> e.salary)));

		System.out.println(totalSalary);

		Map<String, Optional<Employee1>> highestSalary = employees.stream().collect(
				Collectors.groupingBy(Employee1::getDept, Collectors.maxBy(Comparator.comparingInt(e -> e.salary))));

		System.out.println(highestSalary);

		Map<String, List<Employee1>> salaryRange = employees.stream().collect(Collectors.groupingBy(e -> {
			if (e.salary <= 40000)
				return "Low Salary";
			else if (e.salary <= 55000)
				return "Medium Salary";
			else
				return "High Salary";
		}));

		System.out.println(salaryRange);

	}
}
