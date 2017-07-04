package practise;

public class exercise01 {

	public static void main(String[] args) {
		
		Student stu=new Student();
		
		stu.name="小明";
		stu.age=10;
		stu._class="一班";
		stu.hobby="篮球";
		
		Teacher teacher=new Teacher();
		teacher.name="王老师";
		
		teacher.professional="计算机";
		teacher.teachAge=5;
		teacher.whichClass="使用java语言开发";
		
		System.out.println(""+stu.name);
		System.out.println("年龄："+stu.age);
		System.out.println("就读于："+stu._class);
		System.out.println("兴趣爱好:"+stu.hobby);
		System.out.println("\n"+teacher.name);
		System.out.println("专业方向:"+teacher.professional);
		System.out.println("教授课程:"+teacher.whichClass);
		System.out.println("教龄："+teacher.teachAge);
		//stu.showMe();
		
	}
	
	
	
	
	
}
