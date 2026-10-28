package ProgramPractise;

public class Employee implements Comparable<Employee> {
	String name;
	int salary;
	int age;
	String city;

	public Employee(String name, int salary, int age, String city) {
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.city = city;

	}

	public int compareTo(Employee other) {
		int result = Integer.compare(this.salary, other.salary);
		
		if (result==0) {
			int res=this.name.compareTo(other.name);
			return res;
		}
	
			return result;
		

	}

	@Override
	public String toString() {
		return "Employee{salary=" + salary + ", name=" + name + ", age="+age+", city="+city+"}";
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	public String getName() {
		return name;
	}

}
