package workshop.person.entity;

public class PersonEntity {
	private String name;
	private char gender;
	private String ssn;
	private String address;
	private String phone;
	
	public PersonEntity() {
		
	}
	public PersonEntity(String name, String ssn, String address, String phone) {
		setName(name);
		setSsn(ssn);
		setAddress(address);
		setPhone(phone);
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
		if (ssn.charAt(6) == '1' || ssn.charAt(6) == '3') {
			setGender('³²');
		} else {
			setGender('¿©');
		}
		
	}
	public String getSsn() {
		return ssn;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
}
