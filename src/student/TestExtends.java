package student;

public class TestExtends {
	public static void main(String[] args) {
		Student student=new Student("刘嘉欣",20,"本科");
		System.out.println(student.show());
		
		Undergraduate undergraduate=new Undergraduate("刘嘉欣",20,"本科","软件工程");
		System.out.println(undergraduate.show());
		
		Graduate graduate=new Graduate("刘嘉欣",20,"研究生","软件");
		System.out.println(graduate.show());
	}
}
