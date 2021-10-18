package employee.management.system.service.impl;

import java.util.UUID;

import employee.management.system.enums.BloodGroup;
import employee.management.system.enums.Gender;
import employee.management.system.pojo.Address;
import employee.management.system.pojo.Labour;
import employee.management.system.service.LabourService;

public class LabourServiceImpl implements LabourService {

	@Override
	public Labour addlabour(String Labourname, int Age, UUID AdharId, Address Address, BloodGroup BloodGroup,
			Gender Gender, int Perdayrate, String Department, String Companylocation, int LabourId) {
		Labour lb = new Labour(Labourname, Age, AdharId, Address, BloodGroup, Gender, Perdayrate, Department,
				Companylocation, LabourId);
		return lb;
	}
}
