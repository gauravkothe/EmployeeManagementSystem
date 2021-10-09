
import java.util.UUID;

import employee.management.system.enums.BloodGroup;
import employee.management.system.enums.Gender;

public class Person {
	String name;
	int age;
	UUID adharId;
	Address address;
	BloodGroup bloodGroup;
	Gender gender;

	void setName(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setAge(int age) {
		this.age = age;
	}

	int getAge() {
		return age;
	}

	void setAdharId(UUID adharId) {
		this.adharId = adharId;

	}

	UUID getAdharId() {
		return adharId;
	}

	void setAddress(Address address) {
		this.address = address;
	}

	Address getAddress() {
		return address;
	}

	void setBloodGroup(BloodGroup BloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	void setGender(Gender Gender) {
		this.gender = Gender;
	}

	Gender getGender() {
		return gender;
	}
}
