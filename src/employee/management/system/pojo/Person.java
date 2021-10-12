package employee.management.system.pojo;

import java.util.UUID;

import employee.management.system.enums.BloodGroup;
import employee.management.system.enums.Gender;

public class Person {
	private String name;
	private int age;
	private UUID adharId;
	private Address address;
	private BloodGroup bloodgroup;
	private Gender gender;

	public Person() {
		System.out.println("Default constructor");

	}

	public Person(String name, int age, UUID adharId, Address address, BloodGroup bloodgroup, Gender gender) {
		this.name = name;
		this.age = age;
		this.adharId = adharId;
		this.address = address;
		this.bloodgroup = bloodgroup;
		this.gender = gender;
	}

	public String toString() {
		return "Person [name=" + name + ",age=" + age + "Adhar id=" + adharId + "Address=" + address + "bloodgroup="
				+ bloodgroup + "gender=" + gender + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAdharId(UUID adharId) {
		this.adharId = adharId;

	}

	public UUID getAdharId() {
		return adharId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setBloodGroup(BloodGroup bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	BloodGroup getBloodGroup() {
		return bloodgroup;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	Gender getGender() {
		return gender;
	}

}
