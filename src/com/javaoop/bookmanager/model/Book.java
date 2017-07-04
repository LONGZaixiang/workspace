package com.javaoop.bookmanager.model;

public class Book {
	public int id; //该属性不能再类外部获取到 使用private
	public String name;
	public int status =0; //0是借出 1是未借出
	
	public void changeStatus(){
		
//		if(this.status==0){this.status=1;}
//		else this.status=1;
		
		this.status^=1;
		System.out.println("图书状态修改成功！");
	}
	
	public void showMe(){
		
		System.out.println("图书id:"+this.id+"\t图书名称："+this.name+"\t状态"+"\t"+(this.status==0?"未借出":"借出"));
	}
	
	public void showId(){
	
	System.out.println("方法内调用id属性"+this.id);
}
}
