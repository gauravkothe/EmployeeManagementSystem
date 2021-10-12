package employee.management.system.enums;

public enum Designation {
	Founder(0), Manager(1), TeamLead(2), Developer(3), JuniorDeveloper(4), Intern(5);

	public final int position;

	private Designation(int position) {
		// TODO Auto-generated constructor stub
		this.position = position;
	}

	public static Designation positionOfCompany(int position) {
		for (Designation dg : values()) {
			if (dg.position == position)
				return dg;
		}
		return null;
	}

	static Designation numberOfPosition(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	static Designation position(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}