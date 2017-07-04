package Demo;

public class Student {

	public String name;//声明了一个姓名的属性 属性的权限是公共的 数据类型是String 属性名为name
	public int age=16;//声明了一个年龄的属性 属性的权限是公共的 数据类型是int 并给了一个初始值16
	/*
	 * 对于属性来说 java也会默认给初始值 和数组相同
	 * 基本数据类型为 0
	 * 引用数据类型为null
	 * 
	 * */
//	public Student(String name,int age){
//		this.name=name;
//		this.age=age;
//		
//	}
	
	
	
	
	public String get_name(){
		
		return this.name;
	}
	public int get_age(){
		return this.age;
	}
	
	
	
	
}
