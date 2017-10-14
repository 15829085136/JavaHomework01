package student;

public class Student {
	 String name;
	 int age;
	 String education;
	public Student(String name, int age, String education) {
		this.name = name;
		this.age = age;
		this.education = education;
	}
	public String show() {
		return "Student [name=" + name + ", age=" + age + ", education=" + education + "]";
	}
	
	

}
