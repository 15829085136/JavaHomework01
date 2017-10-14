package student;

public class Undergraduate extends Student{
	private String specialty;

	public Undergraduate(String name, int age, String education, String specialty) {
		super(name, age, education);
		this.specialty = specialty;
	}

	
	public String show() {
		return "Undergraduate [specialty=" + specialty + ", name=" + name + ", age=" + age + ", education=" + education
				+ "]";
	}
	
	

}
