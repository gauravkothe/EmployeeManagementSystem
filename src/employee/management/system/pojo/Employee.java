package employee.management.system.pojo;

import java.util.UUID;

import employee.management.system.enums.BloodGroup;
import employee.management.system.enums.Gender;

public class Employee extends Person {
	private int salary;
	private String designation;
	private String department;
	private int dateOfJoining;
	private int leaves;
	private String locationOfCompany;
	private int employeeId;

	public Employee(String name, int age, UUID adharId, Address address, BloodGroup bloodgroup, Gender gender,
			int salary, String designation, String department, int dateOfJoining, int leaves, String locationOfCompany,
			int employeeId) {

		super(name, age, adharId, address, bloodgroup, gender);

		this.salary = salary;
		this.designation = designation;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.leaves = leaves;
		this.locationOfCompany = locationOfCompany;
		this.employeeId = employeeId;

	}

	public String toString() {
		return "Employee [salary=" + salary + ", designation=" + designation + ", department=" + department
				+ ", dateOfJoining=" + dateOfJoining + ", leaves=" + leaves + ", locationOfCompany=" + locationOfCompany
				+ ", employeeId=" + employeeId + "]";
	}

	public void setSalary(int salary) {
		this.salary = salary;

	}

	public int getSalary() {
		return salary;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return department;

	}

	public void setDateOfJoining(int dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public int getDateOfJoining() {
		return dateOfJoining;
	}

	public void setLeaves(int leaves) {
		this.leaves = leaves;

	}

	public int getLeaves() {
		return leaves;
	}

	public void setLocationOfCompany(String locationOfCompany) {
		this.locationOfCompany = locationOfCompany;
	}

	public String getLocationOfCompany() {
		return locationOfCompany;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getEmployeeId() {
		return employeeId;

	}

}
