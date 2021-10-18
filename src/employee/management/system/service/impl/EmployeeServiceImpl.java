 package employee.management.system.service.impl;

import java.util.UUID;
import employee.management.system.enums.BloodGroup;
import employee.management.system.enums.Gender;
import employee.management.system.pojo.Address;
import employee.management.system.pojo.Company;
import employee.management.system.pojo.Employee;
import employee.management.system.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee addEmployee(Company company, String employeeName, int age, UUID adharId, Address address,
			BloodGroup bloodgroup, Gender gender, int salary, String designation, String department, int dateOfJoining,
			int leaves, String locationOfCompany, int employeeId) {
		Employee e1 = new Employee(company, employeeName, age, adharId, address, bloodgroup, gender, salary,
				designation, department, dateOfJoining, leaves, locationOfCompany, employeeId);
		return e1;
	}

	@Override
	public Employee removeEmployeeId(int EmployeeId) {
		return null;

	}

}
 