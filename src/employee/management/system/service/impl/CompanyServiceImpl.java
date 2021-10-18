    package employee.management.system.service.impl;

import java.util.ArrayList;
import java.util.UUID;

import employee.management.system.enums.BloodGroup;
import employee.management.system.enums.Gender;
import employee.management.system.pojo.Address;
import employee.management.system.pojo.Company;
import employee.management.system.pojo.Employee;
import employee.management.system.pojo.Labour;
import employee.management.system.service.CompanyService;

public class CompanyServiceImpl implements CompanyService {
	// Start Company:
	@Override
	public Company startCompany(String CompanyName, String AvailableLocation, String FounderName,
			ArrayList<Employee> Employees, ArrayList<Labour> Labours) {

		Company cl = new Company(CompanyName, AvailableLocation, FounderName, Employees, Labours);
		return cl;
	}
	// Add employee statement:
	

	public Employee addEmployee(Company company, Employee e) {
		company.getEmployees().add(e);
		return e;

	}
	// Remove EmployeeId:
	
	
	public Employee removeEmployeeId(Company company,int EmployeeId) {
		ArrayList<Integer> empl= new ArrayList<Integer>();
		return null;
		
		
	 
	
		
	}
	
	  
	

	// Add Labour Statement:

	public Labour addlabour(Company campany, Labour l) {
		campany.getLabours().add(l);
		return l;
	}

	

}
