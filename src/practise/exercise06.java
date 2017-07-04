package practise;

import java.util.Scanner;

public class exercise06 {
	Scanner scan =new Scanner(System.in);
	String[] arr=new String[5];
	public int addName(String name,int j){
		for(int i=0;i<arr.length;i++)
		{	
			if(arr[i]!=null){
			if(arr[i].equals(name))
			{
				System.out.println("已存在不能添加");
				return 0;
			}
			}
			
			
		}
		arr[j]=name;
		
		return 1;
	}
	public void showNames(){
		for(int i=0;i<arr.length;i++){
		System.out.print(""+arr[i]+"\t");}
		
	}
	public boolean searchName(int start,int end,String name){
		
		for(int i=start;i<end;i++)
			
		if(name.equals(arr[i]))
			return true;
		
		
		return false;
	}
	
	
	public boolean modifyName(String oldName,String newName){
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(oldName)){
				
				arr[i]=newName;
				return true;
			}
		}
		System.out.println("该学生不存在");
		return false;
		
	}
	public boolean deleteName(String name){
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(name)){
				
				for(int j=i;j<arr.length-i-1;j++)
					arr[j]=arr[j+1];
				arr[arr.length-1]="";
				return true;
			}
		}
		System.out.println("该学生不存在");
		return false;
	}
	
	
	
	public static void main(String[] args) {
		
		exercise06 stu=new exercise06();
		String oldName;
		for(int i=0;i<stu.arr.length;i++){
			System.out.println("请输入学生姓名：");
			if(stu.addName(stu.scan.next(),i)==0)
				i--;
			
		}
		
		
		stu.showNames();
		
		System.out.println("请输入要修改的学生名称");
		oldName=stu.scan.next();
		System.out.println("请输入其新的名称");
		stu.modifyName(oldName, stu.scan.next());
		stu.showNames();
		
		System.out.println("请输入要删除的学生名称");
		stu.deleteName(stu.scan.next());
		
		stu.showNames();
		stu.scan.close();
		
	}
	
	
	
	
}
