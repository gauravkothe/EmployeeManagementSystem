package employee.management.system.pojo;

public class Labour extends Person {
	private int perdayrate;
	private String department;
	private String companylocation;

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

}
