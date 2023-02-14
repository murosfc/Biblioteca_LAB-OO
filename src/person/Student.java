package person;

public class Student extends Person{
	private String registrationNumber;
	
	public Student(long id, String name, String registrationNumber) {
		super(id, name);
		this.registrationNumber = registrationNumber;
	}	

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		if (registrationNumber ==  null || registrationNumber.trim().isEmpty())
			throw new IllegalArgumentException("The registration number must be provided");
		this.registrationNumber = registrationNumber;
	}
}
