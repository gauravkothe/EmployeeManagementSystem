package employee.management.system.pojo;

import java.util.UUID;

import employee.management.system.enums.BloodGroup;
import employee.management.system.enums.Gender;

public class Labour extends Person {
	private int perdayrate;
	private String department;
	private String companylocation;
	private int labourId;

	public Labour(String name, int age, UUID adharId, Address address, BloodGroup bloodgroup, Gender gender,
			int perdayrate, String department, String companylocation, int labourId) {

		super(name, age, adharId, address, bloodgroup, gender);
		this.perdayrate = perdayrate;
		this.department = department;
		this.companylocation = companylocation;
		this.labourId = labourId;
	}

	public String toString() {
		return "Labour[perdaterate=" + perdayrate + "department=" + department + "companylocation=" + companylocation
				+ "labourId=" + labourId + "]";
	}

	public int getPerdayrate() {
		return perdayrate;
	}

	public void setPerdayrate(int perdayrate) {
		this.perdayrate = perdayrate;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCompanylocation() {
		return companylocation;
	}

	public void setCompanylocation(String companylocation) {
		this.companylocation = companylocation;
	}

	public void setLabourId(int labourId) {
		this.labourId = labourId;
	}

	public int getLabourId() {
		return labourId;
	}

}
