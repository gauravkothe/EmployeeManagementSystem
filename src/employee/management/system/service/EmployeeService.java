package employee.management.system.service;

import java.util.UUID;

import employee.management.system.enums.BloodGroup;
import employee.management.system.enums.Gender;
import employee.management.system.pojo.Address;
import employee.management.system.pojo.Company;
import employee.management.system.pojo.Employee;

public interface EmployeeService {

	public Employee addEmployee(Company company, String employeeName, int age, UUID adharId, Address address,
			BloodGroup bloodgroup, Gender gender, int salary, String designation, String department, int dateOfJoining,
			int leaves, String locationOfCompany, int employeeId);

	public Employee removeEmployeeId(int EmployeeId);
}
