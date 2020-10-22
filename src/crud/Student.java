package crud;

public class Student{


	private String name,email,password,country;
	
	
	public Student(String name, String email, String password, String country) {
	
		
		this.name = name;
		this.email = email;
		this.password = password;
		this.country = country;
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
