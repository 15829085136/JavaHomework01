package student;

public class TestExtends {
	public static void main(String[] args) {
		Student student=new Student("������",20,"����");
		System.out.println(student.show());
		
		Undergraduate undergraduate=new Undergraduate("������",20,"����","�������");
		System.out.println(undergraduate.show());
		
		Graduate graduate=new Graduate("������",20,"�о���","���");
		System.out.println(graduate.show());
	}
}
