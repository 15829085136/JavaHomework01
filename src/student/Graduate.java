package student;

public class Graduate extends Student{
	private String direction;

	public Graduate(String name, int age, String education, String direction) {
		super(name, age, education);
		this.direction = direction;
	}

	public String show() {
		return "Graduate [direction=" + direction + ", name=" + name + ", age=" + age + ", education=" + education
				+ "]";
	}
	
}
