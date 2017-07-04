package com.javaoop.bookmanager.model;

public class BookManager {

	
		public Book[] books= new Book[10];
		public int index =1;
		//1.遍历显示图书
		public void showBooks(){
			
			for(int i=0;i<books.length;i++)
			{
				if(books[i]!=null){
					books[i].showMe();
					
				}
				
				
			}
		}
		//2.添加图书
		public void addBookByName(String name){
			if(this.askNullIndex()<0)  //首先判断是否还有位置放书
			{
				System.out.println("书架已满 无法新增图书");
				
			}
			else 
			{
				Book book = new Book();  //实例化一本书
				book.id=this.index++;   //给数的id属性赋值
				book.name=name;    //给图书名字赋值
				this.books[this.askNullIndex()]=book;
				System.out.println("新增图书成功");
			}
			
		}
		//3.删除图书
		public void deleteBookById(int id){
			int index=-1;
			for(int i=0;i<books.length;i++)
			{
				if(books[i]!=null)
					if(books[i].id==id){//找到了书}
						index=i;
						break;
					}
					else
					{
						System.out.println("这本书不存在！");
					}	//没有这本书的存在
				
			}
			//遍历完成之后只要判断index变量
			if(index<0){
				
				System.out.println("这个id没有对应的图书");
			}
			else{
				//删除这本图书 但是图书必须是未借出
				if(this.askBookStatus(id)){
					books[index]=null; //将书架上的这个位置滞空
					System.out.println("图书删除成功！");
				}else{System.out.println("删除失败 ，请检查图书状态");}
				
			}
			
		}
		
		//4.修改图书状态
		public void changeBookStatus(int bookid){
			
			
				this.askBookById(bookid).changeStatus();
			
			
		}
		
		
		
		
		
		
		//5.查找图书
		public void findBookByName(String Name){
			boolean flag=false;
			for(Book book:books){
				
				if(book!=null)
					if(book.name.equals(Name)){
						System.out.println("查找的图书id是"+book.id);
						flag=true;
						break;
					}
					
			}
			if(flag){
				System.out.println("图书已找到。");
			}
			else{System.out.println("图书未找到！");}
		}
		
		
		//6.查找数组空下标
		public int askNullIndex(){
			int index=-1;//由于数组没有-1 如果返回-1的话说明书架满了
			
			for(int i=0;i<books.length;i++){
				if(books[i]==null){   //当查找到数组中空元素时 将空元素下标赋给index并退出循环
					index=i;	
					break;
					
				}
			}
			return index;//返回下标值
		}
		//7.判断借出状态的方法   public 权限修饰符  boolean 返回数据类型  askBookStatus 方法名称 （int id）形参
		public boolean askBookStatus(int id){
			//根据id查找到的图书的状态返回布尔值
			/*
			if(this.askBookById(id)!=null){
				return this.askBookById(id).status==0?true:false; //当图书状态为未借出时 返回真
			}*/
			
			for(int i=0;i<books.length;i++)
			{
				if(books[i]!=null)
				{
					if(books[i].status==0)
						return true;
				}
				
			}
		
			return false; 
			
		}
		//8.按id查询书
		public Book askBookById(int bookId){
			for(Book book:books){ //使用增强for循环遍历 图书数组 
				
				if (book!=null)//非空判断
					if(book.id==bookId)//当图书id和传入的图书id相等时返回这本书对象本身
						return book;
					
					
			}
			
			return null;//如果没有找到返回null
		}
		
		
		
		
		
		
	
}
