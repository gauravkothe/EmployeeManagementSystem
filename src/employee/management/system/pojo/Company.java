package employee.management.system.pojo;

import java.util.ArrayList;

public class Company {
	private int name;
	private String availablelocation;
	private String foundername;
	private ArrayList<Employee> employees;
	private ArrayList<Labour> labours;

	public Company(int name, String availablelocation, String foundername, ArrayList<Employee> employees,
			ArrayList<Labour> labours) {
		this.name = name;
		this.availablelocation = availablelocation;
		this.foundername = foundername;
		this.setEmployees(employees);
		this.setLabours(labours);
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public String getAvailablelocation() {
		return availablelocation;
	}

	public void setAvailablelocation(String availablelocation) {
		this.availablelocation = availablelocation;
	}

	public String getFoundername() {
		return foundername;
	}

	public void setFoundername(String foundername) {
		this.foundername = foundername;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}

	public ArrayList<Labour> getLabours() {
		return labours;
	}

	public void setLabours(ArrayList<Labour> labours) {
		this.labours = labours;
	}

	public String toString() {
		return "Company[name=" + name + "availablelocation=" + availablelocation + "foundername=" + foundername + "]";
	}

}
