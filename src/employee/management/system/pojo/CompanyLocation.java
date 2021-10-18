package employee.management.system.pojo;

public class CompanyLocation {
	private Address address;
	private int numberofemployees;

	public CompanyLocation(Address address, int numberofemployee) {
		this.address = address;
		this.numberofemployees = numberofemployee;
	}

	public String toString() {
		return "Company[address=" + address + "numberofemployees=" + numberofemployees + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getNumberofemployees() {
		return numberofemployees;
	}

	public void setNumberofemployees(int numberofemployees) {
		this.numberofemployees = numberofemployees;
	}

}
 