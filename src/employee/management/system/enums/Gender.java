package employee.management.system.enums;

public enum Gender {
	Male, Female;

	public static Gender personsex(String code) {
		for (Gender g : values()) {
			if (g.name().equals(code))
				return g;
		}
		return null;
	}

}