package Demo;

public class Demo04 {
	public static void main(String[] args) {
		
		
		
		Student stu1 = new Student();
		stu1.age=16;
		stu1.name="哈喽";
		Student stu2 =new Student();
		stu2=stu1;
		
		stu1.age=61;
		System.out.println(stu2.age);
		System.out.println(stu2.name);
		
		
	}
}
