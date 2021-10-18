package employee.management.system.service;

import java.util.ArrayList;
import employee.management.system.pojo.Company;
import employee.management.system.pojo.Employee;
import employee.management.system.pojo.Labour;

public interface CompanyService {

	public Company startCompany(String CompanyName, String availablelocation, String foundername,
			ArrayList<Employee> employees, ArrayList<Labour> labours);

}
