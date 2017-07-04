package Demo;

public class Demo06 {
	public static void main(String[] args) {

		int _int = 11;
		Demo06 d = new Demo06();

		d.changeInt(11);
		System.out.println("使用完之后，int值变为了" + _int); // 11
		Student stu =new Student();
		stu.age=24;
		d.changeAge(stu);
		System.out.println("使用完之后为："+stu.age);//25
	}

	public void changeInt(int _int) {
		System.out.println("你传进来的int数字是" + _int);// 11
		_int *= 2;
		System.out.println("现在的int是" + _int);// 22

	}
	public void changeAge(Student stu){
		
		System.out.println("你传进来的学员年龄是"+stu.age);//24
		stu.age++;
		System.out.println("修改后年龄是"+stu.age);//25
	}
	 
}
