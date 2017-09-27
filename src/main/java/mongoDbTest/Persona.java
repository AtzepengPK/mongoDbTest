package mongoDbTest;

import org.springframework.data.annotation.Id;

public class Persona {

	@Id
	public String id;

	public String firstName;
	public String lastName;
	public int age;

	public Persona() {
	}

	public Persona(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public Persona(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	
	@Override
	public String toString() {
		return String.format("Customer[id=%s, firstName='%s', lastName='%s' age='%s']", id, firstName, lastName, age);
	}
}
