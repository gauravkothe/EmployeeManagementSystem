package employee.management.system.pojo;

public class Employee extends Person {
	private int salary;
	private String designation;
	private String department;
	private int dateOfJoining;
	private int leaves;
	private String locationOfCompany;

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

}
