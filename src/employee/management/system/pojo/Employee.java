package employee.management.system.pojo;

public class Employee extends Person {
	int salary;
	String designation;
	String department;
	int dateOfJoining;
	int leaves;
	String location;

	void setSalary(int salary) {
		this.salary = salary;

	}

	int getSalary() {
		return salary;

	}

}
