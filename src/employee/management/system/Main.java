    package employee.management.system;

import java.util.ArrayList;

import employee.management.system.pojo.Company;
import employee.management.system.pojo.Employee;
import employee.management.system.pojo.Labour;
import employee.management.system.service.impl.CompanyServiceImpl;
import employee.management.system.service.impl.EmployeeServiceImpl;
import employee.management.system.service.impl.LabourServiceImpl;

public class Main {

	public static void main(String[] args) {

		// 1) CompanyService object:
		CompanyServiceImpl csi = new CompanyServiceImpl(); // object of CompanyServiceImpl

		Company tribugs = csi.startCompany("Tribugs", "Nagpur", "Dharmendra", new ArrayList<Employee>(),
				new ArrayList<Labour>());
		System.out.println(tribugs);

		Company obj1 = csi.startCompany("Persistant", "Pune", "Suchita", new ArrayList<Employee>(),
				new ArrayList<Labour>());
		System.out.println(obj1);

		// 2) Add EmployeeService Object:

		EmployeeServiceImpl esi = new EmployeeServiceImpl(); // object of EmployeeServiceImpl

		Employee ea = esi.addEmployee(tribugs, "Gaurav", 31, null, null, null, null, 35000, "Developer",
				"JavaDeveloper", 12 - 12 - 2020, 12, "Pune", 1012);

		System.out.println(ea);
  
		// 3) Add LabourService object:

		LabourServiceImpl lsi = new LabourServiceImpl();

		Labour lb = lsi.addlabour("Harry", 24, null, null, null, null, 500, "Cafateria", "Pune", 1014);
		System.out.println(lb);

		ArrayList<Integer> labourId = new ArrayList<Integer>(); 
		labourId.add(1012);
		labourId.add(1014);
	
	}

} 