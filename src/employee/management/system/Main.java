package employee.management.system;

import java.util.UUID;

import employee.management.system.enums.BloodGroup;
import employee.management.system.enums.Designation;
import employee.management.system.enums.Gender;
import employee.management.system.pojo.Address;
import employee.management.system.pojo.Employee;
import employee.management.system.pojo.Labour;
import employee.management.system.pojo.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		// Person p2 = new Person("gk", 31);
		System.out.println(p1.getName());
		// System.out.println(p2.getName());

		Designation d1 = Designation.positionOfCompany(3);
		System.out.println(Designation.Founder.position);
		System.out.println(Designation.Intern.position);
		System.out.println(Designation.positionOfCompany(2));
		System.out.println(Designation.TeamLead.toString());
		System.out.println(d1);

		BloodGroup b1 = BloodGroup.personBlood("A_POSITIVE");
		System.out.println(BloodGroup.AB_NEGATIVE.toString());
		System.out.println(Designation.TeamLead.toString());
		System.out.println(b1);

		Gender g1 = Gender.Male;
		System.out.println(Gender.personsex("Female"));
		System.out.println(g1);

		Person p = new Person();
		System.out.println(p);

		// Employee e1 = new Employee("Gaurav", 31, "3456", "pune", "O_positive",
		// "Male", 20000, "SrDeveloper", "Coding",
		// 012 / 12 / 2020, 10, "pune", 012345);
		// System.out.println(e1);

		UUID uuid = UUID.randomUUID();
		Address add = new Address(440008, "Nagpur", "Jagnade chowk", "KDK college", "Maharashtra", "India");
		BloodGroup.personBlood("O_positive");
		Gender.personsex("Male");
		Labour l2 = new Labour("Kothe", 31, uuid, add, BloodGroup.personBlood("O_positive"), Gender.personsex("Male"),
				1000, "Quality", "Nagpur", 1012);
		System.out.println(l2);
	}
}