 package employee.management.system.pojo;

public class Address {
	private int pin;
	private String city;
	private String area; 
	private String landmark;
	private String state;
	private String country;

	public Address(int pin, String city, String area, String landmark, String state, String country) {
		this.pin = pin;
		this.city = city;
		this.area = area;
		this.landmark = landmark;
		this.state = state;
		this.country = country;
	}

	public String toString() {
		return "Company[pin=" + pin + "city=" + city + "area=" + area + "landmark=" + landmark + "state=" + state
				+ "country=" + country + "]";

	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public int getPin() {
		return pin;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return country;

	}
}
