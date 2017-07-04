package Demo;

import java.util.Scanner;

public class Demo05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str="";
		
		do{
			
			System.out.println("请输入姓名：");
			str=scan.next();
			System.out.println("请输入年龄：");
			int age=scan.nextInt();
			Student stu =new Student();
			stu.name=str;
			stu.age=age;
			if(!"n".equals(str))
				if(stu.age>=18){
					System.out.println(stu.name+"的票价是20元");
				}else
					System.out.println(stu.name+"的票价是0元");
			
		}while(!"n".equals(str));
		System.out.println("感谢使用");
		scan.close();
	}
	
	
	
}
