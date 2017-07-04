package com.javaoop.bookmanager.controller;

import java.util.Scanner;

import com.javaoop.bookmanager.model.BookManager;
import com.javaoop.bookmanager.view.View;

public class Controller {
	public int ch = 0;
	public View view = new View();
	public BookManager bookManager = new BookManager();
	public String name;
	public Scanner scan = new Scanner(System.in);

	public void run() {
		
		
		do {
			view.showMenu();
			this.ch = scan.nextInt();
			this.choice();
		} while (this.ch != 0);

	}

	public void choice() {

		switch (this.ch) {
		case 1:
			System.out.println("显示图书列表");
			bookManager.showBooks();
			break;
		case 2:
			System.out.println("增加图书书名");
			name = scan.next();
			bookManager.addBookByName(name);
			break;
		case 3:
			System.out.println("请输入删除图书的id:");
			bookManager.deleteBookById(scan.nextInt());
			break;
		case 4:
			System.out.println("请输入需要修改状态的图书id：");
			bookManager.changeBookStatus(scan.nextInt());
			break;
		case 5:
			System.out.println("请输入需要查找图书的名称：");
			bookManager.findBookByName(scan.next());
			break;
		case 0:
			System.out.println("退出系统,欢迎使用");
			break;
		default:
			this.ch = 0;
		}

	}

}
