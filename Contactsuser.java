
public class Contactsuser {
	String userFirstName;
	String userLastName;
	String address;
	String city;
	String state;
	String mailId;
	long pinCode;
	long phoneNum;

	Contactsuser(String firstName, String lastName, String address, String city, String state, long pinCode,
			long phoneNumber, String mailId) {
		this.userFirstName = firstName;
		this.userLastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
		this.phoneNum = phoneNumber;
		this.mailId = mailId;
	}

	public void setFirstName(String firstName) {
		this.userFirstName = firstName;
	}

	public void setLastName(String lastName) {
		this.userLastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setEmail(String email) {
		this.mailId = email;
	}

	public String getFirstName() {
		return userFirstName;
	}

	public String getLastName() {
		return userLastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public void setZip(int zip) {
		this.pinCode = zip;
	}

	public long getZip() {
		return pinCode;
	}

	public void setPhn(int phn) {
		this.phoneNum = phn;
	}

	public long getPhn() {
		return phoneNum;
	}

	public String getEmail() {
		return mailId;
	}

}