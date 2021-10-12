package employee.management.system.pojo;

import java.util.UUID;

public class Departmet {
	private UUID id;
	private int numberofemployee;
	private String name;

	public Departmet(UUID id, int numberofemployee, String name) {
		this.id = id;
		this.numberofemployee = numberofemployee;
		this.name = name;
	}

	public String toString() {
		return "Person[id=" + id + "numberofemployee=" + numberofemployee + "name=" + name + "]";
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public int getNumberofemployee() {
		return numberofemployee;
	}

	public void setNumberofemployee(int numberofemployee) {
		this.numberofemployee = numberofemployee;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
