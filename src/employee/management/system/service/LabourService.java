package employee.management.system.service;

import java.util.UUID;

import employee.management.system.enums.BloodGroup;
import employee.management.system.enums.Gender;
import employee.management.system.pojo.Address;
import employee.management.system.pojo.Labour;

public interface LabourService {
	public Labour addlabour(String Labourname, int Age, UUID AdharId, Address Address, BloodGroup BloodGroup,
			Gender Gender, int Perdayrate, String Department, String Companylocation, int LabourId);

}
