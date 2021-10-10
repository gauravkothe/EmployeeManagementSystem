package employee.management.system.pojo;

import java.util.UUID;

public class Departmet {
	private UUID id;
	private int numberofemployee;
	private String name;

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
