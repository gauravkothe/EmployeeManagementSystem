package employee.management.system.enums;


public enum BloodGroup {
	O_POSITIVE, O_NEGATIVE, A_POSITIVE, A_NEGATIVE, B_POSITIVE, B_NEGATIVE, AB_POSTIVE, AB_NEGATIVE;

	public static BloodGroup personBlood(String bgroup) {

		for (BloodGroup bg : values()) {
			if (bg.name() == bgroup)
				return bg;
		}
		return null;
	}
}