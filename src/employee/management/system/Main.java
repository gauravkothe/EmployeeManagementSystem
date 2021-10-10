package employee.management.system;

import employee.management.system.enums.BloodGroup;
import employee.management.system.enums.Designation;
import employee.management.system.enums.Gender;
import employee.management.system.pojo.Person;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();
		Person p2 = new Person("gk", 31);
		System.out.println(p1.getName());
		System.out.println(p2.getName());

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

	}

}