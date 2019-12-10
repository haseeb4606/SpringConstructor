package constructorPractic;

public class Biography {

	String firstName;
	String lastName;
	String gender;
	String email;
	long phone;

	public Biography(String firstName, String lastName, String gender, String email, long phone) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.phone = phone;

	}

	public void show() {

		System.out.println("my Firstname is:" + " " + firstName + "  " + "my last name is:" + " " + lastName + " "
				+ gender + " " +"my emaild address is:"+" "+ email + " " +"phone number is:"+" "+ phone);
	}

}
